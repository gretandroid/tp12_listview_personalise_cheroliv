package com.example.tp12_listview_personalise;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
//    String[] items = {"mot1", "mot2", "mot3", "cemotestlong", "treslong"};

    String[] items={"Mauvais","Passable","Assez bien","Bien","Tres bien"};
    //Integer[] itemsRating={1, 2, 3, 4, 5};
    //ImageView star1,star2,star3,star4,star5;
    ListView list;
    //TextView resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListAdapter(new CustomAdapter(this,
               R.layout.stars,
    //            R.layout.row,
                R.id.result,
                items));


    }



    class CustomAdapter extends ArrayAdapter<String>{

        public CustomAdapter(@NonNull Context context,
                             int resource,
                             int textViewResourceId,
                             @NonNull String[] objects) {
            super(context, resource, textViewResourceId, objects);
        }
        public void clickStar(ImageView star, ArrayList<ImageView> vs,TextView resultat,String msg){
            star.setOnClickListener(view -> {
                int index=vs.indexOf(star);
                //int i=0;
                //int j=vs.size()-1;
                for(int i=0;i<=index;i++)
                    vs.get(i).setImageResource(android.R.drawable.star_big_on);
                for(int j=vs.size()-1;j>index;j--)
                    vs.get(j).setImageResource(android.R.drawable.star_big_off);
//                while(i<=index || j!=index){
//                    if(i<=index) {
//                        vs.get(i).setImageResource(android.R.drawable.star_big_on);
//                        i++;
//                    }
//                    if(j>index) {
//                        vs.get(j).setImageResource(android.R.drawable.star_big_off);
//                        j--;
//
//                    }
//                }



            resultat.setText(msg);



            });

        }


        @NonNull
        @Override
        public View getView(int position,
                            @Nullable View convertView,
                            @NonNull ViewGroup parent) {
            View view = super.getView(position, convertView, parent);

            ImageView star1,star2,star3,star4,star5;
            star1=view.findViewById(R.id.star1);
            star2=view.findViewById(R.id.star2);
            star3=view.findViewById(R.id.star3);
            star4=view.findViewById(R.id.star4);
            star5=view.findViewById(R.id.star5);
            TextView resultat=view.findViewById(R.id.result);

            //View[] views={star1,star2,star3,star4,star5};
            ArrayList<ImageView> v= new ArrayList<>();
            v.add(star1);
            v.add(star2);
            v.add(star3);
            v.add(star4);
            v.add(star5);

           clickStar(star1,v,resultat,"Mauvais");


//            star1.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    star1.setImageResource(android.R.drawable.star_big_on);
//
//                    star2.setImageResource(android.R.drawable.star_big_off);
//
//                    star3.setImageResource(android.R.drawable.star_big_off);
//                    star4.setImageResource(android.R.drawable.star_big_off);
//                    star5.setImageResource(android.R.drawable.star_big_off);
//
//                    resultat.setText("Mauvais");
//
//                }
//            });

//            star2.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    star1.setImageResource(android.R.drawable.star_big_on);
//                    star2.setImageResource(android.R.drawable.star_big_on);
//                    star3.setImageResource(android.R.drawable.star_big_off);
//                    star4.setImageResource(android.R.drawable.star_big_off);
//                    star5.setImageResource(android.R.drawable.star_big_off);
//                    resultat.setText("Passable");
//
//
//
//
//
//
//
//
//
//
//                }
//            });
            clickStar(star2,v,resultat,"Passable");
//            star3.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    star1.setImageResource(android.R.drawable.star_big_on);
//                    star2.setImageResource(android.R.drawable.star_big_on);
//                    star3.setImageResource(android.R.drawable.star_big_on);
//                    star4.setImageResource(android.R.drawable.star_big_off);
//                    star5.setImageResource(android.R.drawable.star_big_off);
//                    resultat.setText("Assez bien");
//
//
//                }
//            });
            clickStar(star3,v,resultat,"Assez bien");
//            star4.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    star1.setImageResource(android.R.drawable.star_big_on);
//                    star2.setImageResource(android.R.drawable.star_big_on);
//                    star3.setImageResource(android.R.drawable.star_big_on);
//                    star4.setImageResource(android.R.drawable.star_big_on);
//                    star5.setImageResource(android.R.drawable.star_big_off);
//                    resultat.setText("Bien");
//
//
//                }
//            });
            clickStar(star4,v,resultat,"Bien");
//            star5.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    star1.setImageResource(android.R.drawable.star_big_on);
//                    star2.setImageResource(android.R.drawable.star_big_on);
//                    star3.setImageResource(android.R.drawable.star_big_on);
//                    star4.setImageResource(android.R.drawable.star_big_on);
//                    star5.setImageResource(android.R.drawable.star_big_on);
//                    resultat.setText("Tres bien");
//
//
//
//
//                }
//            });
            clickStar(star5,v,resultat,"Tres Bien");



            return view;
        }


    }
}













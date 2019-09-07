package com.example.splashscreen.gangtok.food;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.splashscreen.Adapters.Adapter_food;
import com.example.splashscreen.R;
import com.example.splashscreen.main.Place;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Gangtok_food extends Fragment {


    public Gangtok_food() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_gangtok_food, container, false);

        ArrayList<Place> gangtokFood = new ArrayList<>();
        gangtokFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/TANGERINE.jpg", "Tangerine", "31A National Highway"));
        gangtokFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/CAF%C3%89-LIVE-AND-LOUD.jpg", "Café Live and Loud", "Tibet Road, Arithang"));
        gangtokFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/NINE-NATIVE-CUISINE-Gary-Stevens-Flickr-Creative-commons.jpg", "Nine Native Cuisine", "Gangtok, Sikkim"));
        gangtokFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/Bakers-Cafe-Phil-Parker-Flickr-Creative-commons.jpg", "Baker’s Café", "Tadong,daragoan, Upper Tadong"));
        gangtokFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/MG-Road-KATHI-ROLLS-wikimedia-commons_kspoddar.jpg", "Kathi Rolls", "Roll house near MG Road"));
        gangtokFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/CAF%C3%89-CULTURE.jpg", "Café Culture", ""));

        ArrayAdapter gangtokFoodAdapter = new Adapter_food(getActivity().getApplicationContext(), gangtokFood);
        ListView listView = rootView.findViewById(R.id.gangtokFoodList);
        listView.setAdapter(gangtokFoodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), Tangerine.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), CafeLive.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), NineNativeCuisine.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), BakersCafe.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), KathiRolls.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), CafeCulture.class);
                        startActivity(intent5);
                        break;
                }
            }
        });

        return rootView;
    }

}

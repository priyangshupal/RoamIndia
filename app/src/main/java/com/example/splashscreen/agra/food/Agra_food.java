package com.example.splashscreen.agra.food;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.splashscreen.main.Place;
import com.example.splashscreen.R;
import com.example.splashscreen.Adapters.Adapter_food;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Agra_food extends Fragment {


    public Agra_food() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_agra_food, container, false);

        ArrayList<Place>agraFood = new ArrayList<>();
        agraFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/The-Only-Restaurant.jpg", "Only Restaurant", "45, Taj Road, Agra"));
        agraFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/Dasaprakash.jpg", "Dasaprakash", "1 Gwalior Road, Sadar Bazaar Area, Agra"));
        agraFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/Joney's-PLace.jpg", "Joney’s Place", "Taj Ganj, Agra"));
        agraFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/The-Mndarin.jpg", "The Mandarin", "6B The Mall Road, Hotel Yamuna View"));
        agraFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/Shankara.jpg", "Shankara Vegis Restaurant", "Dharmapuri, Taj Ganj, Agra"));
        agraFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/Petha.jpg", "Petha", ""));

        ArrayAdapter agraFoodAdapter = new Adapter_food(getActivity().getApplicationContext(), agraFood);
        ListView listView = rootView.findViewById(R.id.agraFoodList);
        listView.setAdapter(agraFoodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), OnlyRestaurant.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), Dasaprakash.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), JoneyPlace.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), TheMandarin.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), ShankaraVegisRestaurant.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), Petha.class);
                        startActivity(intent5);
                        break;
                }
            }
        });

        return rootView;
    }

}

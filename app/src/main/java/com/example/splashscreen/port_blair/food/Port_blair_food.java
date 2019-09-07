package com.example.splashscreen.port_blair.food;


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
public class Port_blair_food extends Fragment {

    public Port_blair_food() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_port_blair_food, container, false);

        ArrayList<Place> food = new ArrayList<>();
        food.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/port_blair/Mandalay-Restaurant1.jpg", "Mandalay Restaurant", "Fortune Bay Island Hotel, Port Blair"));
        food.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/port_blair/Annapurna1.jpg", "Annapurna", "MG Road, Port Blair"));
        food.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/port_blair/Andamani-Fish-Curry1.jpg", "Andamani Fish Curry", "Fortune Bay Island Hotel, Port Blair"));

        ArrayAdapter foodAdapter = new Adapter_food(getActivity().getApplicationContext(), food);
        ListView listView = rootView.findViewById(R.id.portBlairFoodList);
        listView.setAdapter(foodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), MandalayRestaurant.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), Annapurna.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), AndamaniFishCurry.class);
                        startActivity(intent2);
                        break;
                }
            }
        });

        return rootView;
    }

}

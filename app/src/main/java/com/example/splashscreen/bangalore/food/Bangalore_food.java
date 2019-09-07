package com.example.splashscreen.bangalore.food;


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
public class Bangalore_food extends Fragment {


    public Bangalore_food() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_bangalore_food, container, false);

        ArrayList<Place>bangaloreFood = new ArrayList<>();
        bangaloreFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Grasshopper-Restaurant.jpg", "Grasshopper Restaurant", "45, Kalena Agrahara, Bannerghatta Road"));
        bangaloreFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Caperberry-Restaurant.jpg", "Caperberry Restaurant", "48/1, Ground Floor, The Estate, No 121, Dickenson Road"));
        bangaloreFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Oko-Restaurant.jpg", "Oko Restaurant", "6th Floor, The Lalit Ashok, Kumara Park"));
        bangaloreFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Istanbul-Doner-&-Turkish-Grill.jpg", "Istanbul Doner & Turkish Grill", "27, 7th Cross, Off 2nd Main, HAL 1st Stage, Indiranagar"));
        bangaloreFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Dum-Pukht-Jolly-Nabob-Restaurant.jpg", "Dum Pukht Jolly Nabob Restaurant", "Lobby Level, ITC Windsor - A Luxury Collection Hotel, Golf Course Road"));
        bangaloreFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Portland-Steak-House-&-Cafe-Kanko-Flickr-Creative-commons.jpg", "Portland Steak House & Café", "No. 1, 1st Cross, Brunton Road, MG Road"));

        ArrayAdapter bangaloreFoodAdapter = new Adapter_food(getActivity().getApplicationContext(), bangaloreFood);
        ListView listView = rootView.findViewById(R.id.bangaloreFoodList);
        listView.setAdapter(bangaloreFoodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), GrasshopperRestaurant.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), CaperberryRestaurant.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), OkoRestaurant.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), IstanbulDonerTurkishGrill.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), DumPukhtJollyNabobRestaurant.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), PortlandSteakHouseCafe.class);
                        startActivity(intent5);
                        break;
                }
            }
        });

        return rootView;
    }
}

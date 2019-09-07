package com.example.splashscreen.gangtok.shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.splashscreen.Adapters.Adapter_shopping;
import com.example.splashscreen.R;
import com.example.splashscreen.main.Place;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Gangtok_shopping extends Fragment {

    public Gangtok_shopping() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_gangtok_shopping, container, false);

        ArrayList<Place> gangtokShopping = new ArrayList<>();
        gangtokShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/MG-Road-Pranav-Bhasin.jpg", "MG Road", "Gangtok, Sikkim"));
        gangtokShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/Directorate-of-Handicraft-&-Handloom-Abhishek-Kumar-Flickr-Creative-commons.jpg", "Directorate of Handicraft & Handloom", "East Sikkim Road District"));
        gangtokShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/Lal-Bazaar-Chirantan-Mandal-Flickr-Creative-commons.jpg", "Lal Bazaar", "Gangtok, Sikkim"));

        ArrayAdapter gangtokShoppingAdapter = new Adapter_shopping(getActivity().getApplicationContext(), gangtokShopping);
        ListView listView = rootView.findViewById(R.id.gangtokShoppingList);
        listView.setAdapter(gangtokShoppingAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), MGRoad.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), DirectorateofHandicraft.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), LalBazar.class);
                        startActivity(intent2);
                        break;
                }
            }
        });

        return rootView;
    }

}

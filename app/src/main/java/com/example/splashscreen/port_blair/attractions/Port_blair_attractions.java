package com.example.splashscreen.port_blair.attractions;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.splashscreen.Adapters.Adapter_attractions;
import com.example.splashscreen.R;
import com.example.splashscreen.main.Place;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Port_blair_attractions extends Fragment {


    public Port_blair_attractions() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_port_blair_attractions, container, false);

        ArrayList<Place> attractions = new ArrayList<>();
        attractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/port_blair/Cellular-Jail1.jpg", "Cellular Jail", "South Andaman Island, Port Blair"));
        attractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/port_blair/Mount-Harriet1.jpg", "Mount Harriet", "South Island, Port Blair"));
        attractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/port_blair/Corbyn's-Cove1.jpg", "Corbyn's Cove", "Port Blair"));
        attractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/port_blair/Samudrika-Marine-Museum1.jpg", "Samudrika Marine Museum", "Port Blair"));
        attractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/port_blair/Baratang-Island1.jpg", "Baratang Island", "100 kilometres from Port Blair"));
        attractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/port_blair/Japanese-Bunker1.jpg", "Japanese Bunker", "Port Blair"));
        attractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/port_blair/Bird-Island1.jpg", "Chidiya Tapu or Bird Island", "Port Blair"));

        ArrayAdapter attractionsAdapter = new Adapter_attractions(getActivity().getApplicationContext(), attractions);
        ListView listView = rootView.findViewById(R.id.portBlairAttractionsList);
        listView.setAdapter(attractionsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), CellularJail.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), MountHarriet.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), CorbynCove.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), SamudrikaMarineMuseum.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), BaratangIsland.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), JapaneseBunker.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), BirdIsland.class);
                        startActivity(intent6);
                        break;
                }
            }
        });

        return rootView;
    }

}

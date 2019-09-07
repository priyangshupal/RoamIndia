package com.example.splashscreen.port_blair.shopping;


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
public class Port_blair_shopping extends Fragment {


    public Port_blair_shopping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_port_blair_shopping, container, false);

        ArrayList<Place> shopping = new ArrayList<>();
        shopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/port_blair/Aberdeen-Bazaar1.jpg", "Aberdeen Bazaar", "Main market, Port Blair"));
        shopping.add(new Place("https://farm8.staticflickr.com/7323/11085387475_ff4607259e_m.jpg", "Sagarika Emporium", "Sagarika Emporium, Thomas Colony, Junglighat"));
        shopping.add(new Place("https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/Jaapi.jpg/320px-Jaapi.jpg", "Queen Sea Shell Craft" ,"M. G Road, Shop No.3, Opp. Sampat Lodge"));

        ArrayAdapter shoppingAdapter = new Adapter_shopping(getActivity().getApplicationContext(), shopping);
        ListView listView = rootView.findViewById(R.id.portBlairShoppingList);
        listView.setAdapter(shoppingAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), AberdeenBazaar.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), SagarikaEmporium.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), QueenSeaShellCraft.class);
                        startActivity(intent2);
                        break;
                }
            }
        });

        return rootView;
    }

}

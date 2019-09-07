package com.example.splashscreen.agra.shopping;


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
import com.example.splashscreen.Adapters.Adapter_shopping;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Agra_shopping extends Fragment {


    public Agra_shopping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_agra_shopping, container, false);

        ArrayList<Place> agraShopping = new ArrayList<>();
        agraShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/1_Sadar_Bazar.jpg", "Sadar Bazaar", "West of Khari Baoli, near Agra Cantt Railway Station"));
        agraShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/2_J.K.-Cottage-Industries.jpg", "J.K. Cottage Industries", "45, Shamshadabad Road. Agra"));
        agraShopping.add(new Place("https://4.imimg.com/data4/FW/VT/ANDROID-23195496/product-500x500.jpeg", "Marble" ,""));
        agraShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/Bags.jpg", "Leather", ""));
        agraShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/Carpets-and-Rugs.jpg", "Carpets and Rugs", ""));

        ArrayAdapter agraShoppingAdapter = new Adapter_shopping(getActivity().getApplicationContext(), agraShopping);
        ListView listView = rootView.findViewById(R.id.agraShoppingList);
        listView.setAdapter(agraShoppingAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), SadarBazar.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), JKCottage.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), Marble.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), Leather.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), CarpetsAndRugs.class);
                        startActivity(intent4);
                        break;
                }
            }
        });

        return rootView;
    }

}

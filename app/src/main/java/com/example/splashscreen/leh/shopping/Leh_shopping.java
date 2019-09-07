package com.example.splashscreen.leh.shopping;


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
public class Leh_shopping extends Fragment {


    public Leh_shopping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_leh_shopping, container, false);

        ArrayList<Place> lehShopping = new ArrayList<>();
        lehShopping.add(new Place("https://i.pinimg.com/originals/f0/3f/e0/f03fe0eb4c230d33d5a7b9f270460965.jpg", "Leh Market", "Leh Market, Main Bazaar Road"));
        lehShopping.add(new Place("https://upload.wikimedia.org/wikipedia/commons/a/a6/Hamis_Gonpa_on_a_rainy_day.JPG", "The Hemis Museum Shop", "Hemis Monastery Museum, Hemis"));
        lehShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/THE-TIBETAN-REFUGEE-MARKET_Flickr-Creative-Commons_Saad-Faruque.jpg", "The Tibetan Refugee Market", "Leh Manali Highway, Shey"));
        lehShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/THE-DISKIT-CURIO-SHOP.jpg", "The Diskit Curio Shop", "Diskit monastery"));
        lehShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Zanskar-Arts-Leh.jpg", "Zanskar Arts", "Leh Main Gate, Leh City"));
        lehShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Library-Road-Vegetable-Market-Leh.jpg", "Library Road Vegetable Market", "Library Road, Leh"));
        lehShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Tibetan-Market-Leh.jpg", "Tibetan Market", "Leh, Jammu and Kashmir"));

        ArrayAdapter lehShoppingAdapter = new Adapter_shopping(getActivity().getApplicationContext(), lehShopping);
        ListView listView= rootView.findViewById(R.id.lehShoppingList);
        listView.setAdapter(lehShoppingAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), LehMarket.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), HemisMuseumShop.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), TibetanRefugeeMarket.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), DiskitCurioShop.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), ZansarArts.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), LibraryRoadVegetableMarket.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), TibetanMarket.class);
                        startActivity(intent6);
                        break;
                }
            }
        });

        return rootView;
    }

}

package com.example.splashscreen.delhi.shopping;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.splashscreen.Adapters.Adapter_shopping;
import com.example.splashscreen.main.Place;
import com.example.splashscreen.R;

import java.util.ArrayList;

public class Delhi_shopping extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_delhi_shopping, container, false);

        ArrayList <Place> delhiShopping = new ArrayList<>();
        delhiShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Dilli-Haat-Delhi.jpg", "Dilli Haat", "Near INA Market, New Delhi"));
        delhiShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Select-City-Walk-Mall-Delhi.jpg", "Select City Walk Mall", "A-3 District Centre, Saket, New Delhi"));
        delhiShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Shopping-Khan-Market-delhi.jpg", "Khan Market", "Khan Market, near Lodhi Road, New Delhi"));
        delhiShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Shopping-Connaught-Place-delhi.jpg", "Connaught Place", "Connaught Place, New Delhi"));
        delhiShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Janpath-Delhi.jpg", "Janpath", "Near Conaught Place, New Delhi"));
        delhiShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Shopping-Metro-Walk-Mall-delhi.jpg", "Metro Walk Mall", "Sector 10, Rohini, near Rithala Metro Station, New Delhi"));
        delhiShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Central-Cottage-Industries-Emporium-Delhi.jpg", "Central Cottage Industries Emporium", "Janpath, New Delhi"));
        delhiShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Meena-Bazaar-Delhi.jpg", "Meena Bazaar", "Chandini Chowk, Old Delhi"));
        delhiShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/DLF-Promenade-Mall-Delhi.jpg", "DLF Promenade Mall", "Nelson Mandela Marg, Vasant Kunj, New Delhi"));
        delhiShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Shopping-INA-Market-delhi.jpg", "INA Market", "Sri Aurobindo Marg, Opposite Delhi Haat, New Delhi."));
        delhiShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Shopping-Greater-Kailash-Market-delhi.jpg", "Greater Kailash", "Near Nehru Place, New Delhi"));
        delhiShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Great-India-Place-Delhi.jpg", "Great India Place", "Sector 38-A, Noida, Uttar Pradesh"));
        delhiShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Karol-Bagh-Delhi.jpg", "Karol Bagh", "Karol Bagh, New Delhi"));
        delhiShopping.add(new Place("https://i.dailymail.co.uk/i/pix/2014/09/17/1410989003632_wps_12_Restaurant_story_photo_on.jpg", "Hauz Khas Village", "Near Green Park, New Delhi"));
        delhiShopping.add(new Place("https://imgstaticcontent.lbb.in/lbbnew/wp-content/uploads/sites/1/2016/09/220816_Meherchand-Market01.jpg", "Mehr Chand Market", "Lodi Colony, New Delhi"));

        ArrayAdapter delhiShoppingAdapter = new Adapter_shopping(getActivity().getApplicationContext(), delhiShopping);
        ListView listView= rootView.findViewById(R.id.delhiShoppingList);
        listView.setAdapter(delhiShoppingAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), Delhi_Haat.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), SelectCityWalk.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), KhanMarket.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), ConnaughtPlace.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), Janpath.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), MetroWalkMall.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), CentralCottageIndustriesEmporium.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), MeenaBazaar.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), DLFPromenadeMall.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getActivity(), INAMarket.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getActivity(), GreaterKailash.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getActivity(), GreatIndiaPlace.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getActivity(), Karolbagh.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getActivity(), HauzKhasVillage.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(getActivity(), MehrChandMarket.class);
                        startActivity(intent14);
                        break;
                }
            }
        });

        return rootView;
    }

}

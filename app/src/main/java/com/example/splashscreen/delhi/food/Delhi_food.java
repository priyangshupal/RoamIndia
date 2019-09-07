package com.example.splashscreen.delhi.food;


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
import com.example.splashscreen.delhi.shopping.Paharganj;
import com.example.splashscreen.main.Place;
import com.example.splashscreen.R;
import com.example.splashscreen.delhi.attractions.SarvanaBhavan;

import java.util.ArrayList;

public class Delhi_food extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_delhi_food, container, false);

        ArrayList<Place> delhiFood = new ArrayList<>();
        delhiFood.add(new Place("https://www.dfordelhi.in/wp-content/uploads/2017/01/443d6230221775.5618c7eee0463.jpg", "The Big Chill", "Vasant Kunj"));
        delhiFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Paharganj-Delhi.jpg", "Paharganj", "Paharganj, near New Delhi Railway Station, New Delhi"));
        delhiFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Hauz-Khas-Village-Restaurants-Delhi.jpg", "Hauz Khas Village", "Green Park Market, New Delhi"));
        delhiFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Dilli-Haat-Food-Delhi.jpg", "Dilli Haat", "Near INA Market, New Delhi"));
        delhiFood.add(new Place("https://experiencesaga.com/wp-content/uploads/2017/11/Fio1-min.jpg", "Fio", "Garden of Five Senses, Said-ul-Ajaib"));
        delhiFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Chaat-Delhi.jpg", "Chaat", "Anywhere in Delhi"));
        delhiFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Gali-Paranthe-Wali-Delhi.jpg", "Gali Paranthe Wali", "Chandini Chowk, Old Delhi"));
        delhiFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Chacha-Ke-Cholley-Bhature-Delhi.jpg", "Chacha Ke Cholley Bhature", "U Block, Bungalow Road, New Delhi"));
        delhiFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Sarvana-Bhavan-Delhi.jpg", "Sarvana Bhavan", "Janpath, Connaught Place, New Delhi"));
        delhiFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Gunpowder-Delhi.jpg", "Gunpowder", "22, Hauz Khas Village, New Delhi"));
        delhiFood.add(new Place("https://b.zmtcdn.com/data/pictures/9/4249/4ad3a4f528ae9f5bb2d90ce43d28bba7_featured_v2.jpg", "Wenger's", "16 A, Connaught Place, New Delhi"));
        delhiFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Keventers-Delhi.jpg", "Keventer's", "Radial Road number 3, A Block, Connaught Place, New Delhi."));
        delhiFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/All-American-Diner-Delhi.jpg", "All American Diner", "India Habitat Centre, Lodhi Road, New Delhi"));
        delhiFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Khan-Chacha-Delhi.jpg", "Khan Chacha", "Khan Market, Connaught Place and Saket, New Delhi"));
        delhiFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Kulfi-Delhi.jpg", "Kulfi", "Anywhere in Delhi"));
        delhiFood.add(new Place("https://i.ndtvimg.com/i/2018-02/resturants_620x350_51518079820.jpg", "Pandara Road", "Pandara Road, India Gate, New Delhi"));

        ArrayAdapter delhiFoodAdapter = new Adapter_food(getActivity().getApplicationContext(), delhiFood);
        ListView listView = rootView.findViewById(R.id.delhiFoodList);
        listView.setAdapter(delhiFoodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intent = new Intent(getActivity(), TheBigChill.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), Paharganj.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), HauzKhazVillageFood.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), DilliHaatFood.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), Fio.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), Chaat.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), GaliParantheWali.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), ChachaKeCholleyBhature.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), SarvanaBhavan.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getActivity(), Gunpowder.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getActivity(), Wenger.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getActivity(), Keventer.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getActivity(), AllAmericanDinner.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getActivity(), KhanChacha.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(getActivity(), Kulfi.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(getActivity(), PandaraRoad.class);
                        startActivity(intent15);
                        break;
                }
            }
        });

        return rootView;
    }

}

package com.example.splashscreen.jaipur.attractions;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.splashscreen.main.Place;
import com.example.splashscreen.R;
import com.example.splashscreen.Adapters.Adapter_attractions;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Jaipur_attractions extends Fragment {


    public Jaipur_attractions() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_jaipur_attractions, container, false);

        ArrayList<Place> jaipurAttractions = new ArrayList<>();
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Amber-Fort.jpg", "Amber Fort", "NH 8, Amber City, 11 kilometres north of Jaipur"));
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Jaigarh-Fort.jpg", "Jaigarh Fort", "Located atop one of the peaks of the Aravallis"));
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Nahargarh-Fort-new.jpg", "Nahargarh Fort", "Aravalli Hills, Jaipur"));
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Hawa-Mahal.jpg", "Hawa Mahal", "NH 8, Badi Choupad, Jaipur"));
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Jantar-Mantar.jpg", "Jantar Mantar", "Near City Palace, Tripolia Bazaar"));
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Jal-Mahal-Jaipur.jpg", "Jal Mahal", "Amber Fort Road, Jaipur"));
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/surya-mandir-Jaipur.jpg", "Surya Mandir", "East side of town, Jaipur"));
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Diwan-e-Khas-Hall-Jaipur.jpg", "Diwan e Khas Hall", "City Palace | Mubarak Mahal Courtyard"));
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Ganesh-Pol-Gateway-Jaipur.jpg", "Ganesh Pol Gateway", "Amer Fort | South Side of the Courtyard"));
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/City-Palace.jpg", "City Palace", "Kanwar Nagar, Jaipur"));
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Albert-Hall-Museum-Jaipur.jpg", "Albert Hall Museum", "Adarsh Nagar, Jaipur"));
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Jawahar-Kala-Kendra-Jaipur.jpg", "Jawahar Kala Kendra", "BuJawaharlal Nehru Marg, Near Rajasthan University"));
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Diwan-e-Am-Jaipur.jpg", "Diwan-e-Am", "City Palace Complex, Jaipur"));
        jaipurAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Chokhi-Dhani,-flickr-Swan555.jpg", "Chokhi Dhani", "Tonk Road Via Vatika"));

        ArrayAdapter jaipurAttractionsAdapter = new Adapter_attractions(getActivity().getApplicationContext(), jaipurAttractions);
        ListView listView = rootView.findViewById(R.id.jaipurAttractionsList);
        listView.setAdapter(jaipurAttractionsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), AmberFort.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), JaigarhFort.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), NahargarhFort.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), HawaMahal.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), JantarMantarJaipur.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), JalMahal.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), SuryaMandir.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), DiwaneKhasHall.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), GaneshPolGateway.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getActivity(), CityPalace.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getActivity(), AlbertHallMuseum.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getActivity(), JawaharKalaKendra.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getActivity(), DiwaneAm.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getActivity(), ChokhiDhani.class);
                        startActivity(intent13);
                        break;
                }
            }
        });

        return rootView;
    }


}

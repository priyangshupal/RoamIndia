package com.example.splashscreen.jaipur.food;


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
public class Jaipur_food extends Fragment {


    public Jaipur_food() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_jaipur_food, container, false);

        ArrayList<Place> jaipurFood = new ArrayList<>();
        jaipurFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Handi-Restaurant-ZR07.jpg", "Handi Restaurant", "Opposite GPO, MI Road, Jaipur"));
        jaipurFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Rawat-Mishthan-Bhandar-ikrichter.jpg", "Rawat Mishthan Bhandar", "Polovictory Cinema, Railway Station Road, Sindhi Camp"));
        jaipurFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Lakshmi-Misthan-Bhandar-I-In-India.jpg", "Lakshmi Mishthan Bhandar", "Behind Hawa Mahal, Ajmer Road, Johari Bazaar"));
        jaipurFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Spice-Court-Luxury-Collection-Hotels-and-Resorts.jpg", "Spice Court", "Hari Bhawan, Achrol House, Jacob Road, Civil Lines"));
        jaipurFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Om-Revolving-Restaurant.jpg", "Om Revolving Restaurant", "Hotel Om Tower, Church Road, MI Road"));
        jaipurFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Pyaaz-Kachori.jpg", "Pyaaz Kachori", "Polovictory Cinema, Railway Station Road, Sindhi Camp"));
        jaipurFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Mirchi-Bada-www.theedinburghblog.co_.uk_.jpg", "Mirchi Bada", "Behind Hawa Mahal, Ajmer Road, Johari Bazaar"));
        jaipurFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Ghewar-pankaj.batra_.jpg", "Ghewar", "Polovictory Cinema, Railway Station Road, Sindhi Camp"));

        ArrayAdapter jaipurFoodAdapter = new Adapter_food(getActivity().getApplicationContext(), jaipurFood);
        ListView listView = rootView.findViewById(R.id.jaipurFoodList);
        listView.setAdapter(jaipurFoodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), HandiRestaurant.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), RawatMishthanBhandar.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), LakshmiMishthanBhandar.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), SpiceCourt.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), OmRevolvingRestaurant.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), PyaazKachori.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), MirchiBada.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), Ghewar.class);
                        startActivity(intent7);
                        break;
                }
            }
        });

        return rootView;
    }

}
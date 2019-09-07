package com.example.splashscreen.jaisalmer.food;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.splashscreen.R;
import com.example.splashscreen.Adapters.Adapter_food;
import com.example.splashscreen.main.Place;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Jaisalmer_food extends Fragment {


    public Jaisalmer_food() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_jaisalmer_food, container, false);

        ArrayList<Place> jaisalmerFood = new ArrayList<>();
        jaisalmerFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Trio-Restaurant-new.jpg", "Trio Restaurant", "Gandhi Chowk"));
        jaisalmerFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Chokhi-Dhani1.jpg", "Chokhi Dhani", "Kanoj Village, Near Sand Dune"));
        jaisalmerFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Kadhi-pakora.jpg", "Kadhi Pakora", "Trio Restaurant"));
        jaisalmerFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Ker-sangri.jpg", "Ker sangri", "Chokhi Dhani"));
        jaisalmerFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Lal-maans.jpg", "Lal Maans", ""));
        jaisalmerFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Safed-maans.jpg", "Safed Maans", ""));
        jaisalmerFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Murgh-e-subz_0.jpg", "Murgh-e-subz", ""));

        ArrayAdapter jaipurFoodAdapter = new Adapter_food(getActivity().getApplicationContext(), jaisalmerFood);
        ListView listView = rootView.findViewById(R.id.jaisalmerFoodList);
        listView.setAdapter(jaipurFoodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), TrioRestaurant.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), ChokhiDhaniJaisalmer.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), KadhiPakora.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), Kersangri.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), LalMaans.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), SafedMaans.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), Murghesubz.class);
                        startActivity(intent6);
                        break;
                }
            }
        });

        return rootView;
    }

}

package com.example.splashscreen.leh.food;


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
import com.example.splashscreen.Adapters.Adapter_shopping;
import com.example.splashscreen.R;
import com.example.splashscreen.main.Place;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Leh_food extends Fragment {

    public Leh_food() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_leh_food, container, false);

        ArrayList<Place> lehFood = new ArrayList<>();
        lehFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Pizzaria.jpg", "La Pizzeria", "Leh Market"));
        lehFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/CHOPSTICKS.jpg", "Chopsticks", "Leh Market"));
        lehFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/GESMO.jpg", "Gesmo ", "Leh Market"));
        lehFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/LEH-VIEW-RESTAURANT.jpg", "Leh View Restaurant", "Leh Market"));
        lehFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/TIBETAN-KITCHEN.jpg", "Tibetan Kitchen", "Leh Market"));
        lehFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/LAMAYURU-RESTAURANT.jpg", "Lamayuru Restaurant", "Leh Market"));
        lehFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/IL-FOMO.jpg", "Il Fomo", "Leh Market"));
        lehFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/SHELDON-GARDEN-RESTAURANT.jpg", "Sheldon Garden Restaurant", "Leh Market"));
        lehFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/HIMALAYA-CAFE.jpg", "Himalaya Café", "Leh Market"));
        lehFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Momos.jpg", "Momos", "Leh Market"));
        lehFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Thupka.jpg", "Thukpas", "Leh Market"));
        lehFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/GERMAN-BAKERY.jpg", "German Bakery", "Leh Market"));
        lehFood.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/KHAMBIR.jpg", "Khambir", ""));

        ArrayAdapter lehFoodAdapter = new Adapter_food(getActivity().getApplicationContext(), lehFood);
        ListView listView= rootView.findViewById(R.id.lehFoodList);
        listView.setAdapter(lehFoodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intent = new Intent(getActivity(), LaPizzeria.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), Chopsticks.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), Gesmo.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), LehViewRestaurant.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), TibetanKitchen.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), LamayuruRestaurant.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), IlFomo.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), SheldonGardenRestaurant.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), HimalayaCafe.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getActivity(), Momos.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getActivity(), Thukpas.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getActivity(), GermanBakery.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getActivity(), Khambir.class);
                        startActivity(intent12);
                        break;
                }
            }
        });

        return rootView;
    }

}

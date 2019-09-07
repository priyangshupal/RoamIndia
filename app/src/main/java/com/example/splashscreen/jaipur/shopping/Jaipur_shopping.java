package com.example.splashscreen.jaipur.shopping;


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
public class Jaipur_shopping extends Fragment {


    public Jaipur_shopping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_jaipur_shopping, container, false);


        ArrayList<Place> jaipurShopping = new ArrayList<>();
        jaipurShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Johari-Bazar-Pedro-Gordo.jpg", "Johari Bazaar", "Johri Bazar, Gangori Bazar, Pink City"));
        jaipurShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Bapu-Baza-Eric.Parker.jpg", "Bapu Bazar", "Biseswarji, Jaipur"));
        jaipurShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Nehru-Bazaar-solefelice.jpg", "Nehru Bazaar", "Film Colony, Modikhana, Jaipur"));
        jaipurShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Mirza-Ismial-Road-Jokertrekker.jpg", "Mirza Ismial Road (M.I. Road)", "Road in Jaipur, Rajasthan"));
        jaipurShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Tripolia-Bazar-Chineando.jpg", "Tripolia Bazaar and Chaura Rasta", "Tripolia Bazar Street, Jaipur"));
        jaipurShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Handicraft-Haveli-Jaipur.jpg", "Handicraft Haveli", "Behind Hotel Trident, Amer Road, Gujar Ghati"));
        jaipurShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Jewelry-Jaipur.jpg", "Jewellery", "H-20, Bhagat Singh Marg | C-Scheme"));
        jaipurShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Govind-Rajasthali-Cottage-Industries-Jaipur.jpg", "Govind Rajasthali Cottage Industries", "Kanak Vrindavan, Amer Road"));
        jaipurShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/5-Neelam-Handicraft-Shop-Jaipur.jpg", "Neelam Handicraft Shop", "Hotel Arya Niwas, Behind Amber Tower | Sansar Chandra Road"));
        jaipurShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Rajasthan-Leather-Handicrafts-jaipur.jpg", "Rajasthan Leather Handicrafts", "S-34, Nagar Nigam Colony, Amer Road"));

        ArrayAdapter jaipurShoppingAdapter = new Adapter_shopping(getActivity().getApplicationContext(), jaipurShopping);
        ListView listView = rootView.findViewById(R.id.jaipurShoppingList);
        listView.setAdapter(jaipurShoppingAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), JohariBazaar.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), BapuBazar.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), NehruBazaar.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), MirzaIsmialRoad.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), TripoliaBazaar.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), HandicraftHaveli.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), Jewellery.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), GovindRajasthaliCottageIndustries.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), NeelamHandicraftShop.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getActivity(), RajasthanLeatherHandicrafts.class);
                        startActivity(intent9);
                        break;

                }
            }
        });

        return rootView;
    }

}

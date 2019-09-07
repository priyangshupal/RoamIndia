package com.example.splashscreen.jaisalmer.shopping;


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
import com.example.splashscreen.Adapters.Adapter_shopping;
import com.example.splashscreen.main.Place;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Jaisalmer_shopping extends Fragment {


    public Jaisalmer_shopping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_jaisalmer_shopping, container, false);

        ArrayList<Place> jaisalmerShopping = new ArrayList<>();
        jaisalmerShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Sadar-Bazaar.jpg", "Sadar Bazaar", "Sadar Bazaar, Jaisalmer"));
        jaisalmerShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Bhatia-Bazaar.jpg", "Bhatia Bazaar", "Bhatia Bazaar, Jaisalmer"));
        jaisalmerShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Manak-Chowk.jpg", "Manak Chowk", "Entrance of Jaisalmer Fort"));
        jaisalmerShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Seema-Gram-Abhishek-Shirali-flickrcreative.jpg", "Seema Gram", ""));
        jaisalmerShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Pansari-Bazaar.jpg", "Pansari Bazaar", "Pansari Bazaar, Jaisalmer"));
        jaisalmerShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Bellissimafort-Jaisalmer.jpg", "Bellissimafort", "Inside Golden Fort, Jaisalmer"));
        jaisalmerShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Handicrafts-Jaisalmer.jpg", "Handicrafts", "Jaisalmer"));
        jaisalmerShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Shree-Krishna-Saree-Jaisalmer.jpg", "Shree Krishna Saree", "Opposite Bhatia Bhawan, Bhatia Market, Jaisalmer"));
        jaisalmerShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Jewellery-Jaisalmer.jpg", "Jewellery", "Jaisalmer"));

        ArrayAdapter jaisalmerShoppingAdapter = new Adapter_shopping(getActivity().getApplicationContext(), jaisalmerShopping);
        ListView listView = rootView.findViewById(R.id.jaisalmerShoppingList);
        listView.setAdapter(jaisalmerShoppingAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), SadarBazaar.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), BhatiaBazaar.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), ManakChowk.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), SeemaGram.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), PansariBazaar.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), Bellissimafort.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), Handicrafts.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), ShreeKrishnaSaree.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), JewelleryJaisalmer.class);
                        startActivity(intent8);
                        break;
                }
            }
        });

        return rootView;
    }

}

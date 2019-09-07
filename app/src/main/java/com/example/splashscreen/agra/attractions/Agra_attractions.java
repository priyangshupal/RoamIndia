package com.example.splashscreen.agra.attractions;


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

import com.example.splashscreen.main.Place;
import com.example.splashscreen.R;
import com.example.splashscreen.Adapters.Adapter_attractions;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Agra_attractions extends Fragment {


    public Agra_attractions() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_agra_attractions, container, false);

        ArrayList<Place> agraAttractions = new ArrayList<>();
        agraAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/2_Agra-Fort.jpg", "Agra Fort", "Agra"));
        agraAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/3_Mehtab_Bagh.jpg", "Mehtab Bagh", "Opposite side of the Yamuna River"));
        agraAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/1_Taj_Mahal.jpg", "Taj Mahal", "Agra"));
        agraAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/4_Jama_Masjid.jpg", "Jama Masjid", "Opposite Agra Fort"));
        agraAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/5_Mariam_Tomb.jpg", "Mariam’s Tomb", "1 kilometre from Sikandra"));
        agraAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/9_Khas-Mahal.jpg", "Khas Mahal", "Within Agra Fort"));
        agraAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/7_Chini-ka-Rauza.jpg", "Chini ka Rauza", "1 kilometre north of Itimad-ud-Daulah"));
        agraAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/10_Panch-Mahal.jpg", "Panch Mahal", "Fatehpur Sikri"));
        agraAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/14_Anguri-Bagh.jpg", "Anguri Bagh", "Within Agra Fort"));
        agraAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/15_Sur-Sarovar-Bird-Sanctuary.jpg", "Sur Sarovar Bird Sanctuary", "Agra-Delhi Highway, NH2"));
        agraAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/16_Jahangir-Mahal.jpg", "Jahangir Mahal", "Within Agra Fort"));
        agraAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/agra/19_Mariam-uz-Zamani-Palace.jpg", "Mariam-uz-Zamani Palace", "Fatehpur Sikri"));

        ArrayAdapter agraAttractionsAdapter = new Adapter_attractions(getActivity().getApplicationContext(), agraAttractions);
        ListView listView = rootView.findViewById(R.id.agraAttractionsList);
        listView.setAdapter(agraAttractionsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), AgraFort.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), MehtabBagh.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), TajMahal.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), JamaMasjidAgra.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), MariamTomb.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), KhasMahal.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), ChinikaRauza.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), PanchMahal.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), AnguriBagh.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getActivity(), SurSarovarBirdSanctuary.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getActivity(), JahangirMahal.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getActivity(), MariamuzZamaniPalace.class);
                        startActivity(intent11);
                        break;
                }
            }
        });

        return rootView;
    }

}

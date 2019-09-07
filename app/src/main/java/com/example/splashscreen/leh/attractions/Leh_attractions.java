package com.example.splashscreen.leh.attractions;


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

import com.example.splashscreen.Adapters.Adapter_attractions;
import com.example.splashscreen.R;
import com.example.splashscreen.main.Place;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Leh_attractions extends Fragment {


    public Leh_attractions() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_leh_attractions, container, false);

        ArrayList<Place> lehAttractions = new ArrayList<>();
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Leh-Shanti-Stupa.jpg", "Leh Shanti Stupa", "Changspa, Leh district"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Leh-Palace-Leh.jpg", "Leh Palace", "Namgyal Hill, Leh, Jammu and Kashmir"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Spituk-Monastery_Wikimedia%20Commons_Redtigerxyz.jpg", "Spituk Monastery", "Leh"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/THIKSEY-MONASTERY.jpg", "Thiksey Monastery", "Leh"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Hemis-Monastery.jpg", "Hemis Monastery", "Leh (On the way to Chang La)"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/NAROPA-PHOTANG-NUNNERY.jpg", "Naropa Photang Nunnery", "Near Leh Town"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/ALCHI-MONASTERY.jpg", "Alchi Monastery", "Sham Valley"));
        lehAttractions.add(new Place("https://upload.wikimedia.org/wikipedia/commons/3/3b/Lamayuru_Gompa_from_west.jpg", "Lamayuru Monastery", "On Srinagar - Kargil – Leh Road"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Pangong-Lake.jpg", "Pangong Lake", "140 kilometres from Leh via Chang La"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/GURUDWARA-PATHHAR-SAHIB_Etta-Talwar-Dutta.jpg", "Gurudwara Pathhar Sahib", "On the road from Leh to Sham Valley"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Basgo-Monastery-Leh.jpg", "Basgo Monastery", "Basgo"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Jama-Masjid-Leh.jpg", "Jama Masjid Leh", "Main Bazaar, Leh"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Phyang-Monastery-Leh.jpg", "Phyang Monastery", "Leh Srinagar Highway, Leh"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Namgyal-Tsemo-Monastery-Leh.jpg", "Namgyal Tsemo Monastery", "Namgyal Hill, Leh"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Samstanling-Monastery-Leh.jpg", "Samstanling Monastery", "Sumur, Leh"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Sankar-Monastery.jpg", "Sankar Monastery", "Leh"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Magnetic-Hill-Leh.jpg", "Magnetic Hill", "Leh, Ladakh, Jammu and Kashmir"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/LIKIR-MONASTERY_Etta%20Talwar%20Dutta_0.jpg", "Likir Monastery", "Likir"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Alchi-Monastery-leh.jpg", "Alchi Monastery", "Alchi"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Nubhra-Valley.jpg", "Nubra Valley", "Leh"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Zanskar-Leh.jpg", "Zanskar the Virgin Valley", "Leh Ladakh, Jammu and Kashmir"));
        lehAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Sindhu-Ghat-Leh.jpg", "Sindhu Ghat", "Leh"));

        ArrayAdapter lehAttractionsAdapter = new Adapter_attractions(getActivity().getApplicationContext(), lehAttractions);
        ListView listView = rootView.findViewById(R.id.lehAttractionsList);
        listView.setAdapter(lehAttractionsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), LehShantiStupa.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), LehPalace.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), SpitukMonastery.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), ThikseyMonastery.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), HemisMonastery.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), NaropaPhotangNunnery.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), AlchiMonastery.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), LamayuruMonastery.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), PangongLake.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getActivity(), GurudwaraPathharSahib.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getActivity(), BasgoMonastery.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getActivity(), JamaMasjidLeh.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getActivity(), PhyangMonastery.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getActivity(), NamgyalTsemoMonastery.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(getActivity(), SamstanlingMonastery.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(getActivity(), SankarMonastery.class);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(getActivity(), MagneticHill.class);
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17 = new Intent(getActivity(), LikirMonastery.class);
                        startActivity(intent17);
                        break;
                    case 18:
                        Intent intent18 = new Intent(getActivity(), NubraValley.class);
                        startActivity(intent18);
                        break;
                    case 19:
                        Intent intent19 = new Intent(getActivity(), ZanskarVirginValley.class);
                        startActivity(intent19);
                        break;
                    case 20:
                        Intent intent20 = new Intent(getActivity(), SindhuGhat.class);
                        startActivity(intent20);
                        break;
                }
            }
        });


        return rootView;
    }
}
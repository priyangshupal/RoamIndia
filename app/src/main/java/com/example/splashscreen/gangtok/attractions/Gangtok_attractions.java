package com.example.splashscreen.gangtok.attractions;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.splashscreen.Adapters.Adapter_attractions;
import com.example.splashscreen.R;
import com.example.splashscreen.main.Place;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Gangtok_attractions extends Fragment {


    public Gangtok_attractions() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_gangtok_attractions, container, false);

        ArrayList<Place> gangtokAttractions = new ArrayList<>();
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/TSOMGO-LAKE-Pranav-Bhasin.jpg", "Tsomgo Lake", "On the way to Nathu La, Gangtok"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/Do-Drul-Chorten-Pranav-Bhasin.jpg", "Do Drul Chorten", "Gangtok, Sikkim"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/RUMTEK-MONASTERY-flowcomm-Flickr-Creative-commons.jpg", "Rumtek Monastery", "Gangtok, Sikkim"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/NATHU-LA-PASS-sudeep1106-Flickr-Creative-commons.jpg", "Nathu La Pass", "2 hours from Gangtok on Indo-China Border"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/Singhik-View-Point-Pranav-Bhasin.jpg", "Singhik Viewpoint", "4 kilometres from Mangan on North Sikkim Highway"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/BANJHAKRI-FALLS-Giridhar-Appaji-Nag-Y-Flickr-Creative-commons.jpg", "Banjhakri Falls", "Gangtok, Sikkim"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/Tashi-Viewpoint-Pranav-Bhasin.jpg", "Tashi Viewpoint", "4 kilometres from Gangtok"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/Seven-Sisters-Waterfall-Jason-Pratt-Flickr-Creative-commons.jpg", "Seven Sisters Waterfall", "32 kilometres from Gangtok"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/Kabi-Longstok-Pranav-Bhasin.jpg", "Kabi Lungchok", "17 kilometres from Gangtok"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/2_Phurchachu-Hot-Springs.jpg", "Phurchachu Hot Springs", "25 kilometres from Gyalsing"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/3_Flower-Exhibition-Centre.jpg", "Flower Exhibition Centre", "Extras Ridge Park, Gangtok"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/1_Tsuk-La-Khang-Monastery-in-Gangtok.jpg", "Tsuk La Khang Monastery", "The Royal Chapel, Gangtok"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/5_Saramsa-Garden.jpg", "Saramsa Garden", "14 kilometres from Gangtok"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/6_Himalayan-Zoological-Park.jpg", "Himalayan Zoological Park", "Himalayan Zoological Park, Forest Secretariat, Deorali"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/4_Deer-Park.jpg", "Deer Park", "Gangtok, East Sikkim District"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/8_Shingba-Rhododendron-Sanctuary.jpg", "Shingba Rhododendron Sanctuary", "Near Lachen in North Sikkim district"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/7_Mt-Katao.jpg", "Mt Katao", "Lachung, Gangtok, India"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/9_Khangchendzonga-Biosphere-Reserve.jpg", "Khangchendzonga Biosphere Reserve", "Gangtok, India"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/10_Fambong-La-Wildlife-Sanctuary.jpg", "Fambong La Wildlife Sanctuary", "20 kilometres away from Gangtok"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/TASHIDING-MONASTERY-walter-callens-.jpg", "Tashiding Monastery", "Near Gangtok, Sikkim"));
        gangtokAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/gangtok/HANUMAN-TOK-Giridhar-Appaji-Nag-wikimedia-commons.jpg", "Hanuman Tok", "Gangtok, Sikkim"));

        ArrayAdapter gangtokAttractionsAdapter = new Adapter_attractions(getActivity().getApplicationContext(), gangtokAttractions);
        ListView listView = rootView.findViewById(R.id.gangtokAttractionsList);
        listView.setAdapter(gangtokAttractionsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), TsomgoLake.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), DoDrulChorten.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), RumtekMonastery.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), NathuLaPass.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), SinghikViewpoint.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), BanjhakriFalls.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), TashiViewpoint.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), SevenSistersWaterfall.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), KabiLungchok.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getActivity(), PhurchachuHotSprings.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getActivity(), FlowerExhibitionCentre.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getActivity(), TsukLaKhangMonastery.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getActivity(), SaramsaGarden.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getActivity(), HimalayanZoologicalPark.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(getActivity(), DeerPark.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(getActivity(), ShingbaRhododendronSanctuary.class);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(getActivity(), MtKatao.class);
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17 = new Intent(getActivity(), KhangchendzongaBiosphereReserve.class);
                        startActivity(intent17);
                        break;
                    case 18:
                        Intent intent18 = new Intent(getActivity(), FambongLaWildlifeSanctuary.class);
                        startActivity(intent18);
                        break;
                    case 19:
                        Intent intent19 = new Intent(getActivity(), TashidingMonastery.class);
                        startActivity(intent19);
                        break;
                    case 20:
                        Intent intent20 = new Intent(getActivity(), HanumanTok.class);
                        startActivity(intent20);
                        break;
                }
            }
        });

        return rootView;
    }

}

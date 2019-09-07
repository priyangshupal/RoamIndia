package com.example.splashscreen.bangalore.attraction;


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
public class Bangalore_attractions extends Fragment {


    public Bangalore_attractions() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_bangalore_attractions, container, false);

        ArrayList<Place> bangaloreAttractions = new ArrayList<>();
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Tipu-Sultan-Palace-Sean-Ellis-Flickr-Creative-commons.jpg", "Tipu Sultan’s Palace", "Albert Victor Road, Chamrajpet"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Cubbon-Park-Samuel-Jacob-Flickr-Creative-commons.jpg", "Cubbon Park", "2nd Cross Road, Gandhi Nagar, Kasturba Road, Gandhinagar"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Vidhan-Soudha.jpg", "Vidhan Soudha", "Dr. Ambedkar Road, Sampangiram Nagar"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Lal-Bagh-Cyphor-wikipedia.jpg", "Lal Bagh", "Upparahalli, Mavalli"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Bannerghatta-National-Park-Prateek-Rungta-Flickr-Creative-commons.jpg", "Bannerghatta National Park", "Bannerghatta Biological Park, Bannerghatta, Bangaluru"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Bangalore-Palace.jpg", "Bangalore Palace", "Jayamahal Main Road, Armane Nagar"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Wonderla-Amusement-Park.jpg", "Wonderla Amusement Park", "Near Bidadi, 28 kilometres from Bangalore"));
        bangaloreAttractions.add(new Place("https://upload.wikimedia.org/wikipedia/commons/6/6e/01_Innovative_Film_city_Bangalore_104113.jpg", "Innovative Film City", "Bidadi Industrial Estate, Bidadi, Bengaluru"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Lumbini-Gardens-in-Bangalore-Rameshng-wikimedia.jpg", "Lumbini Gardens", "Nagawara Lake, Ring Rd, Hebbal, Bangalore"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Lalbagh-Botanical-Garden-in-Bangalore-PP-Yoonus-wikimedia.jpg", "LalBagh Botanical Garden", "Lal Bagh Road, Lalbagh, Mavalli"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Dodda-Ganesha-Temple_Bangalore.jpg", "Dodda Ganesha Temple", "Bull Temple Road, Basavanagudi, Bangalore"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Bull-Temple-in-Bangalore-Phil-Whitehouse-flickr.jpg", "Bull Temple", "Bull Temple Rd, Basavanagudi, Bangalore"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Fun-World-in-Bangalore-Abhishek-Kumar-flickr.jpg", "Fun World", "Jayamahal Road, Off Palace Grounds Inner Rd, Opposite TV Tower, J.C Nagar"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Devanahalli-Fort-in-Bangalore-Dushyant-Naresh-wikimedia.jpg", "Sree Siddaganga Mutt", "Siddaganga Mata Rd, Sri Siddaganga Kshetra, Tumkur"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Gavi-Gangadhareshwara-Temple-in-Bangalore-Pavithrah-wikimedia_0.jpg", "Gavi Gangadhareshwara Temple", "Lakshmipura Main Road, Gavipuram, Bangalore"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Chikmagalur-in-Bangalore-Premnath-Thirumalaisamy-flickr.jpg", "Chikmagalur", "Chikmagalur, Karnataka"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Vidhana-Soudha-and-Attara-Kacheri-in-Bangalore_0.jpg", "Visvesvaraya Industrial and Technological Museum", "Kasturba road, Bangalore"));
        bangaloreAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Savandurga-in-Bangalore-Pavithrah-wikimedia.jpg", "Savandurga", "Off the Magadi Road, Karnataka"));
        bangaloreAttractions.add(new Place("https://destinationksa.com/wp-content/uploads/2017/01/lam-art-2.jpg", "National Gallery of Modern Art", "Manikyavelu Mansion, 49, Palace Road"));

        ArrayAdapter bangaloreAttractionsAdapter = new Adapter_attractions(getActivity().getApplicationContext(), bangaloreAttractions);
        ListView listView = rootView.findViewById(R.id.bangaloreAttractionsList);
        listView.setAdapter(bangaloreAttractionsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), TipuSultanPalace.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), CubbonPark.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), VidhanSoudha.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), LalBagh.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), BannerghattaNationalPark.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), BangalorePalace.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), Wonderla.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), InnovativeFilmCity.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), LumbiniGardens.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getActivity(), LalBaghBotanicalGarden.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getActivity(), DoddaGaneshaTemple.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getActivity(), BullTemple.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getActivity(), FunWorld.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getActivity(), SreeSiddagangaMutt.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(getActivity(), GaviGangadhareshwaraTemple.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(getActivity(), Chikmagalur.class);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(getActivity(), VisvesvarayaIndustrialTechnologicalMuseum.class);
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17 = new Intent(getActivity(), Savandurga.class);
                        startActivity(intent17);
                        break;
                    case 18:
                        Intent intent18 = new Intent(getActivity(), NationalGalleryofModernArt.class);
                        startActivity(intent18);
                        break;
                }
            }
        });

        return rootView;
    }
}

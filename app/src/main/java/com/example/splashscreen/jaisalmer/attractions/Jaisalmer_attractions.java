package com.example.splashscreen.jaisalmer.attractions;


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

import com.example.splashscreen.R;
import com.example.splashscreen.Adapters.Adapter_attractions;
import com.example.splashscreen.main.Place;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Jaisalmer_attractions extends Fragment {


    public Jaisalmer_attractions() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_jaisalmer_attractions, container, false);

        ArrayList<Place> jaisalmerAttractions = new ArrayList<>();
        jaisalmerAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Jaisalmer-Fort.jpg", "Jaisalmer Fort", "Dhibba Para, Manak Chowk, Amar Sagar Pol"));
        jaisalmerAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Patwon-Ki-Haveli.jpg", "Patwon Ki Haveli", "Near Patwa Complex"));
        jaisalmerAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Salim-Singh-ki-Haveli.jpg", "Salim Singh ki Haveli", "Near the railway station, Jaisalmer"));
        jaisalmerAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Jain-Temples-%20Patrick%20Denker-Flickr%20Creative%20commons.jpg", "Jain Temples", "Located within Jaisalmer Fort"));
        jaisalmerAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Nath-Mal-ki-Haveli-Manoj-Kengudelu-Flickr-Creative-commons.jpg", "Nath Mal ki Haveli", "Amar Sagar Pol"));
        jaisalmerAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Bada-Bagh-Antoine-Taveneaux-wikimedia-commons.jpg", "Bada Bagh", "Ramgarh"));
        jaisalmerAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Vyas-Chhatri-Jaisalmer.jpg", "Vyas Chhatri", "Bada bagh, Jaisalmer"));
        jaisalmerAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Khaba-Fort-Jaisalmer.jpg", "Khaba Fort", "Khaba, Jaisalmer"));
        jaisalmerAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Maharajas-Palace-Jaisalmer.jpg", "Maharaja's Palace", "Jaisalmer Fort Palace"));
        jaisalmerAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Desert-Culture-Centre-and-Museum-Pablo-Nicol%C3%A1s-Taibi-Cicare-Flickr-Creative-commons.jpg", "Desert Culture Centre and Museum", "Gadisar Road, Jaisalmer"));

        ArrayAdapter jaisalmerAttractionsList = new Adapter_attractions(getActivity().getApplicationContext(), jaisalmerAttractions);
        ListView listView = rootView.findViewById(R.id.jaisalmerAttractionsList);
        listView.setAdapter(jaisalmerAttractionsList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), JaisalmerFort.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), PatwonKiHaveli.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), SalimSinghkiHaveli.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), JainTemples.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), NathMalkiHaveli.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), BadaBagh.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), VyasChhatri.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), KhabaFort.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), MaharajaPalace.class);
                        startActivity(intent8);
                        break;
                }
            }
        });

        return rootView;
    }

}

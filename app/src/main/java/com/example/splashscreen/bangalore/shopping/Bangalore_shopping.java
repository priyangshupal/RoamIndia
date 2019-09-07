package com.example.splashscreen.bangalore.shopping;


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
public class Bangalore_shopping extends Fragment {

    public Bangalore_shopping() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_bangalore_shopping, container, false);

        ArrayList<Place>bangaloreShopping = new ArrayList<>();
        bangaloreShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/UB-City-jeff-Flickr-Creative-commons.jpg", "UB City", "24, Vittal Mallya Road"));
        bangaloreShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/The-Bombay-Store.jpg", "The Bombay Store", "1 MG Mall, Unit no 9, 1st Floor, 1/2 Swami Vivekananda Road"));
        bangaloreShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Commercial-Street-Ananth-BS-Flickr-Creative-commons.jpg", "Commercial Street" ,"Commercial Street, Tasker Town, Shivajinagar"));
        bangaloreShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Orion-Mall.jpg", "Orion Mall", "Dr Rajkumar Road, Subramanyanagar, Rajajinagar"));
        bangaloreShopping.add(new Place("https://www.holidify.com/images/cmsuploads/compressed/M1_20170922193029.PNG", "Brigade Road", "Brigade road"));
        bangaloreShopping.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Bannerghatta-Road.jpg", "Bannerghatta Road", "22 kilometres southwest of Bangalore"));
        bangaloreShopping.add(new Place("https://imgstaticcontent.lbb.in/lbbnew/wp-content/uploads/sites/2/2016/02/Phoenix_Market_city-f.jpg", "Phoenix Mall", "Mahadevapura, Whitefield Road"));
        bangaloreShopping.add(new Place("https://image3.mouthshut.com/images/ImagesR/2009/6/The-Forum-Bangalore-925077993-1228147-1.jpg", "The Forum Mall", "The Forum, No. 21, Hosur Road"));

        ArrayAdapter bangaloreShoppingAdapter = new Adapter_shopping(getActivity().getApplicationContext(), bangaloreShopping);
        ListView listView = rootView.findViewById(R.id.bangaloreShoppingList);
        listView.setAdapter(bangaloreShoppingAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), UBcity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), TheBombayStore.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), CommercialStreet.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), OrionMall.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), BrigadeRoad.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), BannerghattaRoad.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), PhoenixMall.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), TheForumMall.class);
                        startActivity(intent7);
                        break;
                }
            }
        });

        return rootView;
    }
}

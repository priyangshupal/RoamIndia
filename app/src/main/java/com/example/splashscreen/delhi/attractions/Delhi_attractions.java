package com.example.splashscreen.delhi.attractions;

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
import com.example.splashscreen.main.Place;
import com.example.splashscreen.R;

import java.util.ArrayList;

public class Delhi_attractions extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_delhi_attractions, container, false);

        ArrayList<Place> delhiAttractions = new ArrayList<>();
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Qutub-Minar-Delhi.jpg", "Qutub Minar", "Mehrauli"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/The-Canopy-Delhi.jpg", "The Canopy", "Near India Gate, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Coronation-Durbar-Park-Delhi.jpg", "Coronation Durbar Park", "Bhai Parmanand Marg, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Humayuns-Tomb-Delhi.jpg", "Humayun's Tomb", "Mathura Road, opposite the Nizamuddin Dargah."));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/India-Gate-Delhi.jpg", "India Gate", "New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Lodi-Garden-Delhi.jpg", "Lodi Gardens", "Lodhi Road, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Safdarjungs-Tomb-Delhi.jpg", "Safdarjung's Tomb", "Lodi Estate, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Red-Fort-Delhi.jpg", "Red Fort (Lal Qila)", "Netaji Subhash Road, Chandini Chowk, Old Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Isa-Khans-Tomb-Delhi.jpg", "Isa Khan's Tomb", "Nizamuddin, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Alai-Darwaza-Delhi.jpg", "Alai Darwaza", "Qutub Minar Complex, Mehrauli, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Jama-Masjid-Delhi.jpg", "Jama Masjid", "Chandini Chowk, Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Mehrauli-Archaeological-Park-Delhi.jpg", "Mehrauli Archaeological Park", "Opposite Qutub Minar Metro Station, Mehrauli, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Alai-Minar-Delhi.jpg", "Alai Minar", "Qutub Minar Complex, Mehrauli, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Tomb-of-Khan-i-Khana-Delhi.jpg", "Tomb of Khan-i-Khana", "Nizamuddin East, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Diwan-i-Khas-Delhi.jpg", "Diwan-i-Khas", "Netaji Subhash Road, Chandini Chowk, Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Tomb-of-Imam-Zamin-Delhi.jpg", "Tomb of Imam Zamin", "Qutub Minar Complex, Mehrauli, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Ajmeri-Gate-Delhi.jpg", "Ajmeri Gate", "Chandni Chowk, Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Qila-Rai-Pithora-Delhi.jpg", "Qila Rai Pithora", "Sainik Farms, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Hauz-Khas-Village-Delhi.jpg", "Hauz Khas Village", "Near Green Park, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Purana-Qila-Delhi.jpg", "Purana Qila (Old Fort)", "Mathura Road (near Delhi Zoo), New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Khirki-Masjid-Delhi.jpg", "Khirki Masjid", "Malviya Nagar, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Tughlaqabad-Fort-Delhi.jpg", "Tughlaqabad Fort", "Mehrauli-Badarpur Road, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Jamali-Kamali-Mosque-and-Tomb-Delhi.jpg", "Jamali Kamali Mosque", "Archeological Village Complex, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Khairul-Manzil-Masjid-Delhi.jpg", "Khairul Manzil Masjid", "Archeological Village Complex, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Parliament-House-Delhi.jpg", "Parliament House", "Sansad Marg, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Shantivan-Delhi.jpg", "Shantivan", "Mahatma Gandhi Marg, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Raj-Ghat-Delhi.jpg", "Raj Ghat", "Daryaganj, Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Jantar-Mantar-Delhi.jpg", "Jantar Mantar", "Sansad Marg, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Vishwa-Shanti-Stupa-Delhi.jpg", "Vishwa Shanti Stupa", "Indraprastha Park, Ring Road, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Rang-Mahal-Delhi.jpg", "Rang Mahal", "Indraprastha Park, Ring Road, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Rashtrapati-Bhavan-Delhi.jpg", "Rashtrapati Bhavan", "President's Estate, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Lotus-Temple-Delhi.jpg", "Lotus Temple", "Bahapur, Kalkaji, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Nehru-park-Delhi.jpg", "Nehru Park", "Vinay Marg, Chanakyapuri, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Swaminarayan-Akshardham-Temple-Delhi.jpg", "Akshardham Temple", "National Highway 24, near Noida More, New Delhi"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Kingdom-of-Dreams-Delhi.jpg", "Kingdom of Dreams", "Sector 29, Gurgaon, Haryana"));
        delhiAttractions.add(new Place("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Connaught-Place-Delhi.jpg", "Connaught Place", "New Delhi"));
        delhiAttractions.add(new Place("https://ihpl.b-cdn.net/pictures/travelguide/attractions/nehru-museum-and-planetarium-head-3609.jpeg", "Nehru Planetarium", "Janpath, near Conaught Place, New Delhi"));


        ArrayAdapter delhiAttractionsAdapter = new Adapter_attractions(getActivity().getApplicationContext(), delhiAttractions);
        ListView listView = rootView.findViewById(R.id.delhiAttractionsList);
        listView.setAdapter(delhiAttractionsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), QutubMinar.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), Canopy.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), CoronationDurbar.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), HumayunTomb.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), IndiaGate.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), LodiGarden.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), Safdarjung.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), LalQila.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), IsaKhan.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getActivity(), AlaiDarwaza.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getActivity(), JamaMasjid.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getActivity(), MehrauliArchaeologicalPark.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getActivity(), AlaiMinar.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getActivity(), TombofKhan.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(getActivity(), DiwaniKhas.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(getActivity(), TombofImamZamin.class);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(getActivity(), AjmeriGate.class);
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17 = new Intent(getActivity(), QilaRaiPithora.class);
                        startActivity(intent17);
                        break;
                    case 18:
                        Intent intent18 = new Intent(getActivity(), HauzKhasVillageAttractions.class);
                        startActivity(intent18);
                        break;
                    case 19:
                        Intent intent19 = new Intent(getActivity(), PuranaQila.class);
                        startActivity(intent19);
                        break;
                    case 20:
                        Intent intent20 = new Intent(getActivity(), KhirkiMasjid.class);
                        startActivity(intent20);
                        break;
                    case 21:
                        Intent intent21 = new Intent(getActivity(), TughlaqabadFort.class);
                        startActivity(intent21);
                        break;
                    case 22:
                        Intent intent22 = new Intent(getActivity(), JamaliKamaliMosque.class);
                        startActivity(intent22);
                        break;
                    case 23:
                        Intent intent23 = new Intent(getActivity(), KhairulManzilMasjid.class);
                        startActivity(intent23);
                        break;
                    case 24:
                        Intent intent24 = new Intent(getActivity(), ParliamentHouse.class);
                        startActivity(intent24);
                        break;
                    case 25:
                        Intent intent25 = new Intent(getActivity(), Shantivan.class);
                        startActivity(intent25);
                        break;
                    case 26:
                        Intent intent26 = new Intent(getActivity(), RajGhat.class);
                        startActivity(intent26);
                        break;
                    case 27:
                        Intent intent27 = new Intent(getActivity(), JantarMantar.class);
                        startActivity(intent27);
                        break;
                    case 28:
                        Intent intent28 = new Intent(getActivity(), VishwaShantiStupa.class);
                        startActivity(intent28);
                        break;
                    case 29:
                        Intent intent29 = new Intent(getActivity(), RangMahal.class);
                        startActivity(intent29);
                        break;
                    case 30:
                        Intent intent30 = new Intent(getActivity(), RashtrapatiBhavan.class);
                        startActivity(intent30);
                        break;
                    case 31:
                        Intent intent31 = new Intent(getActivity(), LotusTemple.class);
                        startActivity(intent31);
                        break;
                    case 32:
                        Intent intent32 = new Intent(getActivity(), NehruPark.class);
                        startActivity(intent32);
                        break;
                    case 33:
                        Intent intent33 = new Intent(getActivity(), AkshardhamTemple.class);
                        startActivity(intent33);
                        break;
                    case 34:
                        Intent intent34 = new Intent(getActivity(), KingdomofDreams.class);
                        startActivity(intent34);
                        break;
                    case 35:
                        Intent intent35 = new Intent(getActivity(), ConnaughtPlaceAttractions.class);
                        startActivity(intent35);
                        break;
                    case 36:
                        Intent intent36 = new Intent(getActivity(), NehruPlanetarium.class);
                        startActivity(intent36);
                        break;
                }
            }
        });

        return rootView;
    }
}

package com.example.shosho.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link sharmFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class sharmFragment extends Fragment {

    ArrayList<Citiesclass> cities;

    public sharmFragment() {
        // Required empty public constructor
    }

    public static sharmFragment newInstance(String param1, String param2) {
        sharmFragment fragment = new sharmFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sharm, container, false);
        cities=new ArrayList<>();
        ListView list;
        final String[] itemname = {
                getActivity().getString(R.string.alf),
                getActivity().getString(R.string.Akwa),
                getActivity().getString(R.string.Safari),
                getActivity().getString(R.string.Al_souq),
                getActivity().getString(R.string.khaleg)
        };
        final String[] description = {
                getActivity().getString(R.string.Sharm_Elsheikh),
                getActivity().getString(R.string.Sharm_Elsheikh),
                getActivity().getString(R.string.Sharm_Elsheikh),
                getActivity().getString(R.string.Sharm_Elsheikh),
                getActivity().getString(R.string.Sharm_Elsheikh)
        };

        Integer[] imgid = {
                R.drawable.alf_lyala,
                R.drawable.akwa_park,
                R.drawable.safari,
                R.drawable.alsouq_elsha3bi,
                R.drawable.khaleg_ne3ma,

        };
        for(int i=0;i<5;i++)
        {
            Citiesclass city=new Citiesclass(itemname[i],description[i],imgid[i]);
            cities.add(city);
        }

        CitiesCustomListAdapter adapter = new CitiesCustomListAdapter(sharmFragment.this.getActivity(),R.layout.cities_layout, cities);
        list = (ListView) view.findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String Slecteditem = itemname[+position];
                Toast.makeText(sharmFragment.this.getActivity(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
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


public class alexFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER




    ArrayList<Citiesclass> cities;

    public alexFragment() {
        // Required empty public constructor
    }


    public static alexFragment newInstance(String param1, String param2) {
        alexFragment fragment = new alexFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alex, container, false);
        // Inflate the layout for this fragment
        ListView list;
        cities=new ArrayList<>();
        final String[] itemname = {
                getActivity().getString(R.string.Bibliotheca),
                getActivity().getString(R.string.Catacombs),
                getActivity().getString(R.string.Montazah),
                getActivity().getString(R.string.pompeyes),
                getActivity().getString(R.string.Qaitbey)

        };
        final String[] description = {
                getActivity().getString(R.string.Alexandria),
                getActivity().getString(R.string.Alexandria),
                getActivity().getString(R.string.Alexandria),
                getActivity().getString(R.string.Alexandria),
                getActivity().getString(R.string.Alexandria)

        };

        Integer[] imgid = {
                R.drawable.bibliotheca_alex,
                R.drawable.catacombs_of_kom_hokafa,
                R.drawable.montazah_palace,
                R.drawable.pompeyes_pillar,
                R.drawable.qaitbay_citadel

        };

        for(int i=0;i<5;i++)
        {
            Citiesclass city=new Citiesclass(itemname[i],description[i],imgid[i]);
            cities.add(city);
        }

        list = (ListView) view.findViewById(R.id.list);
        CitiesCustomListAdapter adapter = new CitiesCustomListAdapter(alexFragment.this.getActivity(),R.layout.cities_layout,cities);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String Slecteditem = itemname[+position];
                Toast.makeText(alexFragment.this.getActivity(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}


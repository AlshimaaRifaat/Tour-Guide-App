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
 * Use the {@link gizaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class gizaFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

ArrayList<Citiesclass> cities;
    // TODO: Rename and change types of parameters

    public gizaFragment() {
        // Required empty public constructor
    }


    public static gizaFragment newInstance(String param1, String param2) {
        gizaFragment fragment = new gizaFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_giza, container, false);
        cities=new ArrayList<>();
        ListView list;
        final String[] itemname = {
                getActivity().getString(R.string.Egyptian),
                getActivity().getString(R.string.GizaP),
                getActivity().getString(R.string.Great),
                getActivity().getString(R.string.Pyramids),
                getActivity().getString(R.string.Pharonic)
        };
        final String[] description = {
                getActivity().getString(R.string.giza_desc),
                getActivity().getString(R.string.giza_desc),
                getActivity().getString(R.string.giza_desc),
                getActivity().getString(R.string.giza_desc),
                getActivity().getString(R.string.giza_desc)
        };

        Integer[] imgid = {
                R.drawable.egyptian_meuseum,
                R.drawable.giza_plateau,
                R.drawable.great_sphinx,
                R.drawable.pyramids,
                R.drawable.pharonic_village,

        };
        Citiesclass []city=new Citiesclass[5];
        for(int i=0;i<5;i++)
        {
            city[i]=new Citiesclass(itemname[i],description[i],imgid[i]);
            cities.add(city[i]);
        }

        list = (ListView) view.findViewById(R.id.list);
        CitiesCustomListAdapter adapter = new CitiesCustomListAdapter(gizaFragment.this.getActivity(),R.layout.cities_layout, cities);
        list.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String Slecteditem = itemname[+position];
                Toast.makeText(gizaFragment.this.getActivity(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}

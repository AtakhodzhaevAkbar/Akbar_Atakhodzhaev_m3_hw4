package com.example.akbar_atakhodzhaev_m3_hw4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ContinentsFragment extends Fragment {

    private String[] continents = {"Африка", "Азия", "Европа", "Северная Америка", "Южная Америка", "Австралия"};

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_continents, container, false);

        ListView continentListView = view.findViewById(R.id.continent_list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, continents);
        continentListView.setAdapter(adapter);

        continentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String selectedContinent = continents[position];
                ((MainActivity) requireActivity()).openFragment2(selectedContinent);
            }
        });

        return view;
    }
}

package com.example.akbar_atakhodzhaev_m3_hw4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class CountriesFragment extends Fragment {

    private TextView countryTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_countries, container, false);
        countryTextView = view.findViewById(R.id.country_text_view);
        return view;
    }


    @SuppressLint("SetTextI18n")
    public void displayCountries(String continent) {
        if (countryTextView != null) {
            String[] countries = getCountriesForContinent(continent);
            if (countries.length > 0) {
                StringBuilder countryList = new StringBuilder();
                for (int i = 0; i < Math.min(countries.length, 5); i++) {
                    countryList.append(countries[i]);
                    countryList.append("\n");
                }
                countryTextView.setText(countryList.toString());
            } else {
                countryTextView.setText("Нет данных о странах для континента " + continent);
            }
        }
    }




    private String[] getCountriesForContinent(String continent) {
        switch (continent) {
            case "Африка":
                return new String[]{"Египет", "Кения", "Нигерия", "ЮАР", "Эфиопия", "Гана", "Марокко", "Камерун"};
            case "Азия":
                return new String[]{"Китай", "Индия", "Индонезия", "Пакистан", "Бангладеш", "Япония", "Филиппины", "Вьетнам"};
            case "Европа":
                return new String[]{"Франция", "Германия", "Италия", "Испания", "Великобритания", "Украина", "Польша", "Нидерланды"};
            case "Северная Америка":
                return new String[]{"США", "Канада", "Мексика", "Куба", "Ямайка", "Гаити", "Багамы", "Коста-Рика"};
            case "Южная Америка":
                return new String[]{"Бразилия", "Аргентина", "Колумбия", "Чили", "Перу", "Венесуэла", "Эквадор", "Боливия"};
            case "Австралия":
                return new String[]{"Австралия", "Новая Зеландия", "Папуа-Новая Гвинея", "Фиджи", "Соломоновы острова", "Тонга", "Ниуэ", "Вануату"};
        }
        return new String[0];
    }

    }

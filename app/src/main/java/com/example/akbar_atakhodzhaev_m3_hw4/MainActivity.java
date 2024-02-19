package com.example.akbar_atakhodzhaev_m3_hw4;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.akbar_atakhodzhaev_m3_hw4.ContinentsFragment;
import com.example.akbar_atakhodzhaev_m3_hw4.CountriesFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openFragment1();
    }

    public void openFragment1() {
        ContinentsFragment fragment1 = new ContinentsFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment1);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void openFragment2(String continent) {
        CountriesFragment fragment2 = new CountriesFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment2);
        transaction.addToBackStack(null);
        transaction.commit();
        getSupportFragmentManager().executePendingTransactions();
        fragment2.displayCountries(continent);
    }

}

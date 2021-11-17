package com.example.ncatmap2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.ncatmap2.ui.notes.NotesActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNav;
    final FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bottomNav = findViewById(R.id.nav_view);
        bottomNav.setOnItemSelectedListener(item -> {
            Fragment fragment;
            switch(item.getItemId()) {
                case R.id.navH:
                    Intent i = new Intent(this, NotesActivity.class);
                    startActivity(i);
            }
            return true;
        });


    }
}
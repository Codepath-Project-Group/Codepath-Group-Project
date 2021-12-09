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
        setContentView(R.layout.activity_main_welcome);
        bottomNav = findViewById(R.id.navView);
        bottomNav.setOnItemSelectedListener(item -> {
            Intent i;
            switch(item.getItemId()) {
                case R.id.action_compose:
                     i = new Intent(this, NotesActivity.class);
                    startActivity(i);
                    break;
                case R.id.action_home:
                    i = new Intent(this, MainActivity.class);
                    startActivity(i);

            }
            return true;
        });


    }
}
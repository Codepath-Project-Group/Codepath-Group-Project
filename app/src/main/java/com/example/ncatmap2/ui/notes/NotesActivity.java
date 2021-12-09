package com.example.ncatmap2.ui.notes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.ncatmap2.R;
import com.example.ncatmap2.fragments.ComposeFragment;
import com.example.ncatmap2.fragments.NotesFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NotesActivity extends AppCompatActivity {

    public static final String TAG = "NotesActivity";

    final FragmentManager fragmentManager = getSupportFragmentManager();
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        bottomNavigationView = findViewById(R.id.navView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()) {
                    //TODO: update fragment
                    case R.id.action_home:
                        Toast.makeText(NotesActivity.this, "Home!", Toast.LENGTH_SHORT).show();
                        fragment = new ComposeFragment();
                        break;
                    case R.id.action_compose:
                        Toast.makeText(NotesActivity.this, "Compose!", Toast.LENGTH_SHORT).show();
                        fragment = new ComposeFragment();
                        break;
                    case R.id.action_profile:
                    default:
                        //TODO: update fragment
                        Toast.makeText(NotesActivity.this, "Profile!", Toast.LENGTH_SHORT).show();
                        fragment = new NotesFragment();
                        break;
                }
                fragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit();
                return true;
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.action_home);
    }


}
package com.example.ncatmap2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.ncatmap2.ui.notes.NotesActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    /*private ActivityMainBinding binding;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);

         binding = ActivityMainBinding.inflate(getLayoutInflater());
         setContentView(binding.getRoot());

         BottomNavigationView navView = findViewById(R.id.nav_view);
         // Passing each menu ID as a set of Ids because each
         // menu should be considered as top level destinations.
         AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                 R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                 .build();
         NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
         NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
         NavigationUI.setupWithNavController(binding.navView, navController);

     }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        Button btnConfirm = findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NotesActivity.class);
                Log.i(TAG, "Button Clicked");
                startActivity(intent);
            }
        });
    }




}
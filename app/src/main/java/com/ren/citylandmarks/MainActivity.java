package com.ren.citylandmarks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Landmark anitkabir = new Landmark("Anıtkabir", "Ankara", R.drawable.anitkabir_1);
        Landmark coloseum = new Landmark("Colosseum", "Rome", R.drawable.colosseum_1);
        Landmark eiffeltower = new Landmark("Eiffel Tower", "Paris", R.drawable.eiffeltower_1);
        Landmark pisatower = new Landmark("Pisa Tower", "Pisa", R.drawable.pisatower_1);


    }
}
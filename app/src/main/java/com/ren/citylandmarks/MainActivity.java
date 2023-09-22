package com.ren.citylandmarks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.ren.citylandmarks.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



        landmarkArrayList = new ArrayList<>(); //initializition

        //Data
        Landmark anitkabir = new Landmark("Anıtkabir", "Ankara", R.drawable.anitkabir_1);
        Landmark coloseum = new Landmark("Colosseum", "Rome", R.drawable.colosseum_1);
        Landmark eiffeltower = new Landmark("Eiffel Tower", "Paris", R.drawable.eiffeltower_1);
        Landmark pisatower = new Landmark("Pisa Tower", "Pisa", R.drawable.pisatower_1);

        landmarkArrayList.add(anitkabir);
        landmarkArrayList.add(coloseum);
        landmarkArrayList.add(eiffeltower);
        landmarkArrayList.add(pisatower);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterLandmark adapterLandmark = new AdapterLandmark(landmarkArrayList);
        binding.recyclerView.setAdapter(adapterLandmark);


        /*
        //ListView
        //Adapter
        //mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);
        //click
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("landmark", landmarkArrayList.get(i));
                startActivity(intent);

            }
        });

         */








    }
}
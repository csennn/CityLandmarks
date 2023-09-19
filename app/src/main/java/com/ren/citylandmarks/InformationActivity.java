package com.ren.citylandmarks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ren.citylandmarks.databinding.ActivityInformationBinding;

public class InformationActivity extends AppCompatActivity {

    private ActivityInformationBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInformationBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        //casting
        Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");
        binding.nameText.setText(selectedLandmark.name);
        binding.cityText.setText(selectedLandmark.city);
        binding.imageView.setImageResource(selectedLandmark.image);
    }
}
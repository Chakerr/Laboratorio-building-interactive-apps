package com.example.beeradviser;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindPet(View view) {
        TextView breeds = findViewById(R.id.breeds);
        Spinner category = findViewById(R.id.category);
        String petCategory = String.valueOf(category.getSelectedItem());
        Mascotas expert = new Mascotas();
        List<String> breedList = expert.getBreeds(petCategory);
        StringBuilder recommendations = new StringBuilder();
        for (String breed : breedList) {
            recommendations.append(breed).append("\n");
        }
        breeds.setText(recommendations.toString());
    }
}
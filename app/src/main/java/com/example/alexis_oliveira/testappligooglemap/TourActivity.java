package com.example.alexis_oliveira.testappligooglemap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour);

        TextView retour = (TextView) findViewById(R.id.retour);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(TourActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

        TextView localisation = (TextView) findViewById(R.id.localisation);
        localisation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(TourActivity.this, MapsActivity.class);
                Bundle extras = getIntent().getExtras();
                String addTour = extras.getString("address");
                myIntent.putExtra("address", addTour);
                startActivity(myIntent);
            }
        });

        ImageView arrow = (ImageView) findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(TourActivity.this, MapsActivity.class);
                Bundle extras = getIntent().getExtras();
                String addTour = extras.getString("address");
                myIntent.putExtra("address", addTour);
                startActivity(myIntent);
            }
        });
    }
}


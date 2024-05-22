package com.example.syct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.google.android.gms.maps.SupportMapFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    CardView GroupsCard;
    CardView SuportCard;
    CardView FactureCard;
    CardView  ContentCard;
    CardView PlanningCard;
    Button showMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GroupsCard = findViewById(R.id.GroupsCard);
        GroupsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GroupsPhoneActivity.class);
                startActivity(intent);
            }
        });

        SuportCard = findViewById(R.id.SuportCard);
        SuportCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SuportActivity.class);
                startActivity(intent);
            }
        });
        FactureCard = findViewById(R.id.FactureCard);
        FactureCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FactureActivity.class);
                startActivity(intent);
            }
        });
        ContentCard = findViewById(R.id. ContentCard );
        ContentCard .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                startActivity(intent);
            }
        });
        PlanningCard = findViewById(R.id. PlanningCard );
        PlanningCard .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlanningActivity.class);
                startActivity(intent);
            }
        });
        showMap=findViewById(R.id.showMap);
        showMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);


            }
        });

    }
}

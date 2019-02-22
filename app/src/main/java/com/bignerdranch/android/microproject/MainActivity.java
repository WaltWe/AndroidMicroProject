package com.bignerdranch.android.microproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton mRecipe1;
    private ImageButton mRecipe2;
    private ImageButton mRecipe3;
    private ImageButton mRecipe4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecipe1= findViewById(R.id.recipe1); //Pumpkin Pie
        mRecipe2= findViewById(R.id.recipe1); //Pumpkin Bread
        mRecipe3= findViewById(R.id.recipe1); //Pumpkin Jello
        mRecipe4= findViewById(R.id.recipe1); //Pumpkin Coffee

        mRecipe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DisplayRecipeActivity.class);
                intent.putExtra("whichrecipe","PumpkinPie");
                startActivity(intent);
            }
        });

        mRecipe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DisplayRecipeActivity.class);
                intent.putExtra("whichrecipe","PumpkinBread");
                startActivity(intent);
            }
        });

        mRecipe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DisplayRecipeActivity.class);
                intent.putExtra("whichrecipe","PumpkinJello");
                startActivity(intent);
            }
        });

        mRecipe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DisplayRecipeActivity.class);
                intent.putExtra("whichrecipe","PumpkinCoffee");
                startActivity(intent);
            }
        });
    }
}

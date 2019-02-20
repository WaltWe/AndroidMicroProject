package com.bignerdranch.android.microproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mRecipe1;
    private Button mRecipe2;
    private Button mRecipe3;
    private Button mRecipe4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecipe1= (Button) findViewById(R.id.recipe1); //Pumpkin Pie
        mRecipe2= (Button) findViewById(R.id.recipe1); //Pumpkin Bread
        mRecipe3= (Button) findViewById(R.id.recipe1); //Pumpkin Jello
        mRecipe4= (Button) findViewById(R.id.recipe1); //Pumpkin Coffee

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

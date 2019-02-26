package com.bignerdranch.android.microproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayRecipeActivity extends AppCompatActivity {

    private Recipe r;

    private static final String KEY_IMG     = "com.bignerdranch.android.microproject.imgid";
    private static final String KEY_TITLE   = "com.bignerdranch.android.microproject.title";
    private static final String KEY_INGRED  = "com.bignerdranch.android.microproject.ingredients";
    private static final String KEY_STEPS   = "com.bignerdranch.android.microproject.steps";
    private static final String EXTRA_BUNDLE= "com.bignerdranch.android.microproject.bundle";

    private ImageView image;
    private TextView ingredients;
    private TextView steps;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_recipe);

        image = (ImageView) findViewById(R.id.imageView);
        ingredients = (TextView) findViewById(R.id.ingredientsTextView);
        steps = (TextView) findViewById(R.id.stepsTextView);
        title = (TextView) findViewById(R.id.titleTextView);

        //Bundle b = getIntent().getBundleExtra(EXTRA_BUNDLE);
        Bundle b = getIntent().getExtras().getBundle(EXTRA_BUNDLE);
        //Bundle b = savedInstanceState.getBundle(EXTRA_BUNDLE);
        Log.d("DISPLAYRECIPE", b.getString(KEY_TITLE));
        r = new Recipe(b.getString(KEY_TITLE), b.getStringArray(KEY_INGRED), b.getStringArray(KEY_STEPS), b.getInt(KEY_IMG));

        title.setText(r.getmRecipeName());
        image.setImageResource(r.getmPictureID());
        String ingredientText = "";
        for(int i = 0; i < r.getmIngredients().length; i++){
            ingredientText+=r.getmIngredients()[i];
        }
        ingredients.setText(ingredientText);
        String stepText = "";
        for(int i = 0; i < r.getmSteps().length; i++){
            stepText+=r.getmSteps()[i];
        }
        steps.setText(stepText);
    }

    public static Intent newIntent(Context packageContext, Recipe recipe) {
        Intent intent = new Intent(packageContext, DisplayRecipeActivity.class);
        intent.putExtra(EXTRA_BUNDLE, toBundle(recipe));
        return intent;
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putBundle(EXTRA_BUNDLE, toBundle(r));
    }

    private static Bundle toBundle(Recipe recipe) {
        Bundle b = new Bundle();
        b.putInt(KEY_IMG, recipe.getmPictureID());
        b.putString(KEY_TITLE, recipe.getmRecipeName());
        b.putStringArray(KEY_INGRED, recipe.getmIngredients());
        b.putStringArray(KEY_STEPS, recipe.getmSteps());
        return b;
    }
}

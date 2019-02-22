package com.bignerdranch.android.microproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayRecipeActivity extends AppCompatActivity {

    private Recipe r;

    private static final String KEY_IMG     = "com.bignerdranch.android.microproject.imgid";
    private static final String KEY_TITLE   = "com.bignerdranch.android.microproject.title";
    private static final String KEY_INGRED  = "com.bignerdranch.android.microproject.ingredients";
    private static final String KEY_STEPS   = "com.bignerdranch.android.microproject.steps";
    private static final String EXTRA_BUNDLE= "com.bignerdranch.android.microproject.bundle";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_recipe);

        Bundle b = savedInstanceState.getBundle(EXTRA_BUNDLE);
        r = new Recipe(b.getString(KEY_TITLE), b.getStringArray(KEY_INGRED), b.getStringArray(KEY_STEPS), b.getInt(KEY_IMG));
    }

    public Intent newIntent(Context packageContext, Recipe r) {
        Intent intent = new Intent(packageContext, DisplayRecipeActivity.class);
        intent.putExtra(EXTRA_BUNDLE, toBundle());
        return intent;
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putBundle(EXTRA_BUNDLE, toBundle());
    }

    private Bundle toBundle() {
        Bundle b = new Bundle();
        b.putInt(KEY_IMG, r.getmPictureID());
        b.putString(KEY_TITLE, r.getmRecipeName());
        b.putStringArray(KEY_INGRED, r.getmIngredients());
        b.putStringArray(KEY_STEPS, r.getmSteps());
        return b;
    }
}

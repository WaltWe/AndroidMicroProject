package com.bignerdranch.android.microproject;

public class Recipe {
    private String mRecipeName;
    private String[] mIngredients;
    private String[] mSteps;
    private int mPictureID;

    public Recipe(String name, String[] ingredients, String[] steps, int pictureID) {
        mRecipeName = name;
        mIngredients = ingredients;
        mSteps = steps;
        mPictureID = pictureID;
    }

    public String getmRecipeName() {
        return mRecipeName;
    }

    public void setmRecipeName(String mRecipeName) {
        this.mRecipeName = mRecipeName;
    }

    public String[] getmIngredients() {
        return mIngredients;
    }

    public void setmIngredients(String[] mIngredients) {
        this.mIngredients = mIngredients;
    }

    public String[] getmSteps() {
        return mSteps;
    }

    public void setmSteps(String[] mSteps) {
        this.mSteps = mSteps;
    }

    public int getmPictureID() {
        return mPictureID;
    }

    public void setmPictureID(int mPictureID) {
        this.mPictureID = mPictureID;
    }
}

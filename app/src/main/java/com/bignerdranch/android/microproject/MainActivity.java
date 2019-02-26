package com.bignerdranch.android.microproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton mRecipe1;
    private ImageButton mRecipe2;
    private ImageButton mRecipe3;
    private ImageButton mRecipe4;

    private Recipe[] recipies = new Recipe[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecipe1= (ImageButton) findViewById(R.id.recipe1); //Pumpkin Pie
        mRecipe2= findViewById(R.id.recipe2); //Pumpkin Bread
        mRecipe3= findViewById(R.id.recipe3); //Pumpkin Jello
        mRecipe4= findViewById(R.id.recipe4); //Pumpkin Coffee

        recipeInfo();

        mRecipe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = DisplayRecipeActivity.newIntent(MainActivity.this, recipies[1]);
                startActivity(intent);
            }
        });

        mRecipe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = DisplayRecipeActivity.newIntent(MainActivity.this,recipies[0]);
                startActivity(intent);
            }
        });

        mRecipe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = DisplayRecipeActivity.newIntent(MainActivity.this,recipies[2]);
                startActivity(intent);
            }
        });

        mRecipe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = DisplayRecipeActivity.newIntent(MainActivity.this,recipies[3]);
                startActivity(intent);
            }
        });
    }

    private void recipeInfo(){

        String[] a1 = new String[]{"1(½) Cups of Flour \n" +
                "1 Teaspoon of Baking Soda \n" +
                "1 Teaspoon of Ground Nutmeg \n" +
                "1 Teaspoon of Ground Cinnamon \n" +
                "1 Teaspoon of Ground Cloves \n" +
                "½ Teaspoon Baking Powder \n" +
                "½ Teaspoon Salt \n" +
                "4 Eggs \n" +
                "1 Cup of White Sugar \n" +
                "¼ Cup Light Brown Sugar \n" +
                "½ Teaspoon of Vanilla Extract\n" +
                "¾ Cup of Canned Pumpkin \n"};//Ingredients for Pumpkin Bread
        String[] a2 = new String[]{"Preheat oven to 350 degrees F (175 degrees C). Grease a 8-1/2x4-1/2-inch loaf pan.\n" +
                "Combine flour, baking soda, nutmeg, cinnamon, cloves, baking powder, and salt together in a large bowl.\n" +
                "Beat eggs, white sugar, brown sugar, and vanilla extract in a large bowl with an electric mixer on high speed until combined, about 30 seconds. Beat in pumpkin and oil. Add flour mixture; mix until batter is blended and smooth.\n" +
                "Pour batter into the prepared loaf pan.\n" +
                "Bake in the preheated oven until the top is dark brown and a toothpick inserted into the center of the bread comes out clean, about 70 minutes. Let cool in the pan, about 30 minutes. Invert onto a wire rack and slice it into 1-inch thick slices. \n" +
                "Put Aluminum Foil on top and let it sit to cool for at least half an hour.\n"};//Directions for Pumpkin Bread
        Recipe p0 = new Recipe("pumpkinBread", a1,a2,R.drawable.pumpkin_bread);

        String[] b1 = new String[]{"(15 ounces) caned pumpkin\n" +
                "1 (14 ounces) caned Sweetened Condensed Milk\n" +
                "2 large eggs\n" +
                "1 teaspoon ground cinnamon\n" +
                "1/2 teaspoon ground ginger\n" +
                "1/2 teaspoon ground nutmeg\n" +
                "1/2 teaspoon salt\n" +
                "1 (9 inches) unbaked pie crust\n"};//Ingredients for Pumpkin Pie
        String[] b2 = new String[]{"Preheat oven to 425 degrees F. Whisk pumpkin, sweetened condensed milk, eggs, spices and salt in medium bowl until smooth. Pour into crust. Bake 15 minutes.\n" +
                "Reduce oven temperature to 350 degrees F and continue baking 35 to 40 minutes or until knife inserted 1 inch from crust comes out clean. Cool. Garnish as desired. Store leftovers covered in the refrigerator.\n"};//Directions for Pumpkin Pie
        Recipe p1 = new Recipe("pumpkinPie", b1,b2,R.drawable.pumpkin_pie);

        String[] c1 = new String[]{"(3 ounces) box lemon gelatin (I use sugar-free)\n" +
                "1 cup hot water\n" +
                "2 tablespoons of granulated sugar (or Splenda)\n" +
                "1⁄4teaspoon pumpkin pie spice\n" +
                "1 cup canned pumpkin(not pie mix)\n" +
                "1 (8 ounces) container Cool Whip\n" +
                "1⁄2 cup pecans, chopped\n"};//Ingredients for Pumpkin Jello
        String[] c2 = new String[]{"Dissolve gelatin in boiling water; add sugar and spice.\n" +
                "Add pumpkin, mixing well.\n" +
                "Chill until slightly thickened.\n" +
                "Fold in Cool Whip and nuts.\n" +
                "Pour into mold or bowl and refrigerate until firm.\n"};//Directions for Pumpkin Jello
        Recipe p2 = new Recipe("pumpkinJello", c1,c2,R.drawable.pumpkin_jello);

        String[] d1 = new String[]{"1 cup brewed coffee\n" +
                "1 cup almond milk\n" +
                "2 tablespoons pumpkin puree\n" +
                "2 tablespoons maple syrup, or other sweetener\n" +
                "1/4 teaspoon vanilla extract\n" +
                "1/2 teaspoon pumpkin spice or 1/4 teaspoon cinnamon and 1/4 teaspoon nutmeg\n"};//Ingredients for Pumpkin Coffee
        String[] d2 = new String[]{"Combine all ingredients in saucepan\n" +
                "Heat through, do not boil\n" +
                "Stir occasionally\n" +
                "Serve hot or over ice\n" +
                "Add whipped cream\n"};//Directions for Pumpkin Coffee
        Recipe p3 = new Recipe("pumpkinCoffee", d1,d2,R.drawable.pumpkin_coffee);
        Log.d("RECIPE", p0.toString());

        recipies[0] = p0;
        recipies[1] = p1;
        recipies[2] = p2;
        recipies[3] = p3;
    }
}

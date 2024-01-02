package com.example.recipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recipe_details.*

class RecipeDetailsActivity : AppCompatActivity() {

    private lateinit var recipeViewModel: RecipeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_details)

        // Initialize ViewModel
        recipeViewModel = RecipeViewModel(application)

        // Example: Get recipe details based on ID from Intent
        val recipeId = intent.getLongExtra("recipeId", 0)
        val recipe = recipeViewModel.getRecipeById(recipeId)

        // Example: Update UI with recipe details
        txtTitle.text = recipe.title
        txtMealType.text = recipe.mealType
        // Add other UI elements for displaying recipe details
    }
}

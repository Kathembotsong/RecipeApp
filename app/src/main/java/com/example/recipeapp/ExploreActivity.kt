package com.example.recipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_explore.*



class ExploreActivity : AppCompatActivity() {

    private lateinit var recipeViewModel: RecipeViewModel
    private lateinit var adapter: RecipeAdapter // Create a RecyclerView Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        // Initialize ViewModel
        recipeViewModel = RecipeViewModel(application)

        // Initialize RecyclerView Adapter
        adapter = RecipeAdapter()

        // Setup RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        // Observe changes in the ViewModel's LiveData
        recipeViewModel.allRecipes.observe(this, { recipes ->
            // Update the adapter with the new list of recipes
            adapter.submitList(recipes)
        })
    }
}

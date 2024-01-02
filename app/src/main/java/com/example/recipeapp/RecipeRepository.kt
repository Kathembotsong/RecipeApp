package com.example.recipeapp

class RecipeRepository(private val recipeDao: RecipeDao) {
    val allRecipes: List<Recipe> = recipeDao.getAllRecipes()

    suspend fun insert(recipe: Recipe) {
        recipeDao.insertRecipe(recipe)
    }

    fun getRecipeById(recipeId: Long): Recipe {
        return recipeDao.getRecipeById(recipeId)
    }
}

package lesson_11

class RecipeCategory(
    val id: Int,
    val categoryName: String,
    val categoryIcon: String,
    val categoryNumberOfOrder: Int,
    val recipes: List<Recipe>,
)

class Ingredient(
    val id: Int,
    val nameOfIngredient: String,
    val measureUnit: String,
    val amountOfIngredient: Int,
)

class Recipe(
    val id: Int,
    val title: String,
    val categoryId: Int,
    val imageUrl: String,
    val cookingTime: Int,
    val servingSize: Int,
    val ingredients: List<Ingredient>,
    val instructions: List<String>,
)

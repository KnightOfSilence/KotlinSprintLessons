package lesson_19

enum class ProductCategory {
    CLOTHES,
    STATIONERY,
    OTHER;

    fun getCategoryName(): String {
        return when (this) {
            CLOTHES -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            OTHER -> "Другое"
        }

    }
}

class Product(
    val id: Int,
    val name: String,
    val category: ProductCategory,
) {
    fun displayProductInfo() {
        println("ID: $id, Название: $name, Категория: ${category.getCategoryName()}")
    }
}

fun main() {
    val product1 = Product(1, "Футболка", ProductCategory.CLOTHES)
    val product2 = Product(2, "Ручка", ProductCategory.STATIONERY)
    val product3 = Product(3, "Стол", ProductCategory.OTHER)

    product1.displayProductInfo()
    product2.displayProductInfo()
    product3.displayProductInfo()
}
package lesson_22

data class MainScreenState(
    val isLoading: Boolean,
    val data: String?,
)

class MainScreenViewModel {
    var mainScreenState: MainScreenState = MainScreenState(data = null, isLoading = false)

    fun loadData() {
        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Загрузка данных...")
        Thread.sleep(2000)
        mainScreenState = mainScreenState.copy(data = "Данные загружены", isLoading = false)
        println("Данные загружены")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    println(viewModel.mainScreenState)
    viewModel.loadData()
    println(viewModel.mainScreenState)
}
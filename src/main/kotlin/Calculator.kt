import java.util.Locale
import java.util.ResourceBundle

fun main() {
//    val lang = "ur"
//    val country = "PK"
//    val locale = Locale.of(lang, country)
//
//    val rb = ResourceBundle.getBundle("MessagesBundle", locale)
//    val message = rb.getString("wish")
//    println(message)

    println("Select a language")
    println("1. English")
    println("2. Finnish")
    println("3. Urdu")
    println("4. Vietnamese")
    println("5. Chinese")

    print("Select: ")

    val choice = readln().toInt()

    val locale = when (choice) {
        1 -> Locale.of("en", "US")
        2 -> Locale.of("fi", "FI")
        3 -> Locale.of("ur", "PK")
        4 -> Locale.of("vn", "VN")
        5 -> Locale.of("zh", "CN")
        else -> Locale.of("en", "US")
    }

    val rb = ResourceBundle.getBundle("MessagesBundle", locale)
    val message = rb.getString("wish")
    println(message)

    print(rb.getString("prompt1") + ": ")
    val a = readln().toDouble()
    print(rb.getString("prompt2") + ": ")
    val b = readln().toDouble()
    val sum = addMe(a, b)
    val subtract = subMe(a, b)
    println("${rb.getString("summa")}: $sum")
    println("${rb.getString("subtract")}: $subtract")
}

fun addMe(a: Double, b: Double): Double {
    return a + b
}

fun subMe(a: Double, b: Double): Double {
    return a - b
}
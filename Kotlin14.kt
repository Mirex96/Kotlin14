//14. Написать функцию, которая на вход принимает массив и проходится по его значениям. Использовать цикл while
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    values(array)
}

fun values(array: Array<Int>) {
    var i = 0
    while (i < array.size) {
        val value = array[i]
        println(value)
        i++
    }
}





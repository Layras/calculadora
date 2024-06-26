import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Calculadora Básica")
    println("Escolha uma operação a seguir: ")
    println("1- Adição")
    println("2- Subtração")
    println("3- Multiplicação")
    println("4- Divisão")

    val chm = scanner.nextInt()

    println("Digite o primeiro número:")
    val num1 = scanner.nextDouble()

    println("Digite o segundo número:")
    val num2 = scanner.nextDouble()

    when (chm){
        1 -> println("O resultado é: ${num1 + num2}")
        2 -> println("O resultado é: ${num1 - num2}")
        3 -> println("O resultado é: ${num1 * num2}")
        4 -> {
            if (num2 != 0.0) {
                println("O resultado é: ${num1 / num2}")
            } else {
                println("Não é possível dividir por zero")
            }
        }
        else -> println("Escolha inválida")
    }

}

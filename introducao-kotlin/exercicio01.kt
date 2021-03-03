// Criar uma calculadora que dado dois valore Float? e um número correspondente a operação (constante)
// retorne e imprima o resultado como Float ou uma mensagem de erro caso um dos valores seja nulo.


const val OPERATION:Int = 1

fun main () {
    val n1:Float? = 2.0f
    val n2:Float? = 3.0f
    println(calculate(n1, n2, OPERATION))
}

fun calculate(n1:Float?, n2:Float?, op:Int): String {
    return if ((n1 == null) || (n2 == null)) {
        "Erro. Uma das variáveis é nula."
    } else {
        when(op) {
            1 -> "${n1 + n2}"
            2 -> "${n1 - n2}"
            3 -> "${n1 * n2}"
            4 -> "${n1 / n2}"
            else -> "Operação inválida"
        }
    }
}
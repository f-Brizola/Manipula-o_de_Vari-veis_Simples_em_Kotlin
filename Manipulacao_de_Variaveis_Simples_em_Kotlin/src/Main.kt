fun main() {

    var idade: Int = 19
    var altura: Double = 1.70
    var nome: String = "alice"
    var aluno: Boolean = true

    var idade1: Int = 20
    var altura1: Double = 1.75
    var nome1: String = "luna"
    var aluno1: Boolean = false

    fun saudacao(nome: String) {
        println("Olá, $nome!")
    }

    fun soma(a: Int =idade, b: Int = idade1): Int {
        return a + b
    }

    fun multiplicacao(a: Double =altura, b: Double = altura1): Double {
        return a * 2
    }

    println("A soma das idades e ${soma()}")
    println("A altura vezes 2 e ${multiplicacao()}")
    println("Olá, $nome")

    println("Idade: $idade")
    println("Altura: $altura")
    println("Nome: $nome")
    println("Aluno: $aluno")
    println(saudacao(nome))

}
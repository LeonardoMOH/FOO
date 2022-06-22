package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Leonardo"
    var cpf: String = "123.456.789-10"
    private set

    constructor()

    fun pessoaInfo() = "Nome: $nome e CPF: $cpf"
}

fun main() {
    val leonardo = Pessoa()
    println(leonardo.pessoaInfo())
}

package com.williamdsk.collections

fun main(){
    val joao = Funcionario("João",1000.00, "CLT")
    val maria = Funcionario("Maria",2000.00, "PJ")
    val pedro = Funcionario("Pedro",3000.00, "PJ")


    val funcionarios = listOf(joao,maria,pedro)

    funcionarios.forEach{ println(it) }

    println("--------------------")
    println( funcionarios.find { it.nome.equals("Maria") })

    println("--------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println( it )}

    println("--------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println( it )}
}

data class Funcionario(
    val nome : String,
    val salario : Double,
    val tipoContratacao: String
){
    override fun toString():String =
        """
            Nome: $nome
            Salário: R$$salario
            Tipo Contratação: $tipoContratacao
        """
}
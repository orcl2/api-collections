package com.williamdsk.collections

fun main(){
    val joao = Funcionario("João",1000.00)
    val maria = Funcionario("Maria",2000.00)
    val pedro = Funcionario("Pedro",3000.00)


    val funcionarios = listOf(joao,maria,pedro)

    funcionarios.forEach{ println(it) }

    println( funcionarios.find { it.nome.equals("Maria") })


}

data class Funcionario(
    val nome : String,
    val salario : Double
){
    override fun toString():String =
        """
            Nome: $nome
            Salário: R$$salario
        """
}
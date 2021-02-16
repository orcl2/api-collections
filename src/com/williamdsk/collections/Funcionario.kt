package com.williamdsk.collections

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
package com.williamdsk.collections

fun main() {
    val joao = Funcionario("João",1000.00, "CLT")
    val maria = Funcionario("Maria",2000.00, "PJ")
    val pedro = Funcionario("Pedro",3000.00, "PJ")

    println("---------------- LIST ----------------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println( it ) }

    println("--------------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println( it ) }

    println("--------------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println( it ) }

    println("---------------- SET ----------------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println( it ) }

    println("--------------------------------")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println( it ) }

    println("--------------------------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println( it ) }

}
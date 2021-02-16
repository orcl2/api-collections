package com.williamdsk.collections

fun main(){
    val joao = Funcionario("João",1000.00, "CLT")
    val maria = Funcionario("Maria",2000.00, "PJ")
    val pedro = Funcionario("Pedro",3000.00, "PJ")


    val funcionarios1 = setOf(joao,maria)
    val funcionarios2 = setOf(pedro)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println( it ) }

    println("----------------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println( it ) }

    println("----------------------")
    val funcionarios4 = setOf(joao, pedro, maria)
    val resultIntersect = funcionarios4.intersect(funcionarios2)
    resultIntersect.forEach { println( it ) }
}
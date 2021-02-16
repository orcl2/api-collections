package com.williamdsk.collections

fun main(){
    val salarios = doubleArrayOf(5000.18, 65235.25, 958.44)

    salarios.sort()

    for(salario in salarios){
        println(salario)
    }
    println("--------------------------")
    println("Maior Salário ${salarios.maxOrNull()}")
    println("Menor Salário ${salarios.minOrNull()}")
    println("Média Salárial ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it > 2500 }
    println("--------------------------")
    println("Salários maiores que R$2500,00")
    salarioMaiorQue2500.forEach(){
        println(it)
    }
}
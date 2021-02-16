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

    println("--------------------------")
    print("Salários entre 2000 e 5000 -> ")
    println(salarios.count {it in 2000.00..5000.00})

    println("--------------------------")
    println(salarios.find {it == 5000.18})
    println(salarios.find {it == 50.52})

    println("--------------------------")
    println(salarios.any {it == 5000.18})
    println(salarios.any {it == 50.52})
}
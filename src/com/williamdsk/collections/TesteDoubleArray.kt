package com.williamdsk.collections

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 3000.00
    salarios[2] = 5000.00

    salarios.forEach { println(it) }

    println("----------------------------------------")

    salarios.forEachIndexed(){index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(5000.18, 65235.25, 958.44)

    salarios2.sort()

    println("----------------------------------------")
    salarios2.forEach { println(it) }

    println("----------------------------------------")
    salarios2.forEachIndexed(){index, salario ->
        salarios2[index] = salario * 1.1
    }
    salarios2.forEach { println(it) }

}
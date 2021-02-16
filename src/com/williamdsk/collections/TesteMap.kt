package com.williamdsk.collections

fun main(){
    val pair: Pair<String, Double> = Pair("Joao", 1000.00)

    //1ª forma
    val map1 = mapOf(pair)
    map1.forEach{ ( chave, valor ) -> println("Chave $chave - Valor $valor")}

    //2ª forma
    val map2 = mapOf(
        "Pedro" to 2500.00,
        "Maria" to 3000.00
    )
    map2.forEach{ ( chave, valor ) -> println("Chave $chave - Valor $valor") }
}
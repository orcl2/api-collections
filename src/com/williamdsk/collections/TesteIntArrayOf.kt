package com.williamdsk.collections

fun main(){
    val values = intArrayOf(5, 6, 8, 9 ,7)

    //Primeira forma de iteração
    for(value in values){
        print("$value ")
    }
    print("\n")

    //Segunda forma de iteração
    values.forEach {
        print("$it ")
    }
    print("\n")

    //Terceira forma de iteração
    for(value in values.indices){
        print("${values[value]} ")
    }
    print("\n")

    //Quarta forma de iteração com ordenação
    values.sort()
    for(value in values){
        print("$value ")
    }
    print("\n")
}
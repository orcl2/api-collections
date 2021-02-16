package com.williamdsk.collections

fun main(){
    val values = IntArray(5)
    values[0] = 12
    values[1] = 54
    values[2] = 9
    values[3] = 43
    values[4] = 87

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
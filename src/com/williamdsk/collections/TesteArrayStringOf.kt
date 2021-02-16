package com.williamdsk.collections

fun main(){
    var names = arrayOf("William","Daniel","da","Silva","Kuhs")

    //Primeira forma de iteração
    for(value in names){
        print("$value ")
    }
    print("\n")

    //Segunda forma de iteração
    names.forEach {
        print("$it ")
    }
    print("\n")

    //Terceira forma de iteração
    for(value in names.indices){
        print("${names[value]} ")
    }
    print("\n")

    //Quarta forma de iteração com ordenação
    names.sort()
    for(value in names){
        print("$value ")
    }
    print("\n")

}
package com.williamdsk.collections

import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(){
    var names = Array(5){""}
    names[0] = "William"
    names[1] = "Daniel"
    names[2] = "da"
    names[3] = "Silva"
    names[4] = "Kuhs"

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
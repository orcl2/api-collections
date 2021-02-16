package com.williamdsk.collections

fun main() {
    val joao = Funcionario("João",1000.00, "CLT")
    val maria = Funcionario("Maria",2000.00, "PJ")
    val pedro = Funcionario("Pedro",3000.00, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println( repositorio.findById(joao.nome) )
    println( repositorio.findById(maria.nome) )

    println("---------------------------------")
    repositorio.findAll().forEach { println( it ) }

    println("---------------------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println( it ) }

}
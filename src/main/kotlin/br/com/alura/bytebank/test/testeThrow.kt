package br.com.alura.bytebank.test

import br.com.alura.bytebank.exception.InsufficientFundsException

fun testeThrow() {
    println("Inicio main")
    funcaoo1()
    println("fim main")
}

fun funcaoo1() {
    println("inicio função1")

    try {
        funcaoo2()
    } catch (e: InsufficientFundsException) {
        e.printStackTrace()
        println("InsufficientFundsException foi pegada")
    }
    println("fim função1")
}

fun funcaoo2() {
    println("inicio função2")
    for (i in 1..5) {
        println(i)
        throw InsufficientFundsException()
    }
    println("fim função2")
}
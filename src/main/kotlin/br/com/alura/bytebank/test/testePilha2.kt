package br.com.alura.bytebank.test

fun testePilha2() {

    println("Inicio main")
    val input: String = "0.9"

    val valorRecebido: Double? = try { //Pega o valor convertido
        input.toDouble() //Conversão
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = when (valorRecebido) {
        null -> {
            null
        }

        else -> {
            valorRecebido + 0.1
        }
    }

    if (valorRecebido == null) {
        println("Valor Inválido")
    } else {
        println("Valor recebido sem taxa: $valorRecebido")
    }


    if (valorComTaxa == null) {
        println("Valor inválido")
    } else {
        println("Valor recebido com a taxa: $valorComTaxa")
    }

}
package br.com.alura.bytebank.template.paradigmafuncional.typefunction.higherordemfunctions.example

import br.com.alura.bytebank.template.Address

fun let1() {
    val testFunction: () -> Unit
    //Quando nos temos uma função que recebe outra como parâmetro
    //Não somos obrigados a colocar os parenteses
    Address().let {
        it
    }
}
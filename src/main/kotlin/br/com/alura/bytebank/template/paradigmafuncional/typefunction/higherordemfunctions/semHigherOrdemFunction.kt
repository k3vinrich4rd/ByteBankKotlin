package br.com.alura.bytebank.template.paradigmafuncional.typefunction.higherordemfunctions

import br.com.alura.bytebank.template.Address

fun semHigherOrdemFunction() {

    //Sem higherOrdemFunction
    //Cria - se uma dependência da variável para instanciar um objeto
    val address = Address(publicPlace = "rua vergueiro", number = 3185)
    val toUpperCase = "${address.publicPlace}, ${address.number}".uppercase()
    println(toUpperCase)

}

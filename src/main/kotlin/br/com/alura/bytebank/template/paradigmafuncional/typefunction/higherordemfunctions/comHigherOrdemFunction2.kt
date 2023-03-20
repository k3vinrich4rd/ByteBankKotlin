
package br.com.alura.bytebank.template.paradigmafuncional.typefunction.higherordemfunctions

import br.com.alura.bytebank.template.Address

fun comHigherOrdemFunction2() {

    //Se mandarmos para outro let (Fazermos um let encadeado)
    // Teremos acesso ao retorno do let anterior e conseguiremos imprimir o valor
    Address(publicPlace = "rua vergueiro", number = 3185)
        .let { address ->
            "${address.publicPlace}, ${address.number}".uppercase()
        }.let { addressUpperCase ->
            println(addressUpperCase)
        }

}
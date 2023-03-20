package br.com.alura.bytebank.template.paradigmafuncional.typefunction.higherordemfunctions

import br.com.alura.bytebank.template.Address

//O código fica mais limpo
//O let. Sempre vai ser chamado a partir de um objeto
//Por conta do let implementa a técnica de extension function,
// que está sendo atribuída a um generic


/*Generic ≥ É uma técnica para gente referenciar qualquer tipo de objeto
Tem a mesma característica de um Any, a diferença é que
podemos trabalhar com um generic de tal forma que não necessita de um cast

higher order function → Função de alta ordem Quando temos
uma função que recebe ou devolve outra função*/
fun comHigherOrdemFunction() {
    val addressUpperCase = Address(publicPlace = "rua vergueiro", number = 3185)
        .let { address ->
            "${address.publicPlace}, ${address.number}".uppercase()
        }
    println(addressUpperCase)
}
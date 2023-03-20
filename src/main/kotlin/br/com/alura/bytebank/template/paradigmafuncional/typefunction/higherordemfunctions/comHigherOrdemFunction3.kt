package br.com.alura.bytebank.template.paradigmafuncional.typefunction.higherordemfunctions

import br.com.alura.bytebank.template.Address

fun comHigherOrdemFunction3() {

    println("\n-----------------------------------------------------")

    Address(publicPlace = "rua vergueiro", number = 3185)
        .run {
            "$publicPlace, $number".uppercase()
        }.let { addressUppercase: String ->
            println(addressUppercase)
        } //Escopo temporário

    println("\n-----------------------------------------------------\n")

    //Forma de fazer com uma variável
    val addressWithComplement = listOf<Address>(
        Address(complement = "Casa"),
        Address(),
        Address(complement = "apartamento")
    )
        .filter { address -> address.complement.isNotEmpty() }
    println(addressWithComplement)

    println("\n-----------------------------------------------------\n")
    //Forma de fazer com uma referência
    listOf(
        Address(publicPlace = "Rua mendes ferreira"),
        Address(),
        Address(publicPlace = "Rua celta")
    )
        .filter { address -> address.publicPlace.isNotEmpty() }
        .let(::println)


    println("\n-----------------------------------------------------\n")
    //Outra forma de fazer a mesma coisa
    listOf(
        Address(publicPlace = "Rua mendes ferreira"),
        Address(),
        Address(publicPlace = "Rua celta")
    )
        .filter(predicate = { address -> address.publicPlace.isNotEmpty() })
        .let(block = (::println))
}
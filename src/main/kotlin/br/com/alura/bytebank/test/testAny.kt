package br.com.alura.bytebank.test

import br.com.alura.bytebank.template.Address

fun testAny() {
    val address = Address(
        publicPlace = "Rua Gilberto França",
        complement = "Casa 5",
        cep = "00000-000",


        )
    val newAddress = Address(
        publicPlace = "Rua Gilberto França",
        complement = "Casa 5",
        cep = "00000-000",
    )

    println(address.equals(address))


    println(address.hashCode())
    println(newAddress.hashCode())

    println(address.toString())

    //Outra forma de se fazer (toString):
    println("${address.javaClass}@${Integer.toHexString(address.hashCode())}")


    println(newAddress.toString())


    fun printValue(value: Any): Any {
        println(value)
        return value
    }
}
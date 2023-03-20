package br.com.alura.bytebank.template.paradigmafuncional.scopefunctions.apply


import br.com.alura.bytebank.template.Address

//O with não é uma extensão de função
//É um receptor de objetos e seu retorno é uma (lambda)
/*
Pega um objeto, trabalha com o seus membros, devolvendo algo (Computação)
ou nada
 */

fun main() {
    withAndApply()
    semOWithButWithApply()

}

fun withAndApply() {
    val address = Address().apply {
        publicPlace = "Rua vergueiro"
        number = 212
    }
    with(address) {
        "$publicPlace, $number".uppercase()
    }.let { addressUpperCase ->
        println(addressUpperCase)
    }
}

fun semOWithButWithApply() {
    val address = Address().apply {
        publicPlace = "Rua vergueiro"
        number = 223
    }
    val uppercase = "${address.publicPlace}, ${address.number}".uppercase()
    println(uppercase)
}
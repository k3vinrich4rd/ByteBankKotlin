package br.com.alura.bytebank.template.paradigmafuncional.scopefunctions.with

import br.com.alura.bytebank.template.Address

//O with não é uma extensão de função
//É um receptor de objetos e seu retorno é uma (lambda)
/*Pega um objeto, trabalha com os seus membros, devolvendo algo (Computação)ou nada

with - inline fun <T, R> with(receiver: T, block: T.() -> R): R
não é uma função de extensão (extension function)
chama membros do objeto de contexto diariamente
também é usado para computar algo com o receptor e retornar o valor
 //Forma de ler: com esse objeto faça */

fun main() {
    with()
    semOWith()

}
fun with() {
    //Forma de ler: com esse objeto faça:
    val address = Address(publicPlace = "Rua vergueiro", number = 212)
    with(address) {
        "$publicPlace, $number".uppercase()
    }.let { addressUpperCase ->
        println(addressUpperCase)
    }
}

fun semOWith(){
    val address = Address(publicPlace = "Rua vergueiro", number = 223)
    val uppercase = "${address.publicPlace}, ${address.number}".uppercase()
    println(uppercase)
}
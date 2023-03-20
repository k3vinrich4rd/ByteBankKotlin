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
    with2()


}

fun with2() {
    //Com ele, conseguimos trabalhar com o objeto que vem no seu argumento
    //Forma de ler: com esse objeto faça:
    with(Address()) {
        publicPlace = "Rua vergueiro"
        number = 3185
        neighborhood = "Vila Mariana"
        city = "São Paulo"
        state = "Sp"
        cep = "02310-063"
        complement = "Apartamento"
        complete()
    }.let { completedAddress: String ->
        println(completedAddress)
    }


}
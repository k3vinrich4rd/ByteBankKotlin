
package br.com.alura.bytebank.template.paradigmafuncional.typefunction.higherordemfunctions.example

fun main() {


    let1()

    let2()

    teste {}

    //Nesse teste já não consigo instanciar da mesma forma
    //Porque primeiro temos que mandar a função e depois o valor
    teste2({}, 1)

    //mas fosse ao contrário, seria assim:
    teste3(1) {

    }

}

fun teste(function: () -> Unit) {

}

fun teste2(function: () -> Unit, teste: Int) {

}

fun teste3(teste: Int, function: () -> Unit) {

}

fun testeRecebeString(valor: String) {

}
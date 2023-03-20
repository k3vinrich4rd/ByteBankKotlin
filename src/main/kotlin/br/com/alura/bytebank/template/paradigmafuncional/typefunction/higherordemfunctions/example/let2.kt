package br.com.alura.bytebank.template.paradigmafuncional.typefunction.higherordemfunctions.example

fun let2() {
    "".let(::testeRecebeString)
    1.let {
        it
    }
}
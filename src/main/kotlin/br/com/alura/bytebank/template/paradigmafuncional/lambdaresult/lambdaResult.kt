package br.com.alura.bytebank.template.paradigmafuncional.lambdaresult

fun main() {
    lambdaResult()

}
/* run - inline fun <T, R> T.run(block: T.() -> R):R
receptor
similar a proposta do let, mas o uso é parecido com o with
utiliza na inicialização de um objeto
retorna a computação do objeto */

fun lambdaResult() {
    val numbers = mutableListOf("one", "two", "three")
    val countEndsWithE = numbers.run {
        add("four")
        add("five")
        count { it.endsWith("e") }
    }
    println("There are $countEndsWithE elements that end with e.")
}
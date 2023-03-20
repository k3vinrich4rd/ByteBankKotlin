package br.com.alura.bytebank.template.paradigmafuncional.scopefunctions.let

/*Trata o objeto de contexto como argumento, e o retorno como lambda
Usabilidade: Quando queremos trabalhar no resultado de uma ou mais funções

let — inline fun <T, R> T.let(block: (T) -> R):R
Argumento
opera com o resultado de uma ou mais funções e com valores nulos
cria variável com um escopo mais limitado com alguma modificação*/


fun main() {
    semOLet()
    comLet()
    comLetReferencia()
}

fun semOLet() {
    //Exemplo sem o let:
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers.map { it.length }.filter { it > 3 }
    println(resultList)
}

fun comLet() {
    //Exemplo com o let:
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let { numbersFiltrados ->
        println(numbersFiltrados)
    }
}

fun comLetReferencia() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let(::println)
}
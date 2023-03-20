package br.com.alura.bytebank.template.paradigmafuncional.scopefunctions.run

/* run sem extensão - inline fun <R> run(block: () -> R): R
sem objeto de conexão
Similar a execução do with, mas não recebe nenhum objeto
Executa um bloco de código e retorna a sua computação
 */

fun run() {

    run {
        println("Execução do run, sem extensão")
    }

}

fun main() {
    run()
}
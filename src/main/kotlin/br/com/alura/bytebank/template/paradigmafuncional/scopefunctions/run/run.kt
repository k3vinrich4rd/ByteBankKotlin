package br.com.alura.bytebank.template.paradigmafuncional.scopefunctions.run

import br.com.alura.bytebank.template.AccountSavings
import br.com.alura.bytebank.template.Client

/* run sem extensão - inline fun <R> run(block: () -> R): R
sem objeto de conexão
Similar a execução do with, mas não recebe nenhum objeto
Executa um bloco de código e retorna a sua computação
 */

fun runComExtensao() {

    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa mensal $taxaMensal")


    val accountSavings = AccountSavings(Client(name = "Kevin", cpf = "111.111.111-11", password = 1234), 1000)

    accountSavings.run { //Permite usar os membros
        depositInAnAccount(1000.0)
        balance * taxaMensal
    }.let { rendimentoMensal ->
        println("Rendimento mensal: $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var balance = accountSavings.balance
        repeat(12) {
            balance += balance * taxaMensal
        }
        balance
    }
    println("Rendimento anual: $rendimentoAnual")




}

fun main() {
    runComExtensao()
}
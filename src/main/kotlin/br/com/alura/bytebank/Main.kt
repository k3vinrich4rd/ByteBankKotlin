package br.com.alura.bytebank

import br.com.alura.bytebank.template.AccountSavings
import br.com.alura.bytebank.template.Address
import br.com.alura.bytebank.template.Client
import br.com.alura.bytebank.template.accountsTotal
import br.com.alura.bytebank.test.testDifferentAccounts

fun main() {

    val fran = object { //Objeto anônimo
        //Nos permite criar uma instância de um objeto sem necessitar de uma classe
        //Exemplo:
        val name: String = "Kevin"
        val cpf: String = "111.111.111-11"
        val password: Int = 1000

        fun authenticated(password: Int) = this.password == password
    }

    println("Nome do cliente: ${fran.name}")
    println("Nome do cliente: ${fran.authenticated(1000)}\n")

    val test = Client("Mano Brown", "243423", Address(), 411)
    AccountSavings(test, 5445254)

    testDifferentAccounts()

    println("Account total created: $accountsTotal")

}
package br.com.alura.bytebank

import br.com.alura.bytebank.template.AccountSavings
import br.com.alura.bytebank.template.Address
import br.com.alura.bytebank.template.Client
import br.com.alura.bytebank.template.accountsTotal
import br.com.alura.bytebank.test.testDifferentAccounts

fun main() {

    val test = Client("Mano Brown", "243423", Address(), 411)
    AccountSavings(test, 5445254)

    testDifferentAccounts()

    println("Account total created: $accountsTotal")

}
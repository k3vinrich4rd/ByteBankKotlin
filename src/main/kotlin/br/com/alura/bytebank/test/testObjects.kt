package br.com.alura.bytebank.test

import br.com.alura.bytebank.template.Account
import br.com.alura.bytebank.template.AccountCurrent
import br.com.alura.bytebank.template.Address
import br.com.alura.bytebank.template.Client

fun testObjects() {
    val kevinRichard = Client(
        name = "kevin",
        cpf = "45425",
        password = 1234,
        address = Address(publicPlace = "Rua teste")
    )

    val accountCurrent = AccountCurrent(
        holder = kevinRichard,
        numberAccount = 1414

    )

    println("Total de contas criadas: ${Account.total}")
}
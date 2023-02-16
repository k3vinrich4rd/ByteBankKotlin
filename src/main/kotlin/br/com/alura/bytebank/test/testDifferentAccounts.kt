package br.com.alura.bytebank.test

import br.com.alura.bytebank.template.*

fun testDifferentAccounts() {

    val accountKevinRichard = Client(
        name = "kevin",
        cpf = "45425",
        password = 1234,
        address = Address(publicPlace = "Rua teste")
    )



    val accountCurrent = AccountCurrent(
        holder = accountKevinRichard,
        numberAccount = 1414


    )

    println("Holder")
    println("Name holder: ${accountCurrent.holder.name}")
    println("Cpf holder: ${accountCurrent.holder.cpf}")
    println("NumberAccount holder: ${accountCurrent.numberAccount}")
    println("Address holder: ${accountCurrent.holder.address.publicPlace}")















    val accountEduardo = Client(
        "Eduardo Candido",
        "141425275227",
        password = 2334

    )

    val accountSaving = AccountSavings(
        holder = accountEduardo,
        numberAccount = 1111
    )

    val accountVilmaRegiane = Client("Vilma Regiane", "35353538383", password = 2324)
    val accountSalary = AccountSalary(
        holder = accountVilmaRegiane,
        numberAccount = 5454
    )

    accountCurrent.depositInAnAccount(1000.00)
    accountSaving.depositInAnAccount(1000.00)
    accountSalary.depositInAnAccount(1000.00)

    println("Antes do saque: ")
    println("Current account balance before withdrawal: ${accountCurrent.balance}")
    println("Savings account balance before withdrawal: ${accountSaving.balance}")
    println("Salary account balance before withdrawal: ${accountSalary.balance}\n")

    accountCurrent.withdrawMoneyFomTheAccount(100.00)
    accountSaving.withdrawMoneyFomTheAccount(100.00)
    accountSalary.withdrawMoneyFomTheAccount(400.00)

    println("Depois do saque: ")
    println("Current account balance after withdrawal: ${accountCurrent.balance}") //taxa de 0.1
    println("Savings account balance after withdrawal: ${accountSaving.balance}")
    println("Salary account balance after withdrawal: ${accountSalary.balance}\n")

    println("Antes da transferência: ")
    println("Current account balance before transfer: ${accountCurrent.balance}")
    println("Savings account balance before transfer: ${accountSaving.balance}")
    println("Salary account balance before transfer: ${accountSalary.balance}\n")

    accountCurrent.accountTransfer(100.00, accountSaving)
    accountSaving.accountTransfer(0.10, accountCurrent)



    println("Depois da transferência: ")
    println("Current account balance after transfer: ${accountCurrent.balance}")
    println("Savings account balance after transfer: ${accountSaving.balance}")
    println("Salary account balance after transfer: ${accountSalary.balance}\n")
}
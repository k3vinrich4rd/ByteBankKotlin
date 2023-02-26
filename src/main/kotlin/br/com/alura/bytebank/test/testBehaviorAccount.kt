package br.com.alura.bytebank.test

import br.com.alura.bytebank.template.AccountCurrent
import br.com.alura.bytebank.template.AccountSavings
import br.com.alura.bytebank.template.Client

fun testBehaviorAccount() {
    //Outra maneira de mandar uma property via construtor
    val accountKevinRichard = AccountCurrent(
        Client(
            name = "Ketelyn Mayara",
            cpf = "353535353",
            password = 2
        ), 1414
    )
    accountKevinRichard.depositInAnAccount(100.00)

    println(accountKevinRichard.holder.name)
    println(accountKevinRichard.numberAccount)
    println(accountKevinRichard.balance)

    println()

    //Outra maneira de mandar uma property via construtor
    val accountLeticia = AccountSavings(
        Client(
            name = "Leticia",
            cpf = "4234234234",
            password = 2
        ), 1515
    )
    accountLeticia.depositInAnAccount(-50.00)

    println(accountLeticia.holder.name)
    println(accountLeticia.numberAccount)
    println(accountLeticia.balance)


    //Deposito
    println("\nDeposited in account the Kevin Richard")
    accountKevinRichard.depositInAnAccount(50.00)
    println("Balance in account: ${accountKevinRichard.balance}\n")

    println("Deposited in account the Leticia")
    accountLeticia.depositInAnAccount(100.00)
    println("Balance in account: ${accountLeticia.balance} \n")

    //Saque
    println("Withdrawing money from account Kevin: ")
    accountKevinRichard.withdrawMoneyFomTheAccount(250.00)
    println("Balance in account: ${accountKevinRichard.balance} \n")


    println("Withdrawing money from account Leticia: ")
    accountLeticia.withdrawMoneyFomTheAccount(100.00)
    println("Balance in account: ${accountLeticia.balance}\n")

    //Excesso de saque
    println("Excess withdrawal from account: ${accountKevinRichard.holder} ")
    accountKevinRichard.withdrawMoneyFomTheAccount(500.00)
    println("Balance in account: ${accountKevinRichard.balance} \n")

    println("Excess withdrawal from account: ${accountLeticia.holder} ")
    accountLeticia.withdrawMoneyFomTheAccount(500.00)
    println("Balance in account: ${accountLeticia.balance} \n")

    //Transferência
    println("Transfer to account ${accountLeticia.holder} from to account ${accountKevinRichard.holder}")


    println("Balance in account Kevin: ${accountKevinRichard.balance}")
    println("Balance in account Leticia: ${accountLeticia.balance}\n")

    //Outra maneira de mandar uma property via construtor
    //Rotulo(Labels)

    val accountFelipe = AccountCurrent(
        Client(
            name = "Felipe",
            cpf = "42342342344",
            password = 1
        ), 1674
    )
    println("\n${accountFelipe.numberAccount}")
    println(accountFelipe.numberAccount)
}
package br.com.alura.bytebank.test

import br.com.alura.bytebank.template.AccountCurrent
import br.com.alura.bytebank.template.AccountSalary
import br.com.alura.bytebank.template.AccountSavings

fun testDifferentAccounts() {
    val currentAccount = AccountCurrent(
        holder = "Kevin Richard",
        numberAccount = 1414
    )

    val savingsAccount = AccountSavings(
        holder = "Vilma regiane",
        numberAccount = 1111
    )

    val accountSalary = AccountSalary(
        holder = "Vilma Regiane",
        numberAccount = 1414
    )

    currentAccount.depositInAnAccount(1000.00)
    savingsAccount.depositInAnAccount(1000.00)
    accountSalary.depositInAnAccount(1000.00)

    println("Antes do saque: ")
    println("Current account balance before withdrawal: ${currentAccount.balance}")
    println("Savings account balance before withdrawal: ${savingsAccount.balance}")
    println("Salary account balance before withdrawal: ${accountSalary.balance}\n")

    currentAccount.withdrawMoneyFomTheAccount(100.00)
    savingsAccount.withdrawMoneyFomTheAccount(100.00)
    accountSalary.withdrawMoneyFomTheAccount(400.00)

    println("Depois do saque: ")
    println("Current account balance after withdrawal: ${currentAccount.balance}") //taxa de 0.1
    println("Savings account balance after withdrawal: ${savingsAccount.balance}")
    println("Salary account balance after withdrawal: ${accountSalary.balance}\n")

    println("Antes da transferência: ")
    println("Current account balance before transfer: ${currentAccount.balance}")
    println("Savings account balance before transfer: ${savingsAccount.balance}")
    println("Salary account balance before transfer: ${accountSalary.balance}\n")

    currentAccount.accountTransfer(100.00, savingsAccount)
    savingsAccount.accountTransfer(0.10, currentAccount)


    println("Depois da transferência: ")
    println("Current account balance after transfer: ${currentAccount.balance}")
    println("Savings account balance after transfer: ${savingsAccount.balance}")
    println("Salary account balance after transfer: ${accountSalary.balance}\n")
}
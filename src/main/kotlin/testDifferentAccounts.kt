fun testDifferentAccounts() {
    val currentAccount = AccountCurrent(
        holder = "Kevin Richard",
        numberAccount = 1414
    )

    val savingsAccount = AccountSavings(
        holder = "Vilma regiane",
        numberAccount = 1111
    )

    currentAccount.depositInAnAccount(1000.00)
    savingsAccount.depositInAnAccount(1000.00)

    println("Antes do saque: ")
    println("Current account balance before withdrawal: ${currentAccount.balance}")
    println("Savings account balance before withdrawal: ${savingsAccount.balance}\n")

    currentAccount.withdrawMoneyFomTheAccount(100.00)
    savingsAccount.withdrawMoneyFomTheAccount(100.00)

    println("Depois do saque: ")
    println("Current account balance after withdrawal: ${currentAccount.balance}") //taxa de 0.1
    println("Savings account balance after withdrawal: ${savingsAccount.balance}\n")

    println("Antes da transferência: ")
    println("Current account balance before transfer: ${currentAccount.balance}")
    println("Savings account balance before transfer: ${savingsAccount.balance}\n")

    currentAccount.valueTransfer(100.00, savingsAccount)
    savingsAccount.valueTransfer(0.10, currentAccount)

    println("Depois da transferência: ")
    println("Current account balance after transfer: ${currentAccount.balance}")
    println("Savings account balance after transfer: ${savingsAccount.balance}\n")
}
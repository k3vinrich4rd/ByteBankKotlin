fun testBehaviorAccount() {
    val accountKevinRichard = AccountCurrent("Kevin Richard", 1414)
    accountKevinRichard.depositInAnAccount(100.00)

    println(accountKevinRichard.holder)
    println(accountKevinRichard.numberAccount)
    println(accountKevinRichard.balance)

    println()
    val accountLeticia = AccountSavings("Leticia", 1515)
    accountLeticia.depositInAnAccount(-50.00)

    println(accountLeticia.holder)
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
    if (accountLeticia.accountTransfer(300.00, accountKevinRichard)) {
        println("Successful transfer  ")
    } else {
        println("Unsuccessful transfer ")
    }

    println("Balance in account Kevin: ${accountKevinRichard.balance}")
    println("Balance in account Leticia: ${accountLeticia.balance}\n")


    //Rotulo(Labels)
    val accountElaine = AccountCurrent(numberAccount = 1674, holder = "Elaine")
    println("\n${accountElaine.holder}")
    println(accountElaine.numberAccount)
}
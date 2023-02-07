fun main() {
    println("Welcome to Bytebank\n")

    val accountKevinRichard = Account()
    accountKevinRichard.holder = "Kevin Richard"
    accountKevinRichard.numberAccount = 1414
    accountKevinRichard.setBalance(-200.00)

    println(accountKevinRichard.holder)
    println(accountKevinRichard.numberAccount)
    println("${accountKevinRichard.getBalance()} \n")

    val accountLeticia = Account()
    accountLeticia.holder = "Leticia"
    accountLeticia.numberAccount = 1515
    accountLeticia.setBalance(100.00)

    println(accountLeticia.holder)
    println(accountLeticia.numberAccount)
    println(accountLeticia.getBalance())
}
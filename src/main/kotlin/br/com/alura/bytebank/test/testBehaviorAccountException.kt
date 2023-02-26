package br.com.alura.bytebank.test

import br.com.alura.bytebank.exception.FailedAuthenticatedException
import br.com.alura.bytebank.exception.InsufficientFundsException
import br.com.alura.bytebank.template.AccountCurrent
import br.com.alura.bytebank.template.AccountSavings
import br.com.alura.bytebank.template.Client

fun testBehaviorAccountException() {
    //Outra maneira de mandar uma property via construtor
    val accountKetelynMayara = AccountCurrent(
        Client(
            name = "Ketelyn Mayara",
            cpf = "353535353",
            password = 2
        ), 1414
    )
    accountKetelynMayara.depositInAnAccount(100.00)

    println(accountKetelynMayara.holder.name)
    println(accountKetelynMayara.numberAccount)
    println(accountKetelynMayara.balance)

    println()

    //Outra maneira de mandar uma property via construtor
    val accountLeticia = AccountSavings(
        Client(
            name = "Leticia",
            cpf = "4234234234",
            password = 2
        ), 1515
    )
    accountLeticia.depositInAnAccount(150.00)

    println(accountLeticia.holder.name)
    println(accountLeticia.numberAccount)
    println(accountLeticia.balance)

    //Transferência
    println("Transfer to account ${accountLeticia.holder.name} from to account ${accountKetelynMayara.holder.name}\n")

    try {
        println(" ${accountKetelynMayara.accountTransfer(1.0, accountLeticia, 20)}")
        println("transferência bem sucedida")
    } catch (e: InsufficientFundsException) {
        println("Transfer failure")
        println(e.message)
        println(e.printStackTrace())
    } catch (e: FailedAuthenticatedException) {
        println("Transfer failure")
        println(e.printStackTrace())
        //Técnica para tratar exceptions desconhecidas
        //Sempre deixar por último por ser a situação que não sabemos lidar
    } catch (e: Exception) {
        println("Unknown error")
        println(e.printStackTrace())

    }


}
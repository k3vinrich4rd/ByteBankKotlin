package br.com.alura.bytebank

import br.com.alura.bytebank.template.*
import br.com.alura.bytebank.test.testDifferentAccounts

fun main() {

    val fran = object : Authenticated{ //Objeto anônimo
        //Nos permite criar uma instância de um objeto sem necessitar de uma classe
        //Exemplo:
        val name: String = "Kevin"
        val cpf: String = "111.111.111-11"
        val password: Int = 1000

       override fun authenticated(password: Int) = this.password == password
    }
    //Implementando uma ‘interface’ com object anônimo
    //Exemplo:
    val systemIntern = SystemIntern()
    systemIntern.toEnter(fran, 1000)

    println("Nome do cliente: ${fran.name}")
    println("Nome do cliente: ${fran.authenticated(1000)}\n")

    val test = Client("Mano Brown", "243423", Address(), 411)
    AccountSavings(test, 5445254)

    testDifferentAccounts()

    println("Account total created: $accountsTotal")

}
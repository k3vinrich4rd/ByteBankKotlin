package br.com.alura.bytebank.template.paradigmafuncional.typefunction.higherordemfunctions

import br.com.alura.bytebank.template.Authenticated
import br.com.alura.bytebank.template.SystemIntern

//Código comum quando vamos trabalhar com eventos
fun comHigherOrdemFunction4() {

    fun sum(a: Int, b: Int, result: (Int) -> Unit) {
        println("Soma está sendo efetuada: ")
        result(a + b)
    }

    fun somaReceiver(a: Int, b: Int, result: Int.() -> Unit) {
        println("antes da soma")
        val total = a + b
        total.result()
        println("depois da soma")
    }

    //Uma forma de fazer
//    sum(1, 2) {
//        println("Resultado da soma: $it")
//    }

    //Forma de fazer a mesma coisa
    sum(1, 2, result = { valor ->
        println(valor)
    })

    println()

    somaReceiver(1, 5, result = {
        println(this)
    })


    val authenticated = object : Authenticated {
        val password = 1234
        override fun authenticated(password: Int) = this.password == password
    }

    //Colocando labels para identificação
    val systemIntern = SystemIntern()
    systemIntern.toEnter(authenticated, 1234, authenticated = {
        println("Realizar pagamento")
    })

    systemIntern.toEnterReceiver(authenticated, 1234, authenticated = {
        pagamento()
    })

}
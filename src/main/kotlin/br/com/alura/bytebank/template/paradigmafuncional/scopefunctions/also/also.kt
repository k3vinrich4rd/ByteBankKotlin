package br.com.alura.bytebank.template.paradigmafuncional.scopefunctions.also
import br.com.alura.bytebank.template.Address
/* also - inline fun <T> T.also(block:(T) -> Unit): T
argumento
igual ao apply em retorno
realiza ações a mais que não modificam o objeto
A remoção do also não deve afetar o programa
em código lemos "também faça isso"
 */


//Carrega um objeto de contexto como argumento e retorna o próprio objeto
//Faz operações simples que não interferem na lógica
//Muito usado com logs


//Carrega um objeto de contexto como argumento e retorna o próprio objeto
//Faz operações simples que não interferem na lógica
//Muito usado com logs

fun main() {
    withApplyAndAlso()


}

fun withApplyAndAlso() {
    val address = Address()
        .also { println("Criando endereço") }
        .apply {
        publicPlace = "Rua vergueiro"
        number = 212
    }
    with(address) {
        "$publicPlace, $number".uppercase()
    }.let { addressUpperCase ->
        println(addressUpperCase)
    }
}
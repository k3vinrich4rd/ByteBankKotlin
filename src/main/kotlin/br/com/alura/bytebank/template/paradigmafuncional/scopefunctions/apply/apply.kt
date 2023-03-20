package br.com.alura.bytebank.template.paradigmafuncional.scopefunctions.apply

/* apply - inline fun <T> T.apply(block: T.() -> Unit): T
Receptor
Recebe e retorna o objeto de contexto
Configura o objeto de contexto sem fazer computações
Em código lemos "Aplique as seguintes atribuições ao objeto"*/

//Vai ter um objeto de contexto com receiver e vai devolver o próprio objeto
//Seguindo a leitura, "Aplique essas configurações para esse objeto"

fun main() {
    //Cenário: Estamos criando uma pessoa que chama italo, mas esquecemos
    // de informar a sua idade, o apply nos possibilita isso e nos retorna essa alteração
    // apply -> Receiver (Receptor)/ não tem acesso ao um argumento
    //Exemplo:
    val italo = Person("Italo").apply {
        age = 0
        city = "Osasco"
    }
    println(italo)
}
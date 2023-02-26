package br.com.alura.bytebank.exception

//Da possibilidade ao chamar o objeto dessa classe de usar uma mensagem padrão
//Ou escrever uma mensagem mais aprofundada
class FailedAuthenticatedException(
    message: String = "Authentication failure"
) : Exception(message) {
}
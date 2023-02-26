package br.com.alura.bytebank.exception

//Da possibilidade ao chamar o objeto dessa classe de usar uma mensagem padrão
//Ou escrever uma mensagem mais aprofundada
class InsufficientFundsException(
    message: String = "The balance is insufficient"
) : Exception(message)
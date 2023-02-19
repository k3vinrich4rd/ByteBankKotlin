package br.com.alura.bytebank.template

interface Authenticated {

    //Não pode ser inicializada

    //Quem implementa essa ‘interface’ garante que a property existe
    //Assim é possível reutilizar o, password


    //Implicitamente isso é abstract
    //Exige esses parâmetros abaixo
    //Por padrão é aberto
    //Implementação padrão
    fun authenticated(password: Int): Boolean
}
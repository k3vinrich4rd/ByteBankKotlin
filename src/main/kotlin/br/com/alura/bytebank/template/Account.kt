package br.com.alura.bytebank.template

var accountsTotal = 0 //Inicialização da variável global
    private set //Property global com o set privado

//Fazendo o valor dessa property não ser modificado em qualquer ponto do código
abstract class Account(
    val holder: Client, //Composição
    val numberAccount: Int  // 0 Valor padrão (tirando a necessidade de informar um valor no argumento do constructor
    // só se apenas quiser informar um valor
) {
    open var balance = 0.0
        protected set

    init {//Executa um código antes de instânciar qualquer objeto filho de account
        accountsTotal++ //Incremento da variável global (código)
    }

    fun depositInAnAccount(value: Double) {  //(Função) membro (métodos/comportamento)
        if (value > 0) {
            this.balance += value //This = Significa que estamos mexendo em um atributo do próprio objeto
        }
    }

    //(Função) membro (métodos/comportamento abastrato)
    abstract fun withdrawMoneyFomTheAccount(value: Double)

}
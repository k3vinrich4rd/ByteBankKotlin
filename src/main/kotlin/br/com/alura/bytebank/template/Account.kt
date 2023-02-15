package br.com.alura.bytebank.template

abstract class Account(
    val holder: String,
    val numberAccount: Int  // 0 Valor padrão (tirando a necessidade de informar um valor no argumento do constructor
    // só se apenas quiser informar um valor
) {
    var balance = 0.0
        protected set

    fun depositInAnAccount(value: Double) {  //(Função) membro (métodos/comportamento)
        if (value > 0) {
            this.balance += value //This = Significa que estamos mexendo em um atributo do próprio objeto
        }
    }

    //(Função) membro (métodos/comportamento abastrato)
    abstract fun withdrawMoneyFomTheAccount(value: Double)

}
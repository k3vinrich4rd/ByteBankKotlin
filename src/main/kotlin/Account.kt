import java.sql.DriverManager.println

abstract class Account
    (
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

    //(Função) membro (métodos/comportamento)
    abstract fun withdrawMoneyFomTheAccount(value: Double)


    //Tira de uma conta origem e manda para uma conta destino
    //A conta de origem da transferência, é o objeto que chamar o método
    fun valueTransfer(value: Double, destiny: Account): Boolean { //early return
        if (balance >= value) { //
            balance -= value //Pega o saldo
            destiny.depositInAnAccount(value) //Incrementa(Conta de origem, mexe no saldo na conta destino)
            return true
        }
        return false
    }


}
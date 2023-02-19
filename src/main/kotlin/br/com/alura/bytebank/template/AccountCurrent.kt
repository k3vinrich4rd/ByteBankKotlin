package br.com.alura.bytebank.template

class AccountCurrent(
    holder: Client,
    numberAccount: Int
) : Account(
    holder = holder,
    numberAccount = numberAccount
), AccountTransfer {

    //Método abstrato
    override fun withdrawMoneyFomTheAccount(value: Double) {
        val valueWithRate = value + 0.1 //valor com taxa
        if (this.balance >= valueWithRate) {
            this.balance -= valueWithRate
        }
    }

    //‘Interface’
    //Tira de uma conta origem e manda para uma conta destino
    //A conta de origem da transferência, é o objeto que chamar o método
    override fun accountTransfer(value: Double, destiny: Account): Boolean {
        if (balance >= value) { //
            balance -= value //Pega o saldo
            destiny.depositInAnAccount(value) //Incrementa(Conta de origem, mexe no saldo na conta destino)
            return true
        }
        return false
    }

}


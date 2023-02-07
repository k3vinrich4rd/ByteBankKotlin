class Account {
    var holder = ""
    var numberAccount = 0
    var balance = 0.0

    //(Função) membro (métodos/comportamento)
    fun depositInAnAccount(value: Double) {
        this.balance += value //This = Significa que estamos mexendo em um atributo do próprio objeto
    }

    //(Função) membro (métodos/comportamento)
    fun withdrawMoneyFomTheAccount(value: Double) {
        if (balance < value) {
            println("Impossible to transfer money withdrawal")
        } else {
            this.balance -= value
        }
    }

    //Tira de uma conta origem e manda pra uma conta destino
    //A conta de origem da transferência, é o objeto que chamar o método
    fun valueTransfer(value: Double, destiny: Account): Boolean { //early return
        if (balance >= value) { //
            balance -= value //Pega o saldo
            destiny.balance += value //Incrementa(Conta de origem, mexe no saldo na conta destino)
            return true
        }
        return false
    }
}
package br.com.alura.bytebank.template

import br.com.alura.bytebank.exception.FailedAuthenticatedException
import br.com.alura.bytebank.exception.InsufficientFundsException

class AccountSavings(
    holder: Client,
    numberAccount: Int
) : Account(
    holder = holder,
    numberAccount = numberAccount
), AccountTransfer {

    //Método abstrato
    override fun withdrawMoneyFomTheAccount(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        }
    }

    //Delegação/Agregação
    //Isso nos permite deixar a responsabilidade de implementação para uma classe que já fez isso
    //Possibilitando a reutilização de código
    override fun authenticated(password: Int): Boolean {
        return holder.authenticated(password)
    }

    //‘Interface’
    //Tira de uma conta origem e manda para uma conta destino
    //A conta de origem da transferência, é o objeto que chamar o método
    override fun accountTransfer(value: Double, destiny: Account, password: Int) {
        if (balance < value) {
            //Mensagem mais aprofundada
            throw InsufficientFundsException(
                message = "The balance is insufficient" +
                        "balance current: $balance, value requested: $value "
            )
        } else if (!authenticated(password)) {
            throw FailedAuthenticatedException()
        }
        balance -= value //Pega o saldo
        destiny.depositInAnAccount(value) //Incrementa(Conta de origem, mexe no saldo na conta destino
    }

}
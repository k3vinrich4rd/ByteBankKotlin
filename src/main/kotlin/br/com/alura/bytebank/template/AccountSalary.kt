package br.com.alura.bytebank.template

class AccountSalary
    (
    holder: Client,
    numberAccount: Int  // 0 Valor padrão (tirando a necessidade de informar um valor no argumento do constructor
    // só se apenas quiser informar um valor
) : Account(
    holder = holder,
    numberAccount = numberAccount
) {
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

}
package template

import template.Account

class AccountSalary(
    holder: String,
    numberAccount: Int  // 0 Valor padrão (tirando a necessidade de informar um valor no argumento do constructor
    // só se apenas quiser informar um valor
) : Account(
    holder = holder,
    numberAccount = numberAccount
) {
    //Método abstrato
    override fun withdrawMoneyFomTheAccount(value: Double) {
        if (this.balance >= value){
            balance -= value
        }
    }

}
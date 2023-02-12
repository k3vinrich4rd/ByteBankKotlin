class CurrentAccount(
    holder: String,
    numberAccount: Int
) : Account(
    holder = holder,
    numberAccount = numberAccount
) {
    override fun withdrawMoneyFomTheAccount(value: Double) {
        val valueWithRate = value + 0.1 //valor com taxa
        if (this.balance >= valueWithRate){
            this.balance -= valueWithRate
        }
    }

}
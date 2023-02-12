class SavingsAccount(
    holder: String,
    numberAccount: Int
) : Account(
    holder = holder,
    numberAccount = numberAccount

) {
    override fun withdrawMoneyFomTheAccount(value: Double) {
        if (this.balance >= value){
            this.balance -= value
        }
    }


}
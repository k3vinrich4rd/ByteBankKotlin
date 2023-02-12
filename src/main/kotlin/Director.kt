class Director(
    name: String,
    cpf: String,
    salary: Double,
    val profitShare: Double,
    val password: Int

) : Employee( //Herança
    name = name,
    cpf = cpf,
    salary = salary
) {

    //Não vai ter mais o backing field porque vai ter o mesmo comportamento de uma função
    //Super.bonus, chama algum membro pertencente a classe mãe (é possível fazer com property)
    override val bonus: Double
        get() = super.bonus + salary + profitShare


    fun authenticationEmployee(password: Int): Boolean {
        if (this.password == password) {
            return true
        } else {
            return false
        }
    }

}
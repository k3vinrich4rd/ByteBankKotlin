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
    override val bonus: Double get() = salary * 0.3 // linha de expressão property



    fun authenticationEmployee(password: Int): Boolean {
        if (this.password == password) {
            return true
        } else {
            return false
        }
    }

}
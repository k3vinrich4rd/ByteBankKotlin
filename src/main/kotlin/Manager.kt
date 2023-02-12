class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val password: Int

) : Employee( //Herança
    name = name,
    cpf = cpf,
    salary = salary
) {

    //Declaração em forma de multiplos retornos
    override val bonus: Double
        get() {
            return super.bonus + salary
        }


    fun authenticationEmployee(password: Int): Boolean {
        if (this.password == password) {
            return true
        } else {
            return false
        }
    }

}
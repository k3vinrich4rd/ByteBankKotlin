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
)
{

//    fun bonus(): Double {
//        return salary * 0.2
//    }


    fun authenticationEmployee(password: Int): Boolean {
        if (this.password == password) {
            return true
        } else {
            return false
        }
    }

}
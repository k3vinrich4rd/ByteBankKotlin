abstract class EmployeeAdmin(
    name: String,
    cpf: String,
    salary: Double,
    val password: Int

) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {
    //Função que autentica manager e director
    fun authenticationEmployee(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}


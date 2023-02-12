abstract class EmployeeAdmin(
    val name: String,
    val cpf: String,
    val salary: Double,
    val password: Int

) {

    //Declarando uma property com valor implícito
    abstract val bonus: Double

    abstract fun authenticationEmployee(password: Int): Boolean
}
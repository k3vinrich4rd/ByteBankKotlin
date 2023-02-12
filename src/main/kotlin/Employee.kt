class Employee(
    val name: String,
    val cpf: String,
    val salary: Double,
    val type: Int
) {
    fun bonus(): Double {
        return when (type) {
            0 -> salary * 0.1
            1 -> salary * 0.2
            else -> salary * 0.3
        }
    }

    fun authenticationEmployee(password: Int) {
        when (type) {
            0 -> println("Autenticação desnecessária")
            1 -> println("Autenticação necessária")
            else -> println("Erro, funcionário desconhecido")
        }
    }
}
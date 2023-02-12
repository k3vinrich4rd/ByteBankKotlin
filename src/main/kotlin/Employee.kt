open class Employee(
    val name: String,
    val cpf: String,
    val salary: Double,
) {
    //Declarando uma property com valor implícito
    open val bonus get() = salary * 0.1
}
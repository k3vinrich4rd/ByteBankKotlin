abstract class Employee(
    val name: String,
    val cpf: String,
    val salary: Double,
) {

    //Declarando uma property com valor implícito
    abstract val bonus: Double
}
abstract class Employee(
    val name: String,
    val cpf: String,
    val salary: Double,
) {

    //Declarando uma property com valor implícito
    open val bonus: Double get() {
        return salary * 0.1
    }
}
package template

class Assistant(
    name: String,
    cpf: String,
    salary: Double,

    ) : Employee( //Herança
    name = name,
    cpf = cpf,
    salary = salary
) {
    override val bonus: Double
        get() = salary * 0.05


}
class Analyst(
    name: String,
    cpf: String,
    salary: Double,


) : Employee( //Herança
    name = name,
    cpf = cpf,
    salary = salary
) {

    //Property em forma de linha de expressão
    override val bonus: Double = super.bonus + salary * 0.1


}

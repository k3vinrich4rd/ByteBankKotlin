class Manager(
    name: String,
    cpf: String,
    salary: Double,
    password: Int

) : EmployeeAdmin( //Herança
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
) {

    //Declaração em forma de multiplos retornos
    override val bonus: Double
        get() {
            return salary * 0.1
        }


}
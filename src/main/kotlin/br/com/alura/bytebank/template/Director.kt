package br.com.alura.bytebank.template

class Director(
    name: String,
    cpf: String,
    salary: Double,
    password: Int,
    val profitShare: Double

) : EmployeeAdmin( //Herança
    name = name,
    cpf = cpf,
    salary = salary,
    password = password

) {

    //Não vai ter mais o backing field porque vai ter o mesmo comportamento de uma função
    //Super.bonus, chama algum membro pertencente a classe mãe (é possível fazer com property)
    override val bonus: Double
        get() {
            return salary + profitShare
        }


}
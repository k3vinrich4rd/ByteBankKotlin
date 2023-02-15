package br.com.alura.bytebank.template

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
    override val bonus: Double = salary * 0.1


}
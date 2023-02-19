package br.com.alura.bytebank.template

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

    //Sobrescrita da função do comportamento feito na ‘interface’ (template.Authenticated) e Classe (template.EmployeeAdmin)
    //Essa sobrescrita está acontecendo, pois, ambos tem a mesma assinatura

}
package br.com.alura.bytebank.template

abstract class EmployeeAdmin(
    name: String,
    cpf: String,
    salary: Double,
    protected val password: Int

) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
), Authenticated {
    //Função que autentica employees e clients
    //Sobrescrita da função
    //Sobrescrita da função do comportamento feito na ‘interface’ (template.Authenticated) e Classe (template.EmployeeAdmin)
    //Essa sobrescrita está acontecendo, pois, ambos tem a mesma assinatura
    override fun authenticated(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}
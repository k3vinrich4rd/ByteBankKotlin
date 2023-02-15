package br.com.alura.bytebank.template

class BonusCalculator { //Faz um cálculo geral da bonificação dada aos funcionários da empresa

    var total: Double = 0.0
        private set

    /* /Utilizando essa implementação e apontando para a progenitora
    estamos esperando que esse comportamento (método) haja da mesma forma
    para seus filhos, tirando a necessidade de replicar um código que cumpra o mesmo
    objetivo

    obs: Mesmo fazendo essa referência, vale destacar que só vai ser possível acessar os
    comportamentos específicos a um employee, isso é polimorfismo
     */

    fun register(employee: Employee) {
        this.total += employee.bonus
    }

//    fun register(manager: template.Manager) {
//        this.total += manager.bonus
//
//    }
//
//    fun register(director: template.Director) {
//        this.total += director.bonus
//    }
}
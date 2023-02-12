class BonusCalculator { //Faz um calculo geral da bonificação dada aos funcionários da empresa

    var total: Double = 0.0
        private set

    fun register(employee: Employee) {
        this.total += employee.bonus
    }

    fun register(manager: Manager) {
        this.total += manager.bonus

    }

    fun register(director: Director) {
        this.total += director.bonus
    }
}
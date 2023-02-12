fun testEmployee() {
    val employee = Employee(
        "Kevin Richard",
        "111.111.111-11",
        1000.00,

        )
    println("Employee:")
    println("Name ${employee.name}")
    println("Cpf ${employee.cpf}")
    println("Salary ${employee.salary}")
    println("Bonus: ${employee.bonus}\n")


    val manager = Manager(
        "Elaine",
        "222.222.222-22",
        4000.00,
        12345
    )

    println("Manager:")
    println("Name ${manager.name}")
    println("Cpf ${manager.cpf}")
    println("Salary ${manager.salary}")
    println("Bonus: ${manager.bonus}")

    if (manager.authenticationEmployee(12345)) {
        println("Status authentication: Successfully authenticated\n")
    } else {
        println("Status authentication: Unauthenticated\n")
    }

    val director = Director(
        "Carlos Eduardo",
        "333.333.333-33",
        5000.00,
        30.00,
        2
    )

    println("Director:")
    println("Name ${director.name}")
    println("Cpf ${director.cpf}")
    println("Salary ${director.salary}")
    println("Bonus: ${director.bonus}") //bonus = property
    println("Profit Share: ${director.profitShare}")

    if (director.authenticationEmployee(1)) {
        println("Status authentication: Successfully authenticated\n")
    } else {
        println("Status authentication: Unauthenticated\n")
    }


    val analyst = Analyst("Rafael", "555.555.555-55", 5000.00)
    println("Analyst:")
    println("Name ${analyst.name}")
    println("Cpf ${analyst.cpf}")
    println("Salary ${analyst.salary}")
    println("Bonus: ${analyst.bonus}\n")

    val bonusCalculator = BonusCalculator()
    bonusCalculator.register(employee)
    bonusCalculator.register(manager)
    bonusCalculator.register(director)
    bonusCalculator.register(analyst)

    //total de bonificações dada pela empresa aos funcionários
    println("Total bonuses given by the company to employees: ${bonusCalculator.total}")
}
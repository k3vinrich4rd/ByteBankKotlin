fun testEmployee() {
    val analyst1 = Analyst(
        "Kevin Richard",
        "111.111.111-11",
        1000.00,

        )
    println("Analyst1:")
    println("Name ${analyst1.name}")
    println("Cpf ${analyst1.cpf}")
    println("Salary ${analyst1.salary}")
    println("Bonus: ${analyst1.bonus}\n")


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

    if (manager.authenticated(12345)) {
        println("Status authentication: Successfully authenticated\n")
    } else {
        println("Status authentication: Unauthenticated\n")
    }

    val director = Director(
        "Carlos Eduardo",
        "333.333.333-33",
        5000.00,
        3000,
        200.00
    )

    println("Director:")
    println("Name ${director.name}")
    println("Cpf ${director.cpf}")
    println("Salary ${director.salary}")
    println("Bonus: ${director.bonus}") //bonus = property
    println("Profit Share: ${director.profitShare}")

    if (director.authenticated(1)) {
        println("Status authentication: Successfully authenticated\n")
    } else {
        println("Status authentication: Unauthenticated\n")
    }

    val analyst2 = Analyst("Rafael", "555.555.555-55", 5000.00)
    println("Analyst2:")
    println("Name ${analyst2.name}")
    println("Cpf ${analyst2.cpf}")
    println("Salary ${analyst2.salary}")
    println("Bonus: ${analyst2.bonus}\n")

    val bonusCalculator = BonusCalculator()
    bonusCalculator.register(analyst1)
    bonusCalculator.register(manager)
    bonusCalculator.register(director)
    bonusCalculator.register(analyst2)

    //total de bonificações dada pela empresa aos funcionários
    println("Total bonuses given by the company to employees: ${bonusCalculator.total}")
}
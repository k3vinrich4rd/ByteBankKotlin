fun main(){
    println("Welcome to Bytebank\n")

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
    println("Bonus: ${manager.bonus}\n")

    if (manager.authenticationEmployee(12345)) {
        println("Successfully authenticated")
    } else {
        println("Unauthenticated")
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
    println("Bonus: ${director.profitShare}")
}
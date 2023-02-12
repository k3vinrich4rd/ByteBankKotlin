fun main() {
    println("Welcome to Bytebank\n")

    val alex = Employee(
        "Kevin Richard",
        "111.111.111-11",
        1000.00,
        1
    )
    println("Name ${alex.name}")
    println("Cpf ${alex.cpf}")
    println("Salary ${alex.salary}")
    println("Bonus: ${alex.bonus()}")
}
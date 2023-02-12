class SystemIntern {

    fun toEnter(employeeAdmin: EmployeeAdmin, password: Int) {
        if (employeeAdmin.authenticationEmployee(password)) {
            println("Welcome to Bytebank")
        } else {
            println("Authentication failed")
        }
    }
}

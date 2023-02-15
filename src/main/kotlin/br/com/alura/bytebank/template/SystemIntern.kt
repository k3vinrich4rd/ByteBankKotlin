package br.com.alura.bytebank.template

class SystemIntern {

    fun toEnter(employeeAdmin: Authenticated, password: Int) {
        if (employeeAdmin.authenticated(password)) {
            println("Welcome to Bytebank")
        } else {
            println("Authentication failed")
        }
    }
}

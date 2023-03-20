package br.com.alura.bytebank.template

class SystemIntern {

    fun toEnter(employeeAdmin: Authenticated, password: Int, authenticated: () -> Unit = {}) {
        if (employeeAdmin.authenticated(password)) {
            println("Welcome to Bytebank")
        } else {
            println("Authentication failed")
        }
    }

    fun toEnterReceiver(admin: Authenticated, password: Int, authenticated: SystemIntern.() -> Unit = {}) {
        if (admin.authenticated(password)) {
            println("Welcome to Bytebank")
            authenticated()
        } else {
            println("Authentication failed")
        }
    }

    fun pagamento() {
        println("pagamento realizado")
    }

}
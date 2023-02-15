package template

import template.Authenticated

class SystemIntern {

    fun toEnter(employeeAdmin: Authenticated, password: Int) {
        if (employeeAdmin.authenticated(password)) {
            println("Welcome to Bytebank")
        } else {
            println("Authentication failed")
        }
    }
}

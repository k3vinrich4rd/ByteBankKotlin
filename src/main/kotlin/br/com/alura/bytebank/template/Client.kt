package br.com.alura.bytebank.template

class Client(
    var name: String,
    var cpf: String,
    var address: Address = Address(),
    private val password: Int,
) : Authenticated {

    override fun authenticated(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false

    }
}
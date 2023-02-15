package br.com.alura.bytebank.template

class Client(
    val name: String,
    val cpf: String,
    private val password: Int
) : Authenticated {
    override fun authenticated(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}
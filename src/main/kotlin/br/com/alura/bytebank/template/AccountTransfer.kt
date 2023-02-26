package br.com.alura.bytebank.template

interface AccountTransfer {

    fun accountTransfer(value: Double, destiny: Account, password: Int)
}
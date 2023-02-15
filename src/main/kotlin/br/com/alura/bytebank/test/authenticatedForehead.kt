package br.com.alura.bytebank.test

import br.com.alura.bytebank.template.* //O '*' Siginifica que temos acesso a tudo que está no package "templates"

fun authenticatedForehead() {
    val manager = Manager(
        name = "Kevin Richard",
        cpf = "111.111.111-11",
        salary = 1000.00,
        password = 1000
    )

    val director = Director(
        name = "Felipe",
        cpf = "333.333.333-33",
        salary = 2000.00,
        password = 2000,
        profitShare = 100.00
    )

    val client = Client(
        name = "Grazi",
        "333.333.333-33",
        password = 1234
    )

    val systemIntern = SystemIntern()
    systemIntern.toEnter(manager, 100)
    systemIntern.toEnter(director, 200)
    systemIntern.toEnter(client, 1234)
    // systemIntern.toEnter(client, 1111)

}

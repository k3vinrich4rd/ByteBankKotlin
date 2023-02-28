package br.com.alura.bytebank.test

import br.com.alura.bytebank.template.Address

fun safeCallComLet() {
    //É necessário fazer um safe call para fazer o tratamento com o nullable
    //Se for null retorna nulo se não executa a ação necessária
    val addressNull: Address? = Address(publicPlace = "casa")
    //val newPublicPlace: String? = addressNull?.publicPlace
    addressNull?.let {
        println(addressNull.publicPlace)
    }
}

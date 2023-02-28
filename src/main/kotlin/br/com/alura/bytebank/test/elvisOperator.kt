package br.com.alura.bytebank.test

import br.com.alura.bytebank.template.Address

fun elvisOperator() {
    //É necessário fazer um safe call para fazer o tratamento com o nullable
    //Se for null retorna um valor que indico se não retorna o seu real valo
    val addressNull: Address? = Address(publicPlace = "casa")
    //val newPublicPlace: String? = addressNull?.publicPlace
    addressNull?.let {
        println(addressNull.publicPlace)
        //Sempre enviar um int
        val sizeComplement: Int = it.complement?.length ?: 0
        println(sizeComplement)
    }
}
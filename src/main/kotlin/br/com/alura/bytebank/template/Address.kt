package br.com.alura.bytebank.template

class Address(
    //As property preenchidas, indica que os valores são
    //Indica que os valores da instância de endereço são opcionais
    var publicPlace: String = "",
    var number: Int = 0,
    var neighborhood: String = "",
    var city: String = "",
    var state: String = "",
    var cep: String = "",
    var complement: String = ""
) {
    override fun toString(): String { //To raw String literal transforma em "modo texto" com o comportamento de string
        return """
            Address(publicPlace='$publicPlace',
             number=$number, 
             neighborhood='$neighborhood',
             city='$city',
             state='$state',
             complement='$complement')""".trimIndent() //Tira os espaços vazios em branco
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (publicPlace != other.publicPlace) return false
        if (number != other.number) return false
        if (neighborhood != other.neighborhood) return false
        if (city != other.city) return false
        if (state != other.state) return false
        if (cep != other.cep) return false
        if (complement != other.complement) return false

        return true
    }

    override fun hashCode(): Int {
        var result = publicPlace.hashCode()
        result = 31 * result + number
        result = 31 * result + neighborhood.hashCode()
        result = 31 * result + city.hashCode()
        result = 31 * result + state.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + complement.hashCode()
        return result
    }


}
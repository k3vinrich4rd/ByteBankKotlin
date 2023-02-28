package br.com.alura.bytebank.test


//Indica que valor que estamos trabalhando no parâmetro pode ser nulo
//Dado isso ele vai tentar converter, se ele não conseguir, o número vai receber um valor null
//É uma alternativa para fazer um casting seguro
fun safeCast(value: Any) {
    val number: Int? = value as? Int
    println(number)

}
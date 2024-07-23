fun main() {
    val peso = 85
    val altura = 176

    // Añade aquí tu código
    val imc = 10000.0 * peso / (altura*altura)
    println( "El valor de imc: ${"%10.1f".format(imc)}" )

    if (imc < 18.5)
        println("Tu peso está por debajo de lo normal")

    if ( imc > 25 )
        println("Tu peso está por encima de lo normal")
}
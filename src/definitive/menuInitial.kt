package definitive

fun main(){

    while(true) {
        val menuPrime = MenuPrincipal()
        menuPrime.optionEstructure()
        menuPrime.chosenOne(menuPrime.choseOne())
    }
}
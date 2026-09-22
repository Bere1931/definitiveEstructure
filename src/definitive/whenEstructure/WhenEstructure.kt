package definitive.whenEstructure

import definitive.MenuPrincipal

class WhenEstructure {

    fun whenEstructure(){

        do {
            println("¿Si tuvieras que elegir un color de la opciones mostradas que color seleccionarias?")
            println("Selecciona una opcion")
            println("1. Negro")
            println("2. Morado")

            val initial = MenuPrincipal()
            val started = initial.choseOne()

            when(started) {
                1 -> println("Negro")
                2 -> println("Morado")
            }
            println("¿Te gustaria elegir nuevamente?")
            println("1. Si")
            println("2. No")
            val anotherTry = initial.choseOne()
        }while(anotherTry != 2)

    }


}
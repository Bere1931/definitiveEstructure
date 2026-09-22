package definitive.whileEstructure

import definitive.MenuPrincipal

class WhileEstructure {
    fun whileEstructure(){

        do {
            val begining = MenuPrincipal()
            println("Esta opcion genera un listado de números pares donde se requiere ingreses el numero inicial y el numero limite")
            println("Ingresa tu numero par inicial")
            var numberinitial = begining.choseOne()
            while (numberinitial % 2 != 0) {
                println("recuerda que es un listado de numeros pares, debes elegir un número par inicial")
                numberinitial = begining.choseOne()
            }
            println("Ingresa tu numero par final")
            val numberfinal = begining.choseOne()
            if (numberfinal % 2 != 0) println("recuerda que es un listado de numeros pares, debes elegir un número par final")
            while (numberinitial <= numberfinal) {
                println(numberinitial)
                numberinitial += 2
            }
            println("¿Deseas generar otra serie de números nones?")
            println("1 .- Generar nueva serie")
            println("2 .- Regresar al menu principal")
            val outwhile = begining.choseOne()
        }while (outwhile != 2)
            println("Bye")

    }
}

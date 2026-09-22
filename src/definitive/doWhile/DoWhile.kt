package definitive.doWhile

import definitive.MenuPrincipal

class DoWhile {
    fun doWhile(){
        do {
            val menuPrincipal = MenuPrincipal()
            println("Esta opcion genera un listado de números nones donde se requiere ingreses el numero inicial y el numero limite")
            println("Ingresa tu numero non inicial")
            var numberinitial = menuPrincipal.choseOne()
            while (numberinitial % 2 == 0) {
            println("recuerda que es un listado de numeros nones, debes elegir un número non inicial")
            numberinitial = menuPrincipal.choseOne()
            }
            println("Ingresa tu numero non final")
            val numberfinal = menuPrincipal.choseOne()
            if (numberfinal % 2 == 0) println("recuerda que es un listado de numeros nones, debes elegir un número non final")
            while (numberinitial <= numberfinal) {
            println(numberinitial)
            numberinitial += 2
            }
            println("¿Deseas generar otra serie de números nones?")
            println("1 .- Generar nueva serie")
            println("2 .- Regresar al menu principal")
            val outdowhile = menuPrincipal.choseOne()
        } while (outdowhile != 2)

    }
}
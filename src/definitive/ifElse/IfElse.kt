package definitive.ifElse

import definitive.MenuPrincipal

class IfElse {

    fun ifElse() {

        do{
            val optionMenu = MenuPrincipal()
            println("Este ejercicio muestra si la suma de dos números es menor, mayor o igual a el número elegido")
            println("Ingresa tu primer número")
            val num1 = optionMenu.choseOne()
            println("Ingresa tu segundo número")
            val num2 = optionMenu.choseOne()
            println("Ingresa tu tercer número")
            val num3 = optionMenu.choseOne()

            if (num1 + num2 < num3) {
            println("la suma es ${num1 + num2} que es menor a $num3")
            } else if (num1 + num2 > num3) {
            println("${num1 + num2} es mayor al número $num3")
            } else println("${num1 + num2} es igual al número $num3")
            println("Nos vemos")

            println("¿Deseas generar otra serie de números nones?")
            println("1 .- Generar nueva serie")
            println("2 .- Regresar al menu principal")
            val outwhile = optionMenu.choseOne()
        }while (outwhile != 2)
            println("Bye")

        }

}

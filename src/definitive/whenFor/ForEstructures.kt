package definitive.whenFor

import definitive.MenuPrincipal

class ForEstructures {

    fun forNormal(){

        println("Esta opción te dara un listado de numeros que elijas del primero al ultimo")
        println("Ingresa tu primer numero:")
        val mainMenu = MenuPrincipal()
        val numb1 = mainMenu.choseOne()
        println("Ingresa tu segundo nùmero")
        val mainMenu0 = MenuPrincipal()
        val numb2 = mainMenu0.choseOne()

        if (numb1 < numb2 ){

            for (i in numb1 .. numb2){
                println(i)
            }
        } else println("Tu segundo numero no puede ser menor al primero")

    }

    fun forReverso(){

        println("Esta opción te dara un listado de numeros que elijas del ultimo al primero")
        println("Ingresa tu primer numero: ")
        val mainMenu1 = MenuPrincipal()
        val numb1 = mainMenu1.choseOne()
        println("Ingresa tu segundo numero: ")
        val mainMenu2 = MenuPrincipal()
        val numb2 = mainMenu2.choseOne()

        if (numb1 > numb2 ){

            for (i in numb1 downTo numb2){
                println(i)
            }
        } else println("Tu segundo numero no puede ser mayor al primero")


    }

    fun forHastaNum(){

        println("Esta opción te dara un listado de numeros que elijas del primero hasta el penultimo numero")
        println("Ingresa tu primer numero: ")
        val mainMenu3 = MenuPrincipal()
        val numb1 = mainMenu3.choseOne()
        println("Ingresa tu segundo numero: ")
        val mainMenu4 = MenuPrincipal()
        val numb2 = mainMenu4.choseOne()

        if (numb1 < numb2 ){

            for (i in numb1 until numb2){
                println(i)
            }
        } else println("Tu segundo numero no puede ser menor al primero")

    }

    fun forInterva(){

        println("Esta opción te dara un listado de numeros que elijas del primero al ultimo con intervalos entre ellos")
        println("Ingresa tu primer numero: ")
        val mainMenu5 = MenuPrincipal()
        val numb1 = mainMenu5.choseOne()
        println("Ingresa tu segundo numero: ")
        val mainMenu6 = MenuPrincipal()
        val numb2 = mainMenu6.choseOne()
        println("Ingresa el intervalo entre numeros: ")
        val mainMenu7 = MenuPrincipal()
        val steps = mainMenu7.choseOne()

        if (numb1 < numb2 && steps > 0){

            for (i in numb1 .. numb2 step steps){
                println(i)
            }
        } else println("Tu segundo numero no puede ser menor al primero y el salto de numero debe ser mayor a 0")

    }

    fun forList(){

        println("Opcion que genera un listado de nombres")
        println("Ingresa el primer nombre: ")
        val mainMenu8 = MenuPrincipal()
        val name = mainMenu8.choseOneText()
        println("Ingresa un segundo nombre: ")
        val mainMenu9 = MenuPrincipal()
        val name2 = mainMenu9.choseOneText()
        println("Ingresa un tercer nombre: ")
        val mainMenu10 = MenuPrincipal()
        val name3 = mainMenu10.choseOneText()

        val names = listOf(name, name2, name3)

        for (i in names){
            println(i)
        }
    }

    fun forListaIndice(){

        println("Opcion que genera un listado de nombres en orden de anotacion")
        println("Ingresa el primer nombre: ")
        val mainMenu11 = MenuPrincipal()
        val name = mainMenu11.choseOneText()
        println("Ingresa un segundo nombre: ")
        val mainMenu12 = MenuPrincipal()
        val name2 = mainMenu12.choseOneText()
        println("Ingresa un tercer nombre: ")
        val mainMenu13 = MenuPrincipal()
        val name3 = mainMenu13.choseOneText()

        val names1 = listOf(name, name2, name3)

        for (nameless1 in names1.indices){
            println("${nameless1 + 1} ${names1[nameless1]}")
        }
    }



}
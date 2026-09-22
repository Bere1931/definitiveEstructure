package definitive

import definitive.ifElse.IfElse
import definitive.whileEstructure.WhileEstructure
import definitive.doWhile.DoWhile
import definitive.whenEstructure.WhenEstructure
import definitive.whenFor.WhenFor
import java.util.Scanner


    class MenuPrincipal {

        fun optionEstructure(){

            println("Este menu despliega las siguientes estructuras")
            println("1. If - Else")
            println("2. While")
            println("3. Do - While")
            println("4. When")
            println("5. For")
            println("Selecciona la opción que deseas resolver")
        }
        fun forEstructure() {
            println("1.-For simple")
            println("2.- For en reversa")
            println("3.- For hasta que...") //este es el for que lleva la palabra reservada until
            println("4.- For steps") // For por intervalos, el intervalo lo tiene que ingresar el usuario
            println("5.- For en listas") // For que te da un listado, el dato lo debe ingresar el usuario
            println("6.- For para recorrer listas con indices")
        }

        fun choseOne(): Int {
            val scanner: Scanner = Scanner(System.`in`)
            return scanner.nextInt()

        }

        fun choseOneText(): String {
            val scanner: Scanner = Scanner(System.`in`)
            return scanner.nextLine()
        }
            fun chosenOne(choseOne: Int){

            when(choseOne){

                1 -> {
                    val ifElse = IfElse()
                    ifElse.ifElse()
                    //Aqui se mostrara la estructura If - Else
                }

                2 -> {
                    val whileEstructure = WhileEstructure()
                    whileEstructure.whileEstructure()

                    //Aqui se mostrara la estructura While
                }

                3 -> {
                    val doWhile = DoWhile()
                    doWhile.doWhile()
                    //Aqui se mostrara la estructura Do -While
                }

                4 -> {
                    val whenEstructure1 = WhenEstructure()
                    whenEstructure1.whenEstructure()
                    //Aqui se mostrara la estructura When
                }

                5 -> {
                    forEstructure()
                    val whenFor2 = WhenFor()
                    whenFor2.whenFor()
                    //Aqui se mostrara la estructura For
                }
            }
        }
    }

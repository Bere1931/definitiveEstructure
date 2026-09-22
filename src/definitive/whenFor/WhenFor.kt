package definitive.whenFor

import definitive.MenuPrincipal

class WhenFor {

    fun whenFor(){

        val mainMenu = MenuPrincipal()
        val option1 = mainMenu.choseOne()

        when (option1) {
            1 -> {
                val forExample = ForEstructures()
                forExample.forNormal()
            }

            2 -> {
                val forExample = ForEstructures()
                forExample.forReverso()
            }

            3 -> {
                val forExample = ForEstructures()
                forExample.forHastaNum()
            }

            4 -> {
                val forExample = ForEstructures()
                forExample.forInterva()
            }

            5 -> {
                val forExample = ForEstructures()
                forExample.forList()
            }

            6 -> {
                val forExample = ForEstructures()
                forExample.forListaIndice()
            }
        }
    }
}

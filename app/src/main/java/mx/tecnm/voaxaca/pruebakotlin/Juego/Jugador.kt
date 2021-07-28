package mx.tecnm.voaxaca.pruebakotlin.Juego

class Jugador {

    var salud: Int = 100


    fun conseguirEnergia(subidorEnergia: SubidorEnergia){

        salud = subidorEnergia.consumir(salud)

    }

}
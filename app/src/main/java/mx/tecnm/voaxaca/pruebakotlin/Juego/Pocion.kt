package mx.tecnm.voaxaca.pruebakotlin.Juego


class Pocion : SubidorEnergia(){

    override val energiaBase = 15


    val engorda = 2

    override fun consumir(saludInicial: Int) =
        saludInicial +  energiaBase - engorda

}
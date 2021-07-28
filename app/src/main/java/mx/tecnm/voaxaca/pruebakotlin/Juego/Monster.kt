package mx.tecnm.voaxaca.pruebakotlin.Juego


class Monster: SubidorEnergia(){
    override val energiaBase = 300

    override fun consumir(saludInicial: Int) =
        saludInicial + energiaBase * 1000

}

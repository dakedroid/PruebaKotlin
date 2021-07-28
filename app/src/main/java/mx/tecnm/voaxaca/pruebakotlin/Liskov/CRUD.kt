package mx.tecnm.voaxaca.pruebakotlin.Liskov


interface MCrud {

    fun Add() // Crear - Create

    fun Update() // Actualizar - Update

    fun Delete() // Borrar - Delete

    fun Get()    // Obtener - Read

}

class Usuario : MCrud{

    override fun Add() {
        //  Logica ara agregar usuario al servidor
    }

    override fun Update() {
        // Logica para actualizar
    }

    override fun Delete() {
        // Logica para borrar
    }

    override fun Get() {
        // Logica para conseguir el usuario del servidor.
    }


}

class Carrito : MCrud {

    override fun Add() {
        // Logica agregar al crud
    }

    override fun Update(){
        throw NotImplementedError("Funcion no implementada")
    }

    override fun Delete() {
       // Logica para borrar
    }

    override fun Get() {
        throw NotImplementedError("Funcion no implementada")
    }


}

class Ubicacion {

    val tipo: TipoUbicacion
    var direccion: String

    constructor(tipo: TipoUbicacion, direccion: String) {
        this.tipo = tipo
        this.direccion = direccion
    }

    fun mostrarUbicacion() {
        when (tipo) {
            TipoUbicacion.ONLINE -> println("Este evento es online.")
            TipoUbicacion.PRESENCIAL -> {
                if (direccion.isNotEmpty()) {
                    println("Este evento es presencial en la dirección: $direccion")
                } else {
                    println("La dirección para el evento presencial no se ha definido.")
                }
            }
        }
    }
}


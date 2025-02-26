class Organizador : Usuario {
    val eventosCreados: ArrayList<Evento> = ArrayList()

    constructor(nombre: String, correo: String, contraseña: String) : super(nombre, correo, contraseña)

    fun crearEvento(nombre: String, fecha: String, duracion: Int, ubicacion: Ubicacion, categoria: CategoriaEvento): Evento {
        val evento = Evento(nombre, fecha, duracion, ubicacion, CategoriaEvento.ACTIVIDADES_ECOLOGICAS, this.nombre)
        eventosCreados.add(evento)
        return evento
    }

    fun modificarEvento(evento: Evento, nombre: String, fecha: String, duracion: Int, ubicacion: Ubicacion, categoria: CategoriaEvento) {
        evento.nombre = nombre
        evento.fecha = fecha
        evento.duracion = duracion
        evento.ubicacion = ubicacion
        evento.categoria = categoria
    }
}

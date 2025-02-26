class Evento {

    var nombre: String = ""
    var fecha: String = ""
    var duracion: Int = 0
    var ubicacion: Ubicacion
    var categoria: CategoriaEvento = CategoriaEvento.CONFERENCIAS
    var organizador: String = ""
    val asistentes: ArrayList<Usuario> = ArrayList()

    constructor(nombre: String, fecha: String, duracion: Int, ubicacion: Ubicacion, categoria: CategoriaEvento, organizador: String) {
        this.nombre = nombre
        this.fecha = fecha
        this.duracion = duracion
        this.ubicacion = ubicacion
        this.categoria = categoria
        this.organizador = organizador
    }

    fun registrarParticipante(usuario: Usuario) {
        if (!asistentes.contains(usuario)) {
            asistentes.add(usuario)
            println("${usuario.nombre} se ha registrado en el evento '$nombre'.")
        } else {
            println("${usuario.nombre} ya está registrado en el evento '$nombre'.")
        }
    }

    fun cancelarParticipante(usuario: Usuario) {
        if (asistentes.contains(usuario)) {
            asistentes.remove(usuario)
            println("${usuario.nombre} ha cancelado su inscripción al evento '$nombre'.")
        } else {
            println("${usuario.nombre} no está inscrito en el evento '$nombre'.")
        }
    }

    fun mostrarDetalles() {
        println("Evento: $nombre")
        println("Fecha: $fecha")
        println("Duración: $duracion horas")
        println("Ubicación: $ubicacion")
        println("Categoría: ${categoria.descripcion}")
        println("Organizador: $organizador")
        println("Número de asistentes: ${asistentes.size}")
    }
}

class Categoria {

    var nombre: String
    val eventos: ArrayList<Evento>

    constructor(nombre: String) {
        this.nombre = nombre
        this.eventos = ArrayList()
    }

    fun agregarEvento(evento: Evento) {
        eventos.add(evento)
    }

    fun mostrarEventos() {
        if (eventos.isEmpty()) {
            println("No hay eventos en esta categoría.")
        } else {
            println("Eventos en la categoría '$nombre':")
            for (evento in eventos) {
                println("Nombre: ${evento.nombre}, Fecha: ${evento.fecha}, Duración: ${evento.duracion} horas, Ubicación: ${evento.ubicacion.direccion}")
            }
        }
    }

}

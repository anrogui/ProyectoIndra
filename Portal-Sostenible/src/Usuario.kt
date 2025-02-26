open class Usuario {
    var nombre: String = ""
    var correo: String = ""
    var contrasena: String = ""
    val eventosInscritos = ArrayList<Evento>()

    constructor(nombre: String, correo: String, contrasena: String) {
        this.nombre = nombre
        this.correo = correo
        this.contrasena = contrasena
    }

    fun inscribirseEnEvento(evento: Evento) {
        if (!eventosInscritos.contains(evento)) {
            eventosInscritos.add(evento)
            evento.registrarParticipante(this)
            println("$nombre se ha inscrito en el evento ${evento.nombre}")
        } else {
            println("$nombre ya está inscrito en el evento ${evento.nombre}")
        }
    }

    fun cancelarInscripcion(evento: Evento) {
        if (eventosInscritos.contains(evento)) {
            eventosInscritos.remove(evento)
            println("$nombre ha cancelado su inscripción en el evento ${evento.nombre}")
        } else {
            println("$nombre no estaba inscrito en el evento ${evento.nombre}")
        }
    }
}


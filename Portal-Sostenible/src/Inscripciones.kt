class Inscripciones {

    val usuario: Usuario
    val evento: Evento

    constructor(usuario: Usuario, evento: Evento) {
        this.usuario = usuario
        this.evento = evento
    }

    fun registrarInscripcion() {
        if (!usuario.eventosInscritos.contains(evento)) {
            usuario.eventosInscritos.add(evento)
            evento.registrarParticipante(usuario)
            println("${usuario.nombre} se ha inscrito exitosamente al evento '${evento.nombre}'.")
        } else {
            println("${usuario.nombre} ya está inscrito en el evento '${evento.nombre}'.")
        }
    }

    fun cancelarInscripcion() {
        if (usuario.eventosInscritos.contains(evento)) {
            usuario.eventosInscritos.remove(evento)
            evento.cancelarParticipante(usuario)
            println("${usuario.nombre} ha cancelado su inscripción al evento '${evento.nombre}'.")
        } else {
            println("${usuario.nombre} no está inscrito en el evento '${evento.nombre}'.")
        }
    }
}

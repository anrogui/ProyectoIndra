fun main() {
    val organizador = Organizador("EcoEventos", "contacto@eco.com", "12345")

    val usuario1 = Usuario("Juan Pérez", "juan@gmail.com", "12132")
    val usuario2 = Usuario("Maria López", "maria@gmail.com", "33322")
    val ubicacion = Ubicacion(TipoUbicacion.PRESENCIAL, "Calle 123, Madrid")

    val categoria = CategoriaEvento.ACTIVIDADES_ECOLOGICAS
    val eventoSostenible = organizador.crearEvento("Taller de Reciclaje", "2025-05-01", 4, ubicacion,categoria
    )

    usuario1.inscribirseEnEvento(eventoSostenible)
    usuario2.inscribirseEnEvento(eventoSostenible)

    eventoSostenible.mostrarDetalles()
}
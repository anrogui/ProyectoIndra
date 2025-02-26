class Factoria {

    fun crearUsuario(nombre: String, correo: String, contrasena: String): Usuario {
        return Usuario(nombre, correo, contrasena)
    }

    fun crearOrganizador(nombre: String, correo: String, contrasena: String): Organizador {
        return Organizador(nombre, correo, contrasena)
    }

    fun crearEvento(nombre: String, fecha: String, duracion: Int, ubicacion: Ubicacion, categoria: CategoriaEvento, organizador: Organizador): Evento {
        return organizador.crearEvento(nombre, fecha, duracion, ubicacion, categoria)
    }

    fun crearUbicacion(tipo: TipoUbicacion, direccion: String): Ubicacion {
        return Ubicacion(tipo, direccion)
    }

    fun crearCategoria(nombre: String): CategoriaEvento {
        return CategoriaEvento.valueOf(nombre.uppercase())
    }
}

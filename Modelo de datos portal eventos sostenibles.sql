
CREATE TABLE Usuarios (
    ID_Usuario NUMBER(10) PRIMARY KEY,
    Nombre VARCHAR2(50) NOT NULL,
    Correo VARCHAR2(100) NOT NULL UNIQUE,
    Contraseña VARCHAR2(50) NOT NULL
);

CREATE TABLE Organizadores (
    ID_Organizador NUMBER(10) PRIMARY KEY,
    Nombre VARCHAR2(50) NOT NULL,
    Contacto VARCHAR2(100) NOT NULL
);

CREATE TABLE Categorias (
    ID_Categoria NUMBER(10) PRIMARY KEY,
    Nombre VARCHAR2(50) NOT NULL UNIQUE
);

CREATE TABLE Ubicaciones (
    ID_Ubicacion NUMBER(10) PRIMARY KEY,
    Direccion VARCHAR2(150) NOT NULL
);

CREATE TABLE Eventos (
    ID_Evento NUMBER(10) PRIMARY KEY,
    Nombre VARCHAR2(100) NOT NULL,
    Fecha DATE NOT NULL,
    Duracion NUMBER(3) NOT NULL,
    ID_Ubicacion NUMBER(10) NOT NULL,
    ID_Organizador NUMBER(10) NOT NULL,
    ID_Categoria NUMBER(10) NOT NULL,
    FOREIGN KEY (ID_Ubicacion) REFERENCES Ubicaciones(ID_Ubicacion),
    FOREIGN KEY (ID_Organizador) REFERENCES Organizadores(ID_Organizador),
    FOREIGN KEY (ID_Categoria) REFERENCES Categorias(ID_Categoria)
);

CREATE TABLE Inscripciones (
    ID_Inscripcion NUMBER(10) PRIMARY KEY,
    ID_Usuario NUMBER(10) NOT NULL,
    ID_Evento NUMBER(10) NOT NULL,
    Fecha_Inscripcion DATE NOT NULL,
    FOREIGN KEY (ID_Usuario) REFERENCES Usuarios(ID_Usuario),
    FOREIGN KEY (ID_Evento) REFERENCES Eventos(ID_Evento)
);



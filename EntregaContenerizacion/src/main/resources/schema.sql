-- =========================
-- TABLA PERSONA
-- =========================
CREATE TABLE IF NOT EXISTS persona (
                                       id_persona BIGINT AUTO_INCREMENT PRIMARY KEY,
                                       nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    fecha_nacimiento DATE,
    numero_identificacion INT NOT NULL,
    fecha_registro DATE,
    activo BOOLEAN
    );

-- =========================
-- TABLA CONTACTO
-- =========================
CREATE TABLE IF NOT EXISTS contacto (
                                        id_contacto BIGINT AUTO_INCREMENT PRIMARY KEY,
                                        direccion VARCHAR(255),
    email VARCHAR(150),
    telefono BIGINT,
    celular BIGINT,
    casa BOOLEAN,
    oficina BOOLEAN,
    otro BOOLEAN,
    id_persona BIGINT NOT NULL,

    CONSTRAINT fk_contacto_persona
    FOREIGN KEY (id_persona)
    REFERENCES persona(id_persona)
    ON DELETE CASCADE
    );
CREATE TABLE asistentes (
  ci_asis INTEGER UNSIGNED NOT NULL,
  nombre_asis VARCHAR(15) NOT NULL,
  apellido_asis VARCHAR(30) NOT NULL,
  ocupacion_asis VARCHAR(20) NOT NULL,
  correo_asis VARCHAR(30) NOT NULL,
  PRIMARY KEY(ci_asis)
);

CREATE TABLE cronograma (
  id_crono INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  grupos_id_grupo INTEGER UNSIGNED NOT NULL,
  expositores_id_expo INTEGER UNSIGNED NOT NULL,
  hora TIME NOT NULL,
  PRIMARY KEY(id_crono),
  INDEX cronograma_FKIndex1(expositores_id_expo),
  INDEX cronograma_FKIndex2(grupos_id_grupo)
);

CREATE TABLE expositores (
  id_expo INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nombre_expo VARCHAR(15) NOT NULL,
  apellido_expo VARCHAR(30) NOT NULL,
  historial VARCHAR(60) NOT NULL,
  nro_contacto INTEGER UNSIGNED NOT NULL,
  actividades TEXT NULL,
  PRIMARY KEY(id_expo)
);

CREATE TABLE grupos (
  id_grupo INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  cupos_dispo INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id_grupo)
);

CREATE TABLE inscripcion (
  grupos_id_grupo INTEGER UNSIGNED NOT NULL,
  asistentes_ci_asis INTEGER UNSIGNED NOT NULL,
  asistido CHAR(1) NOT NULL,
  PRIMARY KEY(grupos_id_grupo, asistentes_ci_asis),
  INDEX asisten_grupo_FKIndex1(asistentes_ci_asis),
  INDEX asisten_grupo_FKIndex2(grupos_id_grupo)
);

CREATE TABLE temas (
  id_tema INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  expositores_id_expo INTEGER UNSIGNED NOT NULL,
  nombre_tema VARCHAR(20) NOT NULL,
  descrip_tema VARCHAR(50) NOT NULL,
  PRIMARY KEY(id_tema),
  INDEX temas_FKIndex1(expositores_id_expo)
);

CREATE TABLE usuarios (
  id_usuario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nombre_us VARCHAR(15) NOT NULL,
  contrasenia VARCHAR(15) NOT NULL,
  PRIMARY KEY(id_usuario)
);



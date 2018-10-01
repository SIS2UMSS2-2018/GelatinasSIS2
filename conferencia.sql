CREATE TABLE asistentes (
  id_asistente INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nombre_asis VARCHAR(15) NOT NULL,
  ci_asis VARCHAR(15) NOT NULL,
  ocupacion_asis VARCHAR(20) NOT NULL,
  asistido CHAR NOT NULL,
  apellido_asis VARCHAR(30) NOT NULL,
  PRIMARY KEY(id_asistente)
);

CREATE TABLE asisten_grupo (
  asistentes_id_asistente INTEGER UNSIGNED NOT NULL,
  grupos_id_grupo INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(asistentes_id_asistente, grupos_id_grupo),
  INDEX asisten_grupo_FKIndex1(asistentes_id_asistente),
  INDEX asisten_grupo_FKIndex2(grupos_id_grupo)
);

CREATE TABLE expositores (
  id_expo INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nombre_expo VARCHAR(15) NOT NULL,
  apellido_expo VARCHAR(30) NOT NULL,
  historial VARCHAR(60) NOT NULL,
  PRIMARY KEY(id_expo)
);

CREATE TABLE grupos (
  id_grupo INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  horas_id_hora INTEGER UNSIGNED NOT NULL,
  temas_id_tema INTEGER UNSIGNED NOT NULL,
  expositores_id_expo INTEGER UNSIGNED NOT NULL,
  cupos_dispo INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id_grupo),
  INDEX grupos_FKIndex1(expositores_id_expo),
  INDEX grupos_FKIndex2(temas_id_tema),
  INDEX grupos_FKIndex3(horas_id_hora)
);

CREATE TABLE horas (
  id_hora INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  hora_in TIME NOT NULL,
  hora_fin TIME NOT NULL,
  PRIMARY KEY(id_hora)
);

CREATE TABLE temas (
  id_tema INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nombre_tema VARCHAR(20) NOT NULL,
  descrip_tema VARCHAR(50) NOT NULL,
  PRIMARY KEY(id_tema)
);

CREATE TABLE usuarios (
  id_usuario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nombre_us VARCHAR(15) NOT NULL,
  contrasenia VARCHAR(15) NOT NULL,
  PRIMARY KEY(id_usuario)
);



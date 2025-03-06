create database primeraapi;
use primeraapi;
CREATE TABLE persona (
  idpersona INT  NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NOT NULL,
  correo VARCHAR(45) NOT NULL,

  PRIMARY KEY (idpersona));
INSERT INTO persona (nombre, apellido, correo) VALUES('Joel', 'Jurado', 'juradoec@yahoo.com');
INSERT INTO persona (nombre, apellido, correo) VALUES('Carlos', 'Miranda', 'mirandaTr98@gmail.com');
INSERT INTO persona (nombre, apellido, correo) VALUES('Marcela', 'Sanchez', 'schMarce@itb.com');
INSERT INTO persona (nombre, apellido, correo) VALUES('Ben', 'Tennyson', 'ben10@cn.com');

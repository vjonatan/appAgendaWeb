create database dbappwebagenda;
use dbappwebagenda;

create table tusuario
(
idUsuario int auto_increment not null,
nombre varchar(70) not null,
apellido varchar(40) not null,
fechaNacimiento date not null,
correoElectronico varchar(700) not null,
contrasenia varchar(700) not null,
fechaRegistro datetime not null,
fechaModificacion datetime not null,
primary key (idUsuario)
);

create table tactividad
(
idActividad int auto_increment not null,
idUsuario int not null,
nombre varchar(700) not null,
descripcion text not null,
lugar varchar(700) not null,
fechaHoraInicio datetime not null,
fechaHoraFin datetime not null,
estado bit not null,
fechaRegistro datetime not null,
fechaModificacion datetime not null,
foreign key (idUsuario) references tusuario(idUsuario),
primary key (idActividad)
);
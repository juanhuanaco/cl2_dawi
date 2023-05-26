CREATE DATABASE bd_cl2_dawi_huanacoquispe;
USE bd_cl2_dawi_huanacoquispe;

create table Area (
id int primary key auto_increment,
nombre varchar(30),
jefe varchar(50)
);

create table Personal (
id int primary key auto_increment,
nombre varchar(30),
sueldo decimal,
id_area int references Area(id)
);

insert into Area (id, nombre, jefe)
values 
	(null, "Recursos Humanos", "Raul Garcia"),
	(null, "Finanzas", "Hector Puerta"),
	(null, "Contabilidad y administración", "Martha Quispe");

insert into Personal (id, nombre, sueldo, id_area)
values
	(null, "Juan Huanaco", 3500, 1),
    (null, "Robin Hood", 2500, 2),
    (null, "Oscar Hupp", 3000, 3),
    (null, "Ruben Tuesta", 3000, 3),
    (null, "Gustavo Gucci", 4000, 3),
    (null, "Manuel Bustamante", 3500, 1),
    (null, "Flor Rocio", 3000, 2),
    (null, "Daniela Figueroa", 4400, 3),
    (null, "Victor Baca", 3500, 3),
    (null, "Jesus Antonio", 5500, 2);
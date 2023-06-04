# Taller-6
## Repository pattern

Paquetes y sub paquetes

![image](https://github.com/JuanGutierrez350/Taller-6/assets/125483059/11218474-5d01-4190-9206-68af57b9a9dd)

ConnectionPool

![image](https://github.com/JuanGutierrez350/Taller-6/assets/125483059/602e859b-a910-4b46-9e14-d9f502f6099e)

Prueba ConnectionPool
![image](https://github.com/JuanGutierrez350/Taller-6/assets/125483059/a2b48aa3-bd55-4f54-9223-f0279765ed12)

Interfaz Repository
![image](https://github.com/JuanGutierrez350/Taller-6/assets/125483059/d8088184-933c-4886-be8c-a5e7de5d74a8)

![image](https://github.com/JuanGutierrez350/Taller-6/assets/125483059/a31203cc-6c72-460e-a4a7-8723a6cb7ccd)

![image](https://github.com/JuanGutierrez350/Taller-6/assets/125483059/1d7665e1-6c76-4e42-a165-c8ed4ca82f49)

![image](https://github.com/JuanGutierrez350/Taller-6/assets/125483059/9cbae6b2-cd4c-431c-b057-2cfe2a1776db)

![image](https://github.com/JuanGutierrez350/Taller-6/assets/125483059/f67be9d2-a023-4f99-9fef-25b797128495)

![image](https://github.com/JuanGutierrez350/Taller-6/assets/125483059/72c2d8c9-2972-4f49-ae5f-57a34f5c585f)

![image](https://github.com/JuanGutierrez350/Taller-6/assets/125483059/812bcdb5-76d0-4582-aed7-57112a0b6377)


Vista (webapp) corregida y funcional (login y registro). Subcarpetas requeridas.

![image](https://github.com/JuanGutierrez350/Taller-6/assets/125483059/cc9584b3-98be-4168-951f-4fcf27169c3f)

Script de creación de la base de datos y la tabla usuarios.

![image](https://github.com/JuanGutierrez350/Taller-6/assets/125483059/bc747885-c3b3-4857-b640-05014bc9ec31)

![image](https://github.com/JuanGutierrez350/Taller-6/assets/125483059/29fd6bf2-6a22-4dbd-909d-bd77fef6a3c8)


create database MyApp;
use MyApp;

create table users_tbl ( 
user_id int auto_increment primary key,
user_firstname varchar (40) not null, 
user_lastname varchar (40) not null,
user_email varchar (60) not null, 
user_password varbinary (256) 
);

 insert into users_tbl (user_firstname, user_lastname, user_email, user_password) 
 values(UPPER('Juan David '), UPPER('Gutierrez Valencia'), 'juandavidgv678@gmail.com',
 aes_encrypt('soy muy lindo', '$2a$12$.fGk4WqmfuQAgBuoo7mypeYkAfa84R5rtnAXcl0wy4Wt44nASbq8m
'));

select*, 
cast(aes_decrypt(user_password, '$2a$12$.fGk4WqmfuQAgBuoo7mypeYkAfa84R5rtnAXcl0wy4Wt44nASbq8m
')AS CHAR(50)) end_data from users_tbl where user_id=1;

describe users_tbl;

select * from users_tbl;

drop table users_tbl;



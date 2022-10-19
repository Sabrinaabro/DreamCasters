create database travelmanagementsystem;

show databases;

use travelmanagementsystem;

create table account(Username varchar(20), name varchar(20), password varchar(20), secure varchar(100), answer varchar(50));
show tables;

create table customer(Username varchar(20), id varchar(30), number varchar(30), name varchar(30),gender varchar(20),country varchar(30),
address varchar(50), phone varchar(15), email varchar(40));

select * from customer;

create table bookpackage(Username varchar(20), package varchar(20),persons varchar(20), id varchar(30), number varchar(30), phone varchar(20),
price varchar(20));

select * from bookpackage;
select * from hotel;
insert into hotel values('Voyage Resort','35000','15600','1340');
insert into hotel values('Bliss Hotel','30000','23000','1200');
insert into hotel values('St Regis Hotels & Resorts','40000','15000','1024');
insert into hotel values('Regent Hotels','55000','20000','1234');
insert into hotel values('Rosewood Hotels & Resorts','45000','25000','1235');
insert into hotel values('Treebones Resort','35000','30000','1399');
insert into hotel values('The Palm Hotels','65000','14000','1400');
insert into hotel values('Brooklyn Hotels','35000','12000','1350');
insert into hotel values('La Serene','35000','13500','1200');
insert into hotel values('Palace Indigo','75000','20000','2100)');


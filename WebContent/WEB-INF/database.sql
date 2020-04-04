create database mypetdb;

use mypetdb;


create table pet_login(
login_id varchar(50) NOT NULL PRIMARY KEY,
login_password varchar(150)
);

create table owner(
owner_id varchar(7) NOT NULL PRIMARY KEY,
owner_name varchar(20),
owner_ph varchar(20),
owner_email varchar(50),
owner_add varchar(100)
);

create table doctor(
doctor_id varchar(7) NOT NULL PRIMARY KEY,
doctor_name varchar(25),
doctor_rank varchar(50)
);

insert into pet_login values('id01','admin');
insert into pet_login values('did001','doctor');
insert into pet_login values('oid0001','owner');

create table species(
species_id int primary key not null,
species_name varchar(30)
);

create table pet(
pet_id varchar(9) primary key not null,
pet_name varchar(30),
pet_sex Enum('F','M'),
pet_birth Date,
pet_death Date,
species_id int not null,
owner_id varchar(7) not null,
foreign key (species_id) references species (species_id),
foreign key (owner_id) references owner (owner_id)
);

insert into species values(1,"Terrier");
insert into species values(2,"Hound");
insert into species values(3,"Sporting");
create table appointment(
app_id int primary key not null,
app_date date,
app_time varchar(10),
owner_id varchar(7),
foreign key (owner_id ) references owner(owner_id));
create table doctor_schedule(
schedule_id int primary key,
day_name Enum('MON','TUE','WED','THU','FRI','SAT','SUN'),
start_time varchar(10),
end_time varchar(10),
doctor_id varchar(7) not null,
foreign key (doctor_id) references doctor(doctor_id));



create table drug_type(
drug_id int primary key not null,
drug_name varchar(50),
drug_duration int,
drug_duration_type Enum('year','month','day')
);
create table pet_drug(
id int primary key not null,
drug_date date,
drug_next_date date,
drug_desc varchar(50),
pet_id varchar(9) not null,
drug_id int not null,
doctor_id varchar(7) not null,
foreign key (pet_id) references pet (pet_id),
foreign key (drug_id) references drug_type (drug_id),
foreign key (doctor_id) references doctor (doctor_id)
);
insert into drug_type values(1,'Barmeton',4,'year');
insert into drug_type values(2,'Penecilin',3,'month');
insert into drug_type values(3,'Yewonq',5,'day');
insert into drug_type values(4,'Barmeton',2,'year');

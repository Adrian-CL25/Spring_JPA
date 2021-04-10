drop database `shop_repair`;
create schema shop_repair;
use
    shop_repair;
drop table car;
create table if not exists car
(
    car_id int (225) auto_increment primary key ,
    fab_year int(100),
    marca varchar(100),
    model varchar(100)

);

insert into car
VALUES (1,2020,'Volvo','V40');
insert into car
VALUES (2,2020,'BMW','320');


drop table owner;
create table if not exists owner
(
    owner_id int (225) auto_increment primary key ,
    email varchar(225),UNIQUE (email),
    FOREIGN KEY (owner_id) REFERENCES car(car_id),
    name varchar(225),
    phone_no int (225)
);
insert into owner
VALUES (1,'ade@yahoo.com','Adi',0270778879);


drop table repair;
create table if not exists repair
(
    repair_id int (225) auto_increment primary key,
    task_name varchar(225),
    price int (225)


);

insert into repair
VALUES (1,'injection system',1500);


drop table replacement;
create table if not exists replacement
(
    replacement_id int (225) auto_increment primary key,
    task_name varchar(225),
    price int (225)

);

insert into replacement
VALUES (1,'engine',2500);


drop table request;
create table if not exists request
(
    request_id int (225) auto_increment primary key,
    repairId int(225),
    replacementId int(225),
    FOREIGN KEY (repairId) REFERENCES repair(repair_id) ,
    FOREIGN KEY (replacementId) REFERENCES replacement(replacement_id),
    FOREIGN KEY (request_id) REFERENCES  owner(owner_id)
);
insert into request
VALUES (1,1,1);





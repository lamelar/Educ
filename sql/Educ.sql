drop database if exists educ;
create database educ;
use educ;
create table user(
  id int,
  user_name varchar(255),
  password varchar(255)
);

insert into user values(1,"taro","123");
insert into user values(2,"jiro","123");
insert into user values(3,"hanako","123");
insert into user values(4,"saburo","123");

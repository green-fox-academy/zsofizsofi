create database blog;

use blog;

create table users (
id int primary key auto_increment,
name varchar(30),
age int
);

insert into users (name, age) values ('Margit', 25);
insert into users (name, age) values ('Bertalan',75);
insert into users (name, age) values ('Huba', 35);

select*from users;

create table posts (
id int primary key auto_increment,
title varchar(100),
content text,
author_id int 
);

insert into posts (title, content, author_id)
values('New blogpost', 'Nice new blogpost', 1);

insert into posts (title, content, author_id)
values('New blogpost2', 'Nice new blogpost2', 1);

insert into posts (title, content, author_id)
values('Old blogpost', 'What?', 2);

select*from posts
left join users on posts.author_id=users.id;

select*from users
left join posts on posts.author_id=users.id;

select*from users
inner join posts on posts.author_id=users.id;

select name, title, content from users
left join posts on posts.author_id=users.id;

select name, count(posts.id) from users
inner join posts on posts.author_id=users.id
group by users.name;

select name, count(posts.id) from users
left join posts on posts.author_id=users.id
group by users.name
order by users.name;

select name, count(posts.id) from users
left join posts on posts.author_id=users.id
group by users.name;





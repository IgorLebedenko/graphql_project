create table user (
    id identity primary key,
    first_name varchar not null,
    last_name varchar not null,
    salary int,
    birth_date date not null
);
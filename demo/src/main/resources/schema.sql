-- product Table
drop table product if exists;
create table product(
    seq int not null auto_increment primary key,
    name varchar(30) not null,
    type varchar(30) not null,
    category varchar(30) not null,
    link varchar(300) not null);

-- satisfaction Table
drop table satisfaction if exists;
create table satisfaction(
    seq int not null primary key,
    rating int not null,
    dissatisfaction_content varchar(300),
    write_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP not null);

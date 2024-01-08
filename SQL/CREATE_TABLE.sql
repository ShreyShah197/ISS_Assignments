use ISS;
show tables;
create table employees(
	ID int,
    ManID int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255),
    PRIMARY KEY (ID)
);
USE ISS;
CREATE TABLE HR(
    ID int DEFAULT 0,
    Dept varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    CHECK (Dept = 'HR')
);

insert into HR(Dept,FirstName,Age) values('HR','Shrey',23);
-- insert into HR(Dept,FirstName,Age) values('Sales','Shami',25);  error
select * from HR; 


USE ISS;
CREATE TABLE Clients(
    Clientid int NOT NULL AUTO_INCREMENT,
    ManID int NOT NULL,
    FirstName varchar(255),
    Age int,
    PRIMARY KEY (Clientid)
);

insert into clients(ManID,FirstName,Age) values(101,'Aju',23);
select * from clients;
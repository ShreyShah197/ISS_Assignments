USE ISS;
CREATE TABLE Client(
    ClientID int NOT NULL,
    ManID int NOT NULL,
    OrderNumber int NOT NULL,
    ClientName varchar(255),
    CompanyName varchar(255),
    PRIMARY KEY (ClientID),
    FOREIGN KEY (ClientID) REFERENCES Manager(ManID)
);
use ISS;
CREATE TABLE DEPARTMENT(
    ID int NOT NULL UNIQUE,
    DeptName varchar(255) NOT NULL,
    DeptHead varchar(255) NOT NULL,
    EmployeeCount int
);

SELECT FirstName, ID
FROM Employees
WHERE City IS NOT NULL;
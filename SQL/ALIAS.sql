USE ISS;
SELECT ID AS EmployeeID, FirstName AS EmployeeName
FROM Employees;

SELECT CONCAT(FirstName,' ',LastName) AS FullName
FROM Employees;
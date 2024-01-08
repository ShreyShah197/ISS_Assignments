USE ISS;
SELECT ID, FirstName
FROM Employees
INNER JOIN Manager ON Employees.ManID = Manager.ManID;

SELECT FirstName
FROM Employees
LEFT JOIN Manager ON Employees.City = Manager.City;

SELECT ID, FirstName
FROM Employees
RIGHT JOIN Manager ON Employees.MANID = Manager.MANID;






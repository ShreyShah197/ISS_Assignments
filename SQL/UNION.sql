USE ISS;
SELECT City FROM Employees
UNION
SELECT City FROM Manager
ORDER BY City;
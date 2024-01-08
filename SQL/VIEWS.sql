USE ISS;
CREATE VIEW Mumbai_Employees AS
SELECT ID, FirstName
FROM Employees
WHERE City = 'Mumbai';

SELECT * FROM Mumbai_Employees;

DROP VIEW Mumbai_Employees;
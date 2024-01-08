USE ISS;
CREATE INDEX idx_firstname
ON Employees(FirstName);

CREATE INDEX idx_lasttname
ON Employees(LastName);

ALTER TABLE Employees
DROP INDEX idx_lasttname;
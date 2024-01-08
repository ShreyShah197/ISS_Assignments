USE ISS;
DROP TABLE Client;
TRUNCATE TABLE hr;

ALTER TABLE employees
ADD PhoneNO varchar(255);

ALTER TABLE employees
ADD Email varchar(255);

ALTER TABLE employees
DROP COLUMN Email


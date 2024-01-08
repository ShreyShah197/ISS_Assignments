USE ISS;
SELECT * FROM employees
LIMIT 3 ;

SELECT * FROM Employees
WHERE City LIKE 'p%';

SELECT * FROM Employees
WHERE City LIKE '_a%';

select * from employees where ManID Between 100 and 101;

select * FROM employees
where ManID IN (100, 101, 102);


use ISS;
select * from employees;
select distinct city from employees;
select * from employees where ManID = 101;
select * from employees where ManID = 101 AND City = 'Patna';
select * from employees where ManID = 101 OR ID = 2;
select * from employees order by ManID;
select * from employees order by City;

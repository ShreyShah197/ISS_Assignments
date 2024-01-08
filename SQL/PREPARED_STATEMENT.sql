 PREPARE stmt1 FROM   
'SELECT FirstName, City FROM employees   
WHERE ID = ?';  

SET @id = 2;  

EXECUTE stmt1 USING @id;  
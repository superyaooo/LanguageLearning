-- MySQL, MariaDB, PostgreSQL, SQLite
SELECT prod_name
FROM Products
LIMIT 5;

SELECT prod_name
FROM Products
LIMIT 5 OFFSET 4;  -- return 5 rows staring from row 4


-- Microsoft SQL Server
SELECT TOP 5 prod_name
FROM Products;


-- DB2
SELECT prod_name
FROM Products
FETCH FIRST 5 ROWS ONLY;


-- Oracle
SELECT prod_name
FROM Products
WHERE ROWNUM <= 5;
-- % wildcard, matches multiple characters
SELECT prod_id, prod_name
FROM Products
WHERE prod_name LIKE 'Fish%';

SELECT prod_id, prod_name
FROM Products
WHERE prod_name LIKE '%bean bag%';

SELECT prod_name
FROM Products
WHERE prod_name LIKE 'F%y';


-- underscore _ wildcard, matches a single character (not supported by DB2)
SELECT prod_id, prod_name
FROM Products
WHERE prod_name LIKE '__ inch teddy bear'


-- [] wildcard, a set of characters any 
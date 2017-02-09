SELECT prod_name, prod_price
FROM Products
WHERE prod_price <= 10;


-- Not equal
SELECT vend_id, prod_name
FROM Products
WHERE vend_id <> 'DLL01';

SELECT vend_id, prod_name
FROM Products
WHERE vend_id != 'DLL01';


-- Values in a range
SELECT prod_name, prod_price
FROM Products
WHERE prod_price BETWEEN 5 AND 10;


-- No value
SELECT prod_name
FROM Products
WHERE prod_price IS NULL;
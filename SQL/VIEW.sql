/*
    Views are virtual tables. 
    They contain queries that dynamically retrive data when used.
*/

-- use views to simplify joins
CREATE VIEW ProductCustomers AS
SELECT cust_name, cust_contact, prod_id
FROM Customers, Orders, OrderItems
WHERE Customers.cust_id = Orders.cust_id
	AND OrderItems.order_num = Orders.order_num;

-- retrive data from view
SELECT cust_name, cust_contact
FROM ProductCustomers
WHERE prod_id = 'RGAN01';



-- use views to reformat retrieved data
CREATE VIEW VendorLocations AS
SELECT RTRIM(vend_name) + ' (' + RTRIM(vend_country) + ')'
		AS vend_title
FROM Vendors;

CREATE VIEW VendorLocations AS
SELECT RTRIM(vend_name) || ' (' || RTRIM(vend_country) || ')'
		AS vend_title
FROM Vendors;

-- retrive data from view
SELECT *
FROM VendorLocations;
/*
Output:
	vend_title
	Bear Emporium (USA)
	Bears R Us (USA)
	Fun and Games (England)
*/



-- use views to filter unwanted data
CREATE VIEW CustomerEMailList AS
SELECT cust_id, cust_name, cust_email
FROM Customers
WHERE cust_email IS NOT NULL;

SELECT *
FROM CustomerEMailList;



-- use views with calculated fields
CREATE VIEW OrderItemsExpanded AS
SELECT order_num,
	   prod_id,
	   quantity,
	   item_price,
	   quantity*item_price AS expanded_price
FROM OrderItems;

-- retrive data from view
SELECT *
FROM OrderItemsExpanded
WHERE order_num = 20008;

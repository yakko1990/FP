use w3schools;
-- 1-
 SELECT `customers`.`CustomerID`,
    `customers`.`CustomerName`,
        `customers`.`Country`,
            `customers`.`City`
  FROM `w3schools`.`customers`
  WHERE Country='Spain' or City='Lisboa'
  ORDER BY Country, City;
  
  -- 2 
  INSERT INTO `w3schools`.`categories`
(
`CategoryName`,
`Description`)
VALUES
(
'Higiene',
'Champús, geles de baño, dentífricos...');
  
  -- 3
  -- Obtener el id de la categoría recién insertada
  
  SELECT * FROM w3schools.categories;  
  
  UPDATE `w3schools`.`categories`
SET
`Description` =' VALOR 2'
WHERE `CategoryID` = 9;

-- 4
DELETE FROM `w3schools`.`categories`
WHERE CategoryID = 9;

 -- 5 
 select * 
 FROM Products
 ORDER BY Price DESC
 LIMIT 5;
 
 -- 6
 select MAX(OrderDate)
 FROM Orders;
 
 -- 7
 SELECT count(*)
 FROM Customers;
 
  -- 8
  SELECT count(distinct CustomerID)
  FROM Orders;
  
  -- 9
  SELECT *
  FROM employees
  WHERE Notes LIKE '%psychology%';
  
  -- 10
  SELECT ProductName, CategoryID
  FROM products
  where SupplierID IN (5,6)
  order by CategoryID, ProductName;
  
  -- 11
  -- AS es opcional
    SELECT count(distinct CustomerID) AS 'Nº clientes con pedidos'
  FROM Orders;
  
  -- 12
  select p.ProductID, p.ProductName,
  p.CategoryID, c.CategoryName
  FROM products as p
  INNER JOIN categories as c
  ON p.CategoryID = c.CategoryID;
  
-- 13
use w3schools;

select * 
FROM customers c
LEFT JOIN orders o
ON c.CustomerID = o.CustomerID
WHERE o.CustomerID IS NULL;
-- order by c.CustomerID;
  
  
  
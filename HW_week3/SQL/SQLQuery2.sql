--Select 
--ANSII
Select ContactName Isim,CompanyName Sirket,City Sehir from Customers

Select * from Customers where City = 'London'

--case insensitive
Select * from Products where CategoryID = 1 or CategoryID = 3

Select * from Products where CategoryID = 1 and UnitPrice >= 10

Select * from Products where CategoryID = 1 order by UnitPrice desc --ascending asc --descending

Select count(*) from Products where CategoryID = 2

Select CategoryID ,count(*) from Products group by CategoryID

Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10

Select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID

Select * from Customers C left join Orders o
on C.CustomerID = o.CustomerID
where o.CustomerID is null

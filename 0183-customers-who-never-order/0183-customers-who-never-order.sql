# Write your MySQL query statement below
SELECT NAME Customers from CUSTOMERS where id not in(select customerId from orders); 
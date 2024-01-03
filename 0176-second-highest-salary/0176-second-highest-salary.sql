/* Write your PL/SQL query statement below */
select MAX(Salary) AS SecondHighestSalary from Employee
where Salary < (Select MAX(Salary) from Employee)

/* Write your PL/SQL query statement below */
select name, unique_id from employees e left join EmployeeUNI en on e.id=en.id;
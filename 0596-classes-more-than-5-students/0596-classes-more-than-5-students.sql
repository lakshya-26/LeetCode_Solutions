SELECT class
FROM Courses
GROUP BY CLASS
HAVING COUNT(CLASS) >= 5;
-- Programmers 131528 : 집계함수_COUNT, IS NULL
SELECT COUNT(USER_ID) AS USERS
FROM USER_INFO
WHERE AGE IS NULL

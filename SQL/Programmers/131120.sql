-- Programmers 131120 : SELECT 조회문, Date, String
SELECT MEMBER_ID, MEMBER_NAME, GENDER, TO_CHAR(DATE_OF_BIRTH, 'YYYY-MM-DD') AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE TO_CHAR(DATE_OF_BIRTH, 'MM') = '03'
    AND GENDER LIKE 'W'
    AND TLNO IS NOT NULL
ORDER BY MEMBER_ID ASC

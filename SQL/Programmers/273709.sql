-- Programmers 273709 : 집계함수_SUM
SELECT SUM(PRICE) AS 'TOTAL_PRICE'
FROM ITEM_INFO
WHERE RARITY = 'LEGEND'

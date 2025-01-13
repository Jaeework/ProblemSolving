-- Programmers 293259 : NULL 처리, 집계함수_avg, Number
select round(avg(ifnull(length, 10)), 2) as average_length
from fish_info

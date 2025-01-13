-- Programmers 298516 : String, Date, 집계함수_count
select count(id) as fish_count
from fish_info
where year(time) = '2021'

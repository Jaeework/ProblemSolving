-- Programmers 293260 : GROUP BY, Date
select count(id) as fish_count, month(time) as month
from fish_info
group by 2
order by 2 asc

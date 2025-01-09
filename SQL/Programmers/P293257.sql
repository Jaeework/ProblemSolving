-- Programmers 293257 : GROUP BY, JOIN
select count(*) as fish_count, n.fish_name
from fish_info f
inner join fish_name_info n
on f.fish_type = n.fish_type
group by n.fish_name
order by fish_count desc

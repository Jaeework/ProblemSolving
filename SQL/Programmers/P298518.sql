-- Programmers 298518 : SELECT, JOIN
select count(*) as FISH_COUNT
from fish_info a
inner join fish_name_info b on a.fish_type = b.fish_type
where b.fish_name in ('BASS', 'SNAPPER')

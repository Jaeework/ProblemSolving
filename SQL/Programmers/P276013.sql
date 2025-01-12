-- Programmers 276013 : SELECT 
select id, email, first_name, last_name
from developer_infos
where skill_1 like 'Python' 
    or skill_2 like 'Python' 
    or skill_3 like 'Python'
order by id asc

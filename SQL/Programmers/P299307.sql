-- Programmers 299307 : SELECT, 다중 조건
select id
    , case when size_of_colony <= 100 then 'LOW'
        when size_of_colony > 1000 then 'HIGH' 
        else 'MEDIUM' end as size
from ecoli_data
order by id asc

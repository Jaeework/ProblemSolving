-- Programmers 284530 : String, Date
select year(ym) as year, round(avg(pm_val1), 2) as pm10, round(avg(pm_val2), 2) as 'pm2.5'
from air_pollution
where location2 like '수원'
group by year(ym)
order by year asc

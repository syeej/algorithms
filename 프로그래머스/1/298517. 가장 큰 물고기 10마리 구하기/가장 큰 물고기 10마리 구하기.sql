-- 코드를 작성해주세요
select id, length
from fish_info
where length>10
order by length desc, id 
limit 10;
select p.id as 'ID', count(c.id) as 'CHILD_COUNT'
from ecoli_data p
left join ecoli_data c on p.id = c.parent_id
group by id 
order by id;
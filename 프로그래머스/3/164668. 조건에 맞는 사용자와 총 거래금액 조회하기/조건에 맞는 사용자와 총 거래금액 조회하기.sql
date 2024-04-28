select u.user_id, u.nickname, sum(b.price) as total_sales
from USED_GOODS_BOARD b
join USED_GOODS_USER u on b.writer_id = u.user_id
where b.status = 'DONE'
group by u.user_id
having total_sales >= 700000
order by total_sales
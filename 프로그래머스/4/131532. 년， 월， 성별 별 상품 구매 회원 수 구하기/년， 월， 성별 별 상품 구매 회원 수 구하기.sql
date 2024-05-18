-- 년, 월, 성별 별로 상품을 구매한 회원 수 집계
-- 년, 월, 성별 기준 오름차순 정렬
-- 성별 정보가 없는 경우 결과에서 제외
select year(o.sales_date) as 'YEAR',
    month(o.sales_date) as 'MONTH',
    u.gender as "GENDER",
    count(distinct o.user_id) as "USERS"
from online_sale o
join user_info u on o.user_id = u.user_id
where u.gender is not null
group by year(o.sales_date), month(o.sales_date), u.gender
order by YEAR, MONTH, GENDER;
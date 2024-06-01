-- 동일한 회원이 동일한 상품을 재구매한 데이터
-- 재구매한 회원ID, 재구매한 상품 ID 출력
-- 정렬 : 회원ID 오름차순, 상품ID 내림차순

SELECT USER_ID, PRODUCT_ID
FROM ONLINE_SALE
GROUP BY USER_ID, PRODUCT_ID
HAVING COUNT(*)>=2
ORDER BY USER_ID, PRODUCT_ID DESC

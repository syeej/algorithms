-- 서울에 위치한 식당의 id,식당이름,음식종류,즐겨찾기수,주소, 리뷰평균점수
-- 리뷰 평균 점수 : 소수점 세번째 자리에서 반올림
-- 정렬 : 1. 리뷰 평균 점수 기준 내림차순  2. 즐겨찾기수 내림차순
SELECT I.REST_ID, REST_NAME, FOOD_TYPE, FAVORITES, ADDRESS,
        ROUND(AVG(REVIEW_SCORE), 2) AS "SCORE"
FROM REST_INFO I
JOIN REST_REVIEW R ON I.REST_ID = R.REST_ID
WHERE I.ADDRESS LIKE "서울%"
GROUP BY I.REST_ID
ORDER BY SCORE DESC, FAVORITES DESC
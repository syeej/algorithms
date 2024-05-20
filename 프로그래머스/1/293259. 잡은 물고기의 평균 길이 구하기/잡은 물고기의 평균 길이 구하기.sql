-- 잡은 물고기의 평균 길이(AVERAGE_LENGTH)
-- 평균 길이는 소수점 3째자리에서 반올림
-- 10CM 이하 물고기들은 10CM로 취급하여 평균
SELECT ROUND(AVG(IFNULL(LENGTH, 10)), 2) AS "AVERAGE_LENGTH"
FROM FISH_INFO

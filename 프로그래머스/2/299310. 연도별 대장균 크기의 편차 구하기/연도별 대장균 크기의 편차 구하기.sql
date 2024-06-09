-- 분화된 연도, 분화된연도별 대장균 크기의 편차, 개체 ID 조회
-- 연도 오름차순, 대장균 크기의 편차 오름차순 정렬
/*
SELECT YEAR(DIFFERENTIATION_DATE) AS YEAR, 
        (SELECT MAX(SIZE_OF_COLONY) 
         FROM ECOLI_DATA
         WHERE YEAR(DIFFERENTIATION_DATE) = YEAR) - SIZE_OF_COLONY as YEAR_DEV,
         ID
FROM ECOLI_DATA
ORDER BY YEAR, YEAR_DEV
*/
WITH MAXS AS 
(SELECT MAX(SIZE_OF_COLONY) AS MAXSIZE, YEAR(DIFFERENTIATION_DATE) AS YEAR
FROM ECOLI_DATA
GROUP BY YEAR )
/*
SELECT M.YEAR, (M.MAXSIZE - E.SIZE_OF_COLONY) AS YEAR_DEV, E.ID
FROM MAXS M 
INNER JOIN ECOLI_DATA E ON YEAR(E.DIFFERENTIATION_DATE) = M.YEAR
WHERE YEAR(E.DIFFERENTIATION_DATE) = M.YEAR
ORDER BY M.YEAR, YEAR_DEV
*/

SELECT M.YEAR, (MAXSIZE - E.SIZE_OF_COLONY) AS YEAR_DEV, ID
FROM ECOLI_DATA E
INNER JOIN MAXS M ON YEAR(E.DIFFERENTIATION_DATE) = M.YEAR
ORDER BY M.YEAR, YEAR_DEV
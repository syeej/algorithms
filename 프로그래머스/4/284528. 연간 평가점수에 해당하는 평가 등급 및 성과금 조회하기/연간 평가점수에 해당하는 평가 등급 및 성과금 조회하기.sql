WITH cte_t AS (
    SELECT
        e.EMP_NO,
        AVG(g.score) AS avg_score,
        CASE 
            WHEN  AVG(g.score) >= 96 THEN 'S'
            WHEN  AVG(g.score) >= 90 THEN 'A'
            WHEN  AVG(g.score) >= 80 THEN 'B'
            ELSE 'C' END AS 'GRADE',
        CASE 
            WHEN  AVG(g.score) >= 96 THEN 0.2
            WHEN  AVG(g.score) >= 90 THEN 0.15
            WHEN  AVG(g.score) >= 80 THEN 0.1
            ELSE 0 END AS 'bonus_per',
        AVG(e.sal) AS avg_sal
    FROM
        hr_grade as g
    LEFT JOIN
        hr_employees as e using(emp_no)
    group by 
        EMP_NO  
)
SELECT
    e.EMP_NO,
    e.EMP_NAME,
    c.GRADE,
    (c.avg_sal * c.bonus_per) as 'BONUS'
FROM 
    HR_EMPLOYEES AS e LEFT JOIN
    cte_t AS c USING(emp_no)
ORDER BY e.emp_no;
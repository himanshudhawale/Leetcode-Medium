# Write your MySQL query statement below
SELECT
    S1.Score,
    (SELECT COUNT(DISTINCT Score) FROM Scores AS S2 WHERE S2.Score >= S1.Score) AS Rank
FROM Scores AS S1
ORDER BY Score DESC
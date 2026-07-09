-- Last updated: 09/07/2026, 10:13:04
SELECT
    email AS Email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;
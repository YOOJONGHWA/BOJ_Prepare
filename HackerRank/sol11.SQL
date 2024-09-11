SELECT CONCAT(Name, '(', UPPER(LEFT(Occupation, 1)), ')')
  FROM OCCUPATIONS
 ORDER BY Name;

SELECT CONCAT('There are a total of ', COUNT(occupation), ' ', LOWER(occupation), 's.')
  FROM OCCUPATIONS
 GROUP BY occupation
 ORDER BY COUNT(occupation), occupation;

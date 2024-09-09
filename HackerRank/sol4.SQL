SELECT DISTINCT city
  FROM station
 WHERE LEFT(city,1) in ('a', 'e', 'i', 'o', 'u')
   AND RIGHT(city,1) in ('a', 'e', 'i', 'o', 'u');
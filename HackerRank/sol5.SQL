select distinct city
  from station
 where left(city, 1) NOT IN ('a','e','i','o','u');
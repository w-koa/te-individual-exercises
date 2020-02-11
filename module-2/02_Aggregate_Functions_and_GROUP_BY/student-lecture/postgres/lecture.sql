-- ORDERING RESULTS

-- Populations of all countries in descending order
SELECT name, population FROM country
        ORDER BY population DESC;
--Names of countries and continents in ascending order
SELECT name, continent FROM country ORDER BY name;
-- LIMITING RESULTS
-- The name and average life expectancy of the countries with the 10 highest life expectancies.
SELECT name, lifeexpectancy FROM country WHERE lifeexpectancy IS NOT NULL
 ORDER BY lifeexpectancy DESC LIMIT 10;
-- CONCATENATING OUTPUTS

-- The name & state of all cities in California, Oregon, or Washington.
-- "city, state", sorted by state then city

SELECT (name || ', ' || district) AS name_and_state
 FROM city
 WHERE district = 'California'
 OR district = 'Oregon'
 OR district = 'Washington'
 ORDER BY district, city;

-- AGGREGATE FUNCTIONS
-- Average Life Expectancy in the World
SELECT AVG(lifeexpectancy) FROM country;
-- Total population in Ohio
SELECT SUM(population) AS "total population of Ohio" FROM city WHERE district = 'Ohio';
-- The surface area of the smallest country in the world
SELECT MIN(surfacearea) FROM country;
-- The 10 largest countries in the world
SELECT * FROM country ORDER BY surfacearea DESC limit 10;
-- The number of countries who declared independence in 1991
SELECT COUNT(*) FROM country WHERE indepyear = 1991;
-- GROUP BY
-- Count the number of countries where each language is spoken, ordered from most countries to least
SELECT language, COUNT(countrycode) AS countries FROM countrylanguage GROUP BY language
ORDER BY countries DESC; 
-- Average life expectancy of each continent ordered from highest to lowest
SELECT continent, AVG(lifeexpectancy) AS life_expectancy FROM country GROUP BY continent ORDER BY life_expectancy DESC;
-- Exclude Antarctica from consideration for average life expectancy
SELECT continent, AVG(lifeexpectancy) AS life_expectancy FROM country
where lifeexpectancy IS NOT NULL
 GROUP BY continent ORDER BY life_expectancy DESC;
-- Sum of the population of cities in each state in the USA ordered by state name
SELECT district, SUM(population) FROM city WHERE countrycode = 'USA' GROUP BY district ORDER BY district;
-- The average population of cities in each state in the USA ordered by state name
SELECT name, cast(AVG(population) AS numeric(10,2)) FROM city WHERE countrycode = 'USA' GROUP BY name ORDER BY name;
-- SUBQUERIES
-- Find the names of cities under a given government leader
SELECT code FROM country WHERE headofstate = 'Elisabeth II';

SELECT COUNT(*) FROM country WHERE headofstate = 'Elisabeth II';

SELECT name, district FROM city WHERE countrycode IN
(SELECT code FROM country WHERE headofstate = 'Elisabeth II');

-- Find the names of cities whose country they belong to has not declared independence yet
SELECT name FROM country WHERE indepyear IS NULL;

SELECT name, district, countrycode FROM city WHERE countrycode IN
(SELECT code FROM country WHERE indepyear IS NULL);

-- Additional samples
-- You may alias column and table names to be more descriptive

-- Alias can also be used to create shorthand references, such as "c" for city and "co" for country.
SELECT ci.name, co.name FROM city as ci, country as co
WHERE co.code = 'USA';
-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)

-- Limiting results allows rows to be returned in 'limited' clusters,where LIMIT says how many, and OFFSET (optional) specifies the number of rows to skip
SELECT name, population
FROM city
ORDER BY population DESC
LIMIT 10 OFFSET 10;


-- Most database platforms provide string functions that can be useful for working with string data. In addition to string functions, string concatenation is also usually supported, which allows us to build complete sentences if necessary.

-- Aggregate functions provide the ability to COUNT, SUM, and AVG, as well as determine MIN and MAX. Only returns a single row of value(s) unless used with GROUP BY.

-- Counts the number of rows in the city table
SELECT count(*) as city_count FROM city;
-- Also counts the number of rows in the city table
SELECT count(name) as city_count FROM city;
-- Gets the SUM of the population field in the city table, as well as
-- the AVG population, and a COUNT of the total number of rows.
SELECT SUM(population) as total_city_population,
cast(AVG(population) as numeric(10,2)) as avg_city_population,
COUNT(*) as number_of_cities
FROM city;
-- Gets the MIN population and the MAX population from the city table.
SELECT MIN(population) as minimum_population,
MAX(population) as maximum_population
FROM city;
-- Using a GROUP BY with aggregate functions allows us to summarize information for a specific column. 
-- For instance, we are able to determine the MIN and MAX population for each countrycode in the city table.
SELECT countrycode, MIN(population) as smallest_population,
MAX(population) as largest_population
FROM city
GROUP BY countrycode
ORDER BY countrycode;


-- INSERT

-- 1. Add Klingon as a spoken language in the USA
SELECT * FROM countrylanguage WHERE countrycode = 'USA';

INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
   VALUES ('USA', 'Klingon', false, 0.01);
   
   SELECT * FROM countrylanguage WHERE countrycode = 'USA';
-- 2. Add Klingon as a spoken language in Great Britain
SELECT * FROM countrylanguage WHERE countrycode = 'GBR';

INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
  VALUES('GBR', 'Klingon', false, 0.003);


-- UPDATE

-- 1. Update the capital of the USA to Houston
SELECT * FROM country;
SELECT * FROM city WHERE name = 'Houston';

UPDATE country
  SET capital = 3796
  WHERE code = 'USA';
  
SELECT * FROM country where code = 'USA';

SELECT city.name as capital, country.code
  FROM country
  JOIN city ON city.countrycode = country.code
  WHERE country.capital = '3796' AND
  city.id = 3796;  

-- 2. Update the capital of the USA to Washington DC and the head of state
SELECT * FROM city WHERE name = 'Washington';

UPDATE country
  SET capital = city.id,
  headofstate = 'Norm for President'
  FROM city
  WHERE city.name = 'Washington' AND city.countrycode = 'USA';
  
Select * FROM country where code = 'USA';

-- DELETE

-- 1. Delete English as a spoken language in the USA
SELECT * FROM countrylanguage WHERE countrycode = 'USA';

DELETE FROM countrylanguage
  WHERE language = 'English' AND countrycode = 'USA';


-- 2. Delete all occurrences of the Klingon language 
SELECT * FROM countrylanguage WHERE language = 'Klingon';

DELETE FROM countrylanguage
  WHERE language = 'Klingon';


-- REFERENTIAL INTEGRITY

-- 1. Try just adding Elvish to the country language table.
INSERT INTO countrylanguage (countrycode, language) values ('USA', 'Elvish');

-- 2. Try inserting English as a spoken language in the country ZZZ. What happens?
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
  VALUES('ZZZ', 'English', true, 50);
  

-- 3. Try deleting the country USA. What happens?
DELETE FROM country WHERE code = 'USA';

-- CONSTRAINTS

-- 1. Try inserting English as a spoken language in the USA
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
 VALUES('USA', 'English', true, 86.2);

-- 2. Try again. What happens?
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
 VALUES('USA', 'English', true, 86.2);

-- 3. Let's relocate the USA to the continent - 'Outer Space'
UPDATE country
SET continent = 'Outer Space'
WHERE code = 'USA';


-- How to view all of the constraints

SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS;
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE;
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS;


-- TRANSACTIONS

-- 1. Try deleting all of the rows from the country language table and roll it back.
BEGIN TRANSACTION;
DELETE FROM countrylanguage;
COMMIT; -- is what makes the transaction happen
ROLLBACK; -- is the undo

DELETE FROM countrylanguage;
ROLLBACK;

-- 2. Try updating all of the cities to be in the USA and roll it back

-- 3. Demonstrate two different SQL connections trying to access the same table where one happens to be inside of a transaction but hasn't committed yet.
-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
SELECT * FROM actor;
INSERT INTO actor (first_name, last_name) VALUES ('Hampton', 'Avenue');
INSERT INTO actor (first_name, last_name) VALUES ('Lisa', 'Byway');


-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
SELECT * FROM film
WHERE title = 'Euclidean PI';

INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);


-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO film_actor (actor_id, film_id)
VALUES (202, 1001);
INSERT INTO film_actor (actor_id, film_id)
VALUES (201, 1001);

-- 4. Add Mathmagical to the category table.
INSERT INTO category (name)
VALUES ('Mathemagical');


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
SELECT title FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category on category.category_id = film_category.category_id
WHERE name = 'Mathemagical';

INSERT INTO film_category (film_id, category_id)
VALUES (1001, 17);

SELECT category_id FROM film_category
WHERE film_id = 274;

UPDATE film_category SET category_id = 17 WHERE film_id = 1001;
UPDATE film_category SET category_id = 17 WHERE film_id = 274;
UPDATE film_category SET category_id = 17 WHERE film_id = 494;
UPDATE film_category SET category_id = 17 WHERE film_id = 714;
UPDATE film_category SET category_id = 17 WHERE film_id = 996;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

SELECT COUNT(rating) FROM film
JOIN film_category ON film_category.film_id = film.film_id
WHERE category_id = 17;

UPDATE film
SET rating = 'G'
WHERE film.film_id IN (SELECT film_category.film_id FROM film_category WHERE category_id = 17);
ROLLBACK;


-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory (film_id, store_id) VALUES (1001, 1);
INSERT INTO inventory (film_id, store_id) VALUES (1001, 2);

select film_id, store_id FROM inventory WHERE film_id = 1001;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE> 
--Failure because has related keys in film actor
DELETE FROM film
WHERE title = 'Euclidean PI';

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
-- Failure because foreign key in film_category
DELETE FROM category
WHERE name = 'Mathemagical';

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
-- Success because all keys were deleted
DELETE FROM film_category
WHERE category_id = 17;


-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM category
WHERE name = 'Mathemagical';
-- Success, no more foreign key constraints

DELETE FROM film
WHERE title = 'Euclidean PI';
-- Failure, foreign key exist in film_actor


-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
DELETE FROM film_actor
WHERE film_id = 1001;

DELETE FROM inventory
WHERE film_id = 1001;

DELETE FROM film
WHERE title = 'Euclidean PI';


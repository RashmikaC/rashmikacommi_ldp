-- 1. Find out the PG-13 rated comedy movies. DO NOT use the film_list table.
SELECT title 
FROM film,category,film_category
WHERE film.film_id=film_category.film_id 
AND film_category.category_id=category.category_id
AND rating='PG-13' AND category.name='Comedy';

-- 2. Find out the top 3 rented horror movies.
SELECT f.title, COUNT(*) AS rental_count
FROM film f
JOIN inventory i ON f.film_id = i.film_id
JOIN rental r ON i.inventory_id = r.inventory_id
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id
WHERE c.name = 'Horror' 
GROUP BY f.title
ORDER BY rental_count DESC
LIMIT 3;

-- 3. Find out the list of customers from India who have rented sports movies.
SELECT DISTINCT c.customer_id, c.first_name, c.last_name
FROM customer c
INNER JOIN address a ON c.address_id = a.address_id
INNER JOIN city ci ON a.city_id = ci.city_id
INNER JOIN country coun ON ci.country_id = coun.country_id
INNER JOIN rental r ON c.customer_id = r.customer_id
INNER JOIN inventory i ON r.inventory_id = i.inventory_id
INNER JOIN film f ON i.film_id = f.film_id
INNER JOIN film_category fc ON f.film_id = fc.film_id
INNER JOIN category cat ON fc.category_id = cat.category_id
WHERE coun.country = 'India' AND cat.name = 'Sports'
ORDER BY c.customer_id;

-- 4. Find out the list of customers from Canada who have rented “NICK WAHLBERG” movies.
SELECT DISTINCT c.customer_id, c.first_name, c.last_name
FROM customer c
INNER JOIN address a ON c.address_id = a.address_id
INNER JOIN city ci ON a.city_id = ci.city_id
INNER JOIN country coun ON ci.country_id = coun.country_id
INNER JOIN rental r ON c.customer_id = r.customer_id
INNER JOIN inventory i ON r.inventory_id = i.inventory_id
INNER JOIN film f ON i.film_id = f.film_id
INNER JOIN film_actor fa ON f.film_id = fa.film_id
INNER JOIN actor act ON act.actor_id = fa.actor_id
WHERE coun.country='Canada' AND act.first_name='NICK' AND act.last_name='WAHLBERG'
ORDER BY c.customer_id;

-- 5. Find out the number of movies in which “SEAN WILLIAMS” acted.
SELECT COUNT(*) 
FROM film_actor fa 
JOIN actor a ON a.actor_id = fa.actor_id 
WHERE a.first_name = 'SEAN' AND a.last_name = 'WILLIAMS';

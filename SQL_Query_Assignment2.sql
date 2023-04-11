-- 1. Find out the number of documentaries with deleted scenes.
SELECT COUNT(*) AS num_documentaries_with_deleted_scenes
FROM film f
INNER JOIN film_category fc ON f.film_id = fc.film_id
INNER JOIN category c ON fc.category_id = c.category_id
WHERE c.name = 'Documentary' AND FIND_IN_SET('Deleted Scenes', f.special_features) > 0;

-- 2. Find out the number of sci-fi movies rented by the store managed by Jon Stephens.
SELECT COUNT(*) AS num_sci_fi_rentals
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id
JOIN store s ON i.store_id = s.store_id
JOIN staff st ON s.manager_staff_id = st.staff_id
WHERE c.name = 'Sci-Fi' AND st.first_name = 'Jon' AND st.last_name = 'Stephens';

-- 3. Find out the total sales from Animation movies.
SELECT total_sales
FROM sales_by_film_category
WHERE category = 'Animation';

-- 4. Find out the top 3 rented category of movies by “PATRICIA JOHNSON”.
SELECT cat.name, count(*)
FROM inventory i
INNER JOIN rental r ON r.inventory_id = i.inventory_id
INNER JOIN customer c ON c.customer_id = r.customer_id
INNER JOIN film_category fc ON i.film_id = fc.film_id
INNER JOIN category cat ON fc.category_id = cat.category_id
WHERE c.first_name='PATRICIA' AND c.last_name='JOHNSON'
GROUP BY cat.name 
ORDER BY count(*) DESC
LIMIT 3;

-- 5. Find out the number of R rated movies rented by “SUSAN WILSON”.
SELECT count(*) AS num_rented_r_movies
FROM film f
INNER JOIN inventory i ON f.film_id = i.film_id
INNER JOIN rental r ON r.inventory_id = i.inventory_id
INNER JOIN customer c ON c.customer_id = r.customer_id
WHERE c.first_name='SUSAN' AND c.last_name='WILSON'
AND f.rating='R';



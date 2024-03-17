-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-01-2023 a las 13:47:20
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.1.12




USE bookdb;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


	--
	-- Volcado de datos para la tabla `authors`
	--

	INSERT IGNORE INTO  `authors` (`author_id`, `first_name`, `middle_name`, `last_name`, `birth_date`) VALUES
	(1, 'John', NULL, 'Wiley', NULL),
	(2, 'Ray  ', NULL, 'Harris', '1972-09-01'),
	(3, 'Joel', NULL, 'Murach', '1968-02-02'),
	(4, 'Robin', NULL, 'Nixon', '1961-01-01');




--
-- Volcado de datos para la tabla `books`
--

INSERT IGNORE INTO  `books` (`book_id`, `title`, `isbn`, `published_date`, `publisher_id`) VALUES
	(1, 'PHP Programming', NULL, '2023-01-01', 1),
	(2, 'HTML & CSS', ' ‎ 978-1118008188', '2011-11-08', 2),
	(3, 'murach\'s PHP and MySQL', '978-1943873005', '2022-08-31', 3);


--
-- RELACIONES PARA LA TABLA `book_authors`:
--   `author_id`
--       `authors` -> `author_id`
--   `book_id`
--       `books` -> `book_id`
--

--
-- Volcado de datos para la tabla `book_authors`
--
INSERT IGNORE INTO  `book_authors` (`book_id`, `author_id`) VALUES
	(2, 1),
	(3, 2),
	(3, 3);


--
-- RELACIONES PARA LA TABLA `publishers`:
--

--
-- Volcado de datos para la tabla `publishers`
--

INSERT IGNORE INTO  `publishers` (`publisher_id`, `name`) VALUES
	(1, 'Bruma'),
	(2, 'John Wiley & Sons'),
	(3, 'Mike Murach & Associates'),
	(4, 'O\'Reilly Media');


COMMIT;
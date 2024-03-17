<?
require_once('header.php');

$myclass = new MiClase();
$y_class->foo();
echo "<p> cte pública " . MiClase::MY_PUBLIC . "</p>";
//echo "<p> cte private " . MiClase::MY_PRIVATE . "</p>";


$puntoA = new Point(0, 0);
$puntoB = new Point(100 );

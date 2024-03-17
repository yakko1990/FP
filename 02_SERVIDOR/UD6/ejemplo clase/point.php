
<?php
class Point{

    private int $x;
    private int $y;

    public function __construct(int $x, int $y = 0) {

        $this->x = $x;
        $this->y = $y;
        self::$num_puntos++;
    }

    public function mostrarCoordenades(){
        echo "<p> X: " . $this->x . ", Y: " . $this->y . " . Número de objetos creados".self::$num_puntos ." </p>";
    }


}
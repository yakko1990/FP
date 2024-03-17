<?php
class Circulo extends Figura{
    public const PI = 3.1416;
    private float $radio;

    private Point $centro;


    
    public function __construct(string $nombre, float $radio,
    Point $centro) {

       parent::__construct($nombre);
       $this->centro = $centro;
       $this->radio = $radio;

   }

    public function calcularArea(){
        parent::calcularArea(); 
        //return $this->radio * $this->radio * self::PI;
        return pow($this->radio, 2) * self::PI;
    }




    /**
     * Get the value of centro
     *
     * @return Point
     */
    public function getCentro(): Point
    {
        return $this->centro;
    }

    /**
     * Set the value of centro
     *
     * @param Point $centro
     *
     * @return self
     */
    public function setCentro(Point $centro): self
    {
        $this->centro = $centro;

        return $this;
    }
}
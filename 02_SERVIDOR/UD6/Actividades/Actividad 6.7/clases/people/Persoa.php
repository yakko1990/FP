<?php
namespace clases\people;
/**
 * Description of Persoa
 *
 * @author maria
 */
abstract class Persoa {
   protected $nome;
   protected $apelidos;
   protected $mobil;
   protected $fecha_nacimiento;
   
   
   public function __construct(string $nome, string $apelidos, string $mobil) {
       $this->nome = $nome;
       $this->apelidos = $apelidos;
       $this->mobil = $mobil;
   }

   
   public function getNome(): string{
       return $this->nome;
   }

   public function getApelidos():string {
       return $this->apelidos;
   }

   public function getMobil():string {
       return $this->mobil;
   }

   public function setNome(string $nome): void {
       $this->nome = $nome;
   }

   public function setApelidos(string $apelidos): void {
       $this->apelidos = $apelidos;
   }

   public function setMobil(string $mobil): void {
       $this->mobil = $mobil;
   }

   

    abstract public function verInformacion();    

    /**
     * Get the value of fecha_nacimiento
     */
    public function getFechaNacimiento()
    {
        return $this->fecha_nacimiento;
    }

    /**
     * Set the value of fecha_nacimiento
     */
    public function setFechaNacimiento($fecha_nacimiento): self
    {
        $this->fecha_nacimiento = $fecha_nacimiento;

        return $this;
    }
}

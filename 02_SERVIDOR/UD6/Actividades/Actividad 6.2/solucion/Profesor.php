<?php



/**
 * Description of Profesor
 *
 * @author maria
 */


final class Profesor extends Persoa
{

    const IMPORTE_HORA_POR_DEFECTO = 16;

    private $NIF;
    private $bailes = [];

    public function __construct(
        string $nome,
        string $apelidos,
        string $mobil,
        string $NIF
    ) {
        parent::__construct($nome, $apelidos, $mobil);
        $this->NIF = $NIF;
    }

    public function calcularSoldo(
        float $horas,
        float $importe_hora = self::IMPORTE_HORA_POR_DEFECTO
    ): float {
        return $horas * $importe_hora;
    }

    public function engadir(Baile $baile): bool
    {
        $engadido = false;
        if (!in_array($baile, $this->bailes)) {
            $this->bailes[] = $baile;
            //Outra posibilidade: 
            //   if(array_search($baile, $this->bailes===false){
            //array_push($this->bailes, $baile);     
            // }

            $engadido = true;
        }
        return $engadido;
    }

    //Se se considera o mesmo baile só polo nome:
    public function engadirSoDiferenteNome(Baile $baile): bool
    {      
        foreach ($this->bailes as $b) {
            if ($b->getNome() == $baile->getNome()) {
                return false;
            }
        }
        array_push($this->bailes, $baile);
    

        //
        // $array_nomes_bailes = array_map("getNomesBailes", $this->bailes);
        // if (!in_array($baile->getNome(), $array_nomes_bailes)) {
        //     $this->bailes[] = $baile;
        //     $engadido = true;
        // }
        return true;
    }

    public function eliminarSoConIgualNome(Baile $baile):bool{
        foreach ($this->bailes as $k=> $b) {
            if ($b->getNome() == $baile->getNome()) {
                unset($this->bailes[$k]);
                return true;
            }
        }
        return false;
    }

    public function eliminar(Baile $baile): bool
    {
        $eliminado = false;
        //false o index
        $encontrado = array_search($baile, $this->bailes);
        if ($encontrado !== false) {
            unset($this->bailes[$encontrado]);
            //Para non quedar co índice numérico $encontrado baleiro:
            //$this->bailes = array_values($this->bailes);
            $eliminado = true;
        }


        return $eliminado;
    }

    public function mostrarBailes()
    {
        foreach ($this->bailes as $b) {
            //$nome_baile = $b->getNome();

            echo $b->getNome() . " (idade min: " . $b->getIdadeMinima() . " anos)<br/>";
        }
    }
}

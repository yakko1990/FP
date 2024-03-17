<?php

class UsuarioRepository extends BaseRepository implements IUsuarioRepository{


    public function __construct(){
        parent::__construct();
        $this->table_name = "usuario";
        $this->pk_name = "id";
        $this->class_name = "Usuario";        
        $this->default_order_column = "email";

    }
    
    public function update($object): bool{
        return true;
 
     }
     public function create($object){        
             return null;
     }
 
    public function findUsuarioByEmail($email): ?Usuario    {
        $consulta = "SELECT * FROM $this->table_name
            WHERE email = :email";
        $pdostmt = $this->conn->prepare($consulta);
        $pdostmt->bindValue("email", $email);
        $pdostmt->execute();
        $arrayUsuarios = $pdostmt->fetchAll(PDO::FETCH_CLASS, $this->class_name);     


        if (!$arrayUsuarios ) {
            return null;
             
        } else{
            return $arrayUsuarios[0];
        } 
    }

   
}



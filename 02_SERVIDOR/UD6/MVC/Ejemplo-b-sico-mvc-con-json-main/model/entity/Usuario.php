<?php
class Usuario implements JsonSerializable{

    use ViewData;
    private ? int $id = null;
    private string $email ="";

    public function __construct(int $id, string $email)
    {
        $this->id = $id;
        $this->email = $email;
    }    

    
    public function getId()
    {
        return $this->id;
    }

    

    public function setId($id)
    {
        $this->id = $id;

        return $this;
    }

    public function getEmail()
    {
        return $this->email;
    }

        public function setEmail($email)
    {
        $this->email = $email;

        return $this;
    }

    public function jsonSerialize(): mixed {
        //Especificamos qué propiedades no públicas queremos que pasen a formar parte del objeto JSON
      return array(
          'id' => $this->id,
          'email' => $this->email,
         
      );
  }
}
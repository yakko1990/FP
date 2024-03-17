<?php

Interface IUsuarioRepository extends IBaseRepository{
   public function findUsuarioByEmail($email): ?Usuario; 
}
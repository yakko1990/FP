<?php
/**
 *
 * @author mfernandez
 */
interface IUsuarioRepository {

    public function getUsuarios(): array; 

    function getUsuarioById(int $id):Usuario;

    public function updateUsuario(Usuario $usuarioToUpdate): bool;

    public function deleteUsuario(int $id): bool;
    
    public function create(Usuario $usuario):Usuario;
}

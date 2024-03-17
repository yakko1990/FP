<?php

class UsuarioServicio
{

    const USER_DOES_NOT_EXIST = "No existe usuario";
    const PWD_INCORRECT = "La contraseña no es correcta";

    private IUsuarioRepository $userRepository;
    private IRolRepository $rolRepository;


public function __construct(){
    $this->userRepository = new UsuarioRepository();
    $this->rolRepository = new RolRepository();   
}

    public function getUsuarios(): array
    {
        $usuarios = $this->userRepository->findAll();
        foreach ($usuarios as $usuario) {
            $idUsuario = $usuario->getId();
            $roles = $this->rolRepository->findRolesByUserId($idUsuario);
            $usuario->setRoles($roles);            
        }
        return $usuarios;
    }

    public function login(string $user, string $pwd, $rolId): ?Usuario{
       $usuario = $this->userRepository->findUsuarioByEmail($user);
        $passCorrecta = password_verify($pwd, $usuario->getPwdhash());
        if($passCorrecta){
            $roles = $this->rolRepository->findRolesByUserId($usuario->getId());
            $usuario->setRoles($roles);
            $rolValido = $this->isUserInRole($usuario, $rolId);
            if($rolValido){
                return $usuario;
            }else{
                return null;
            }
        }
        return null;
       }

    public function getRoles(): array
    {

        $roles = $this->rolRepository->findAll();

        return $roles;
    }

    public function getRoleById(int $roleId): ?Rol
    {
        return $this->rolRepository->read($roleId);
    }

    private function isUserInRole(Usuario $usuario, int $roleId): bool
    {
        $rolesArray = $usuario->getRoles();
        foreach ($rolesArray as $rol) {
            if ($rol->getId() === $roleId) {
                return true;
            }
        }

        return false;
    }

}

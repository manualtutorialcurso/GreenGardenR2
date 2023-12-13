package com.reto2.greengardenapp.dao;

import com.reto2.greengardenapp.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioObject {
    private final List<Usuario> usuarios = new ArrayList<>();

    public UsuarioObject(){

    }
    public int buscar(String usuario){
        int n=-1;
        for (int  i = 0; i < usuarios.size(); i++ ){
            if (usuarios.get(i).getUsuario().equals(usuario)){
                n=i;
                break;
            }
        }
        return n;
    }
    public boolean insertar(Usuario usuario){
        if (buscar(usuario.getUsuario()) ==-1){
            usuarios.add(usuario);
            return true;
        }else{
            return false;
        }
    }
    public boolean modificar(Usuario usuario){
        if (buscar(usuario.getUsuario()) !=-1){
            Usuario usuarioaux = obtener(usuario.getUsuario());

            usuarioaux.setContrasenia(usuario.getContrasenia());
            usuarioaux.setNombres(usuario.getNombres());
            usuarioaux.setApellidos(usuario.getApellidos());
            usuarioaux.setCorreo(usuario.getCorreo());

            return  true;
        }else{
            return false;
        }
    }
    public boolean eliminar(String usuario){
        if (buscar(usuario) !=-1){
            usuarios.remove(buscar(usuario));
            return  true;
        }else{
            return false;
        }
    }
    public Usuario obtener(String usuario){
        if(buscar(usuario)!=-1){
            return usuarios.get(buscar(usuario));
        }else {
            return null;
        }
    }

}

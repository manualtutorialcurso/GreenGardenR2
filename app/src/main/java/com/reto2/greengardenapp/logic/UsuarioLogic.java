package com.reto2.greengardenapp.logic;

import com.reto2.greengardenapp.dao.UsuarioObject;
import com.reto2.greengardenapp.modelo.Usuario;

public class UsuarioLogic {
    private static UsuarioObject usuarioObject = new UsuarioObject();

    public static boolean autentificar(String usuario, String contrasenia){
        if (obtener(usuario)!=null) {
            Usuario usuarioConsulta=obtener(usuario);
            if (usuarioConsulta.getUsuario().equals(usuario)&&usuarioConsulta.getContrasenia().equals(contrasenia)){
                return true;
            }
            else{
                return false;
            }
        }else {
            return false;
        }
    }

    public static boolean insertar(Usuario usuario){
        return usuarioObject.insertar(usuario);
    }
    public static boolean modificar(Usuario usuario){
        return usuarioObject.modificar(usuario);
    }
    public static boolean eliminar(String usuario){
        return usuarioObject.eliminar(usuario);
    }
    public static Usuario obtener(String usuario){
        return usuarioObject.obtener(usuario);
    }

}

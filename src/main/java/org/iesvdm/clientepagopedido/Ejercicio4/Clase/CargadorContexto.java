package org.iesvdm.clientepagopedido.Ejercicio4.Clase;

import org.iesvdm.clientepagopedido.Ejercicio4.Anotaciones.OrigenDatosAnotacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorContexto {


    public static List<org.iesvdm.clientepagopedido.Ejercicio4.Anotaciones.OrigenDatosAnotacion> valorOrigenDatos(){
        return Arrays.asList(Repository.class.getAnnotationsByType(OrigenDatosAnotacion.class));
    }


    public static List<Usuario> cargadorUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();

        for (OrigenDatosAnotacion c : valorOrigenDatos()){
            Usuario u = new Usuario();
            u.setUsername(c.username());
            u.setPassword(c.password());
            u.setUrl(c.password());
            usuarios.add(u);
        }
        return usuarios;
    }

}

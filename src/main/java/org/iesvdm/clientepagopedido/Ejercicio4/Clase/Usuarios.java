package org.iesvdm.clientepagopedido.Ejercicio4.Clase;

import org.iesvdm.clientepagopedido.Ejercicio4.Anotaciones.OrigenDatosAnotacion;

import java.util.ArrayList;
import java.util.List;

@OrigenDatosAnotacion( username="root", password="secret", url="jdbc:mysql://localhost:3306/tienda?createDatabaseIfNotExist=true", driverClassName = "com.mysql.cj.jdbc.Driver" )


public class Usuarios {

    String nombre;
    List<Usuario> usuarios = new ArrayList<Usuario>();

    public Usuarios(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nombre='" + nombre + '\'' +
                ", usuarios=" + usuarios +
                '}';
    }
}

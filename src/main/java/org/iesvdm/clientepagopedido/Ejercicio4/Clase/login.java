package org.iesvdm.clientepagopedido.Ejercicio4.Clase;

import org.iesvdm.clientepagopedido.Ejercicio4.Anotaciones.OrigenDatosAnotacion;

import java.util.List;
import java.util.Scanner;

public class login {

    public static Scanner sc = new Scanner(System.in);

    public void login() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el usuario");
        String usuario = sc.nextLine();
        System.out.println("Dime el password");
        String password = sc.nextLine();
        System.out.println("Dime la url");
        String url = sc.nextLine();
        System.out.println("Dime el driverClassName");
        String driver = sc.nextLine();


        Usuario u = new Usuario(usuario, password, url, driver);

        List<OrigenDatosAnotacion> l = CargadorContexto.valorOrigenDatos();

        for (OrigenDatosAnotacion c : l) {
        if(c.username().equals(u.getUsername())){
            System.out.println("Si está dentro de la lista");
            String s = c.password();
            if(s.equals(u.getPassword())){
                System.out.println("Acceso concedido");
            }else{
                System.out.println("Acceso Denegado");
            }

        }else{
            System.out.println("No esta en la lista");
        }
    }


}


    }

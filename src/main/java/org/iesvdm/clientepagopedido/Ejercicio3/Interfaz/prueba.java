package org.iesvdm.clientepagopedido.Ejercicio3.Interfaz;

import org.iesvdm.clientepagopedido.Ejercicio3.MultiMap;

public class prueba {

    public static void main(String[] args) {

        MultiMap k = new MultiMap<>();

        k.add("a", 1);
        k.add("a", 1);
        k.add("a", 2);

        k.addIfAbsent("a", 3);
        k.addIfAbsent("a", 1);

        System.out.println(k);
        boolean valor = k.remove("a", 3);
        System.out.println(valor);
        System.out.println(k);
        System.out.println(k.totalSize());
    }

}

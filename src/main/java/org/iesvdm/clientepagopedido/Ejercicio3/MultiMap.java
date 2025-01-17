package org.iesvdm.clientepagopedido.Ejercicio3;

import org.iesvdm.clientepagopedido.Ejercicio3.Interfaz.MetodosMultimap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MultiMap<K, V> implements MetodosMultimap {

        HashMap<String, ArrayList<Integer>> hasmap = new HashMap<>();




        public MultiMap(){

        }

    @Override
    public void add(Object key, Object Value) {

            String valor = String.valueOf(key);
            Integer insertar = (Integer) Value;

            if(!this.hasmap.isEmpty()){
                ArrayList<Integer> valores2 = this.hasmap.get(key);
                if(valores2.contains(insertar)){
                    System.out.println("No se puede añadir");
                }else{
                    valores2.add(insertar);
                    this.hasmap.put(valor, valores2);
                }
            }else{
                ArrayList<Integer> valor3 = new ArrayList<>();

                valor3.add(insertar);
                this.hasmap.put(valor, valor3);
            }



    }

    @Override
    public void addIfAbsent(Object key, Object value) {

        String valor = String.valueOf(key);
        Integer insertar = (Integer) value;
        ArrayList<Integer> lista2 = this.hasmap.get(key);

        if(!this.hasmap.isEmpty()) {

           if(!lista2.contains(value)){
               ArrayList<Integer> valores2 = this.hasmap.get(key);
               valores2.add(insertar);
               this.hasmap.put(valor, valores2 );
           }else{
               System.out.println("no se puede añadir");
           }
        }

    }

    @Override
    public boolean remove(Object key, Object value) {
        String valor = String.valueOf(key);
        Integer insertar = (Integer) value;
        ArrayList<Integer> lista2 = this.hasmap.get(key);

        boolean borrado = lista2.remove(insertar);

        if(borrado == true){
            this.hasmap.put(valor, lista2);
        }

        return borrado;
    }

    @Override
    public List get(Object key) {
        return this.hasmap.get(key);

    }

    @Override
    public long totalSize() {
        return this.hasmap.size();
    }


    public HashMap<String, ArrayList<Integer>> getHasmap() {
        return hasmap;
    }

    public void setHasmap(HashMap<String, ArrayList<Integer>> hasmap) {
        this.hasmap = hasmap;
    }

    @Override
    public String toString() {
        return "MultiMap{" +
                "hasmap=" + hasmap +
                '}';
    }
}

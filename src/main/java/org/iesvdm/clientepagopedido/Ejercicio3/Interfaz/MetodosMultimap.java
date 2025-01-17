package org.iesvdm.clientepagopedido.Ejercicio3.Interfaz;

import java.util.List;

public interface MetodosMultimap<K, V> {

    public void add(K key, V Value);

    public void addIfAbsent(K key, V value);

    public boolean remove(K key, V value);
    public List<V> get(K key);

    public long totalSize();

}

package org.iesvdm.clientepagopedido.Ejercicio4.Clase;

public class Repository {

    private OrigenDatos origenDatos;

    public Repository() {
    }

    public Repository(OrigenDatos origenDatos) {
        this.origenDatos = origenDatos;
    }

    public OrigenDatos getOrigenDatos() {
        return origenDatos;
    }

    public void setOrigenDatos(OrigenDatos origenDatos) {
        this.origenDatos = origenDatos;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "origenDatos=" + origenDatos +
                '}';
    }
}

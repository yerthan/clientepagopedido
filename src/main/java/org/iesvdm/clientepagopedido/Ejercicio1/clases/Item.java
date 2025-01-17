package org.iesvdm.clientepagopedido.Ejercicio1.clases;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Item {

    private String description;
    private BigDecimal weight;
    private BigDecimal price;


    public Item() {
    }

    public Item(String description, BigDecimal weight, BigDecimal price) {
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}

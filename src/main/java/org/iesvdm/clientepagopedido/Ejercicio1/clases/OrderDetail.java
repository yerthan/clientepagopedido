package org.iesvdm.clientepagopedido.Ejercicio1.clases;

import org.iesvdm.clientepagopedido.Ejercicio1.Enum.TaxtType;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OrderDetail {

    private int quantity;
    TaxtType taxType;
    Item item;


    public OrderDetail() {
    }

    public OrderDetail(int quantity, TaxtType taxType, Item item) {
        this.quantity = quantity;
        this.taxType = taxType;
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TaxtType getTaxType() {
        return taxType;
    }

    public void setTaxType(TaxtType taxType) {
        this.taxType = taxType;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "quantity=" + quantity +
                ", taxType=" + taxType +
                ", item=" + item +
                '}';
    }


    public BigDecimal calcSubTotal(){

        Item i = new Item();
        BigDecimal precio =i.getPrice();
        BigDecimal peso = i.getWeight();
        BigDecimal subtotalFinal = new BigDecimal(0);

        BigDecimal subtotal =precio.multiply(peso);
        subtotalFinal = subtotal.setScale(2, RoundingMode.HALF_EVEN);

        return subtotalFinal;
    }

    public BigDecimal calcWeight(){

    Item i = new Item();

    BigDecimal peso = i.getWeight().setScale(3, RoundingMode.HALF_UP);

    return peso;

    }
}

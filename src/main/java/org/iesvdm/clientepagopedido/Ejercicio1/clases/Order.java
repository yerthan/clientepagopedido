package org.iesvdm.clientepagopedido.Ejercicio1.clases;

import org.iesvdm.clientepagopedido.Ejercicio1.Enum.Status;
import org.iesvdm.clientepagopedido.Ejercicio1.Enum.TaxtType;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Order<T> {

    private Date date;
    Status status;
    ArrayList<OrderDetail> orderDetails;

    public Order() {
    }

    public Order(Date date, Status status, ArrayList<OrderDetail> orderDetails) {
        this.date = date;
        this.status = status;
        this.orderDetails = orderDetails;
    }

    public ArrayList<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(ArrayList<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", status=" + status +
                ", orderDetails=" + orderDetails +
                '}';
    }

    public BigDecimal calcNetTotal() {

        //Variables
        BigDecimal bg = new BigDecimal(0);
        BigDecimal mul;
        BigDecimal total = new BigDecimal(0);
        BigDecimal nuevo;
        BigDecimal sumaTotal = new BigDecimal(0) ;
        ArrayList<BigDecimal> array = new ArrayList<>();
        BigDecimal valorTotal = new BigDecimal(0);


        for (OrderDetail orderDetail : this.orderDetails) {
            Item i = new Item();
            bg = i.getPrice();
            TaxtType tx = orderDetail.getTaxType();
            String valor = tx.toString();
            switch (valor) {
                case "GENERAL":
                    mul = new BigDecimal(1.21);
                    nuevo = bg.multiply(mul);
                    sumaTotal.add(nuevo);
                    System.out.println("Es general");
                    break;
                case "REDUCED":
                    mul = new BigDecimal(1.1);
                    nuevo = bg.multiply(mul);
                   sumaTotal.add(nuevo);
                    System.out.println("Es reducido");
                    break;
                case "SUPERREDUCED":
                    mul = new BigDecimal(1.04);
                    nuevo = bg.multiply(mul);
                    sumaTotal.add(nuevo);
                    break;
            }
        }

        valorTotal = sumaTotal.setScale(2, RoundingMode.CEILING);
        return valorTotal;
    }

    public void calcGrossTotal(){


            BigDecimal bg1 = new BigDecimal(0);
            BigDecimal valorTotal = new BigDecimal(0);

        for (OrderDetail orderDetail : this.orderDetails) {

            Item i = new Item();
            bg1.add(i.getPrice());
        }

        valorTotal = bg1.setScale(2, RoundingMode.CEILING);


    }

    public void calcVAT(){



    }
}

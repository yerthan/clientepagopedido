package org.iesvdm.clientepagopedido.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @Column(name = "codigo_cliente")
    private Integer codigoCliente;
    private String nombreCliente;
    private String nombreContacto;
    private String apellidoContacto;
    private String telefono;
    private String lineaDireccion;
    private String ciudad;
    private String region;
    private String pais;
    private String codigoPostal;
    private Double limiteCredito;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cliente")
    private Set<Pedido> pedidos;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cliente")
    private Set<Pago> pagos;
}

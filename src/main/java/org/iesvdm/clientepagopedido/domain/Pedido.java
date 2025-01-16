package org.iesvdm.clientepagopedido.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pedido {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "codigo_pedido")
    private Integer codigoPedido;
    private LocalDate fechaPedido;
    private LocalDate fechaEsperada;
    private LocalDate fechaEntrega;
    private String estado;
    private String comentarios;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "codigo_cliente")
    private Cliente cliente;

}

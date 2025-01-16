package org.iesvdm.clientepagopedido.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pago {

    @EmbeddedId
    @EqualsAndHashCode.Include
    private PagoId pagoId;
    private String formaPago;
    private LocalDate fechaPago;
    private Double total;

    @ManyToOne
    @JoinColumn(name = "codigo_cliente")
    @MapsId("codigoCliente")
    @ToString.Exclude
    private Cliente cliente;
}

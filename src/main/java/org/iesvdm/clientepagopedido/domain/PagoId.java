package org.iesvdm.clientepagopedido.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagoId {

    private String idTransaccion;
    private Integer codigoCliente;

}

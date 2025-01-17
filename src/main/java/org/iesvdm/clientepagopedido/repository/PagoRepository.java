package org.iesvdm.clientepagopedido.repository;

import org.iesvdm.clientepagopedido.domain.Pago;
import org.iesvdm.clientepagopedido.domain.PagoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends JpaRepository<Pago, PagoId> {
}

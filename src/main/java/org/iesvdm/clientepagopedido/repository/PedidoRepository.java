package org.iesvdm.clientepagopedido.repository;

import org.iesvdm.clientepagopedido.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}

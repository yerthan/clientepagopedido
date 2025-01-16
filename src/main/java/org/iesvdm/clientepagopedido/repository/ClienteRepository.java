package org.iesvdm.clientepagopedido.repository;

import org.iesvdm.clientepagopedido.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}

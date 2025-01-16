package org.iesvdm.clientepagopedido;

import org.iesvdm.clientepagopedido.domain.Cliente;
import org.iesvdm.clientepagopedido.domain.Pago;
import org.iesvdm.clientepagopedido.domain.Pedido;
import org.iesvdm.clientepagopedido.repository.ClienteRepository;
import org.iesvdm.clientepagopedido.repository.PagoRepository;
import org.iesvdm.clientepagopedido.repository.PedidoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ClientepagopedidoApplicationTests {

    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    PagoRepository pagoRepository;
    @Autowired
    PedidoRepository pedidoRepository;

    @Test
    void contextLoads() {

        var listClientes = clienteRepository.findAll();
        Assertions.assertEquals(36, listClientes.size());
        listClientes.forEach(System.out::println);

        var listPagos = pagoRepository.findAll();
        Assertions.assertEquals(26, listPagos.size());
        listPagos.forEach(System.out::println);

        var listPedidos = pedidoRepository.findAll();
        Assertions.assertEquals(115, listPedidos.size());
        listPedidos.forEach(System.out::println);

        System.out.println(listPagos.get(0).getCliente());
        System.out.println(listPedidos.get(0).getCliente());

    }

    /**
     * 1. Devuelve un listado con los distintos estados por los que puede pasar un pedido, sin repetición.
     */
    @Test
    void test1() {
        List<Pedido> list = pedidoRepository.findAll();

    }


    /**
     * 2.Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008.
     * Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos.
     */
    @Test
    void test2() {
        List<Cliente> list = clienteRepository.findAll();

    }

    /**
     * 3. Devuelve un listado con el código de pedido, código de cliente, fecha esperada
     * y fecha de entrega de los pedidos que no han sido entregados a tiempo.
     * NOTAS:
     * Revisa los campos de la tabla pedido haciendo doble click en el panel de Database.
     * Razona sobre los campos de la tabla.
     * Puede que tengas que tener cuidado con los NULL de la tabla o puede que no.
     */
    @Test
    void test3() {
        List<Pedido> list = pedidoRepository.findAll();

    }

    /**
     * 4. Devuelve un listado con el código de pedido, código de cliente, fecha esperada
     * y fecha de entrega de los pedidos cuya fecha de entrega
     * ha sido al menos dos días antes de la fecha esperada.
     * NOTAS: fecha de entrega null significa que no se ha entregado.
     */
    @Test
    void test4() {
        List<Pedido> list = pedidoRepository.findAll();

    }

    /**
     * 5. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal.
     * Ordene el resultado de mayor a menor según importe de pago.
     */
    @Test
    void test5() {
        List<Pago> list = pagoRepository.findAll();

    }

    /**
     * 6. Muestra el nombre de las regiones de los clientes que hayan realizado pagos.
     */
    @Test
    void test6() {
        List<Cliente> list = clienteRepository.findAll();

    }


    /**
     * 7. ¿Cuántos clientes existen con domicilio en la ciudad de Madrid?
     */
    @Test
    void test7() {
        List<Cliente> list = clienteRepository.findAll();

    }

    /**
     * 8. Devuelve el nombre del cliente con mayor límite de crédito.
     */
    @Test
    void test8() {
        List<Cliente> list = clienteRepository.findAll();

    }

    /**
     *  9. Devuelve un listado con el número de clientes que tiene cada país.
     */
    void test9() {
        List<Cliente> list = clienteRepository.findAll();

    }

    /**
     * 10. Calcula la fecha del primer y último pago realizado por cada uno de los clientes.
     * El listado deberá mostrar el nombre y los apellidos de cada cliente.
     */
    void test10() {
        List<Cliente> list = clienteRepository.findAll();

    }


}

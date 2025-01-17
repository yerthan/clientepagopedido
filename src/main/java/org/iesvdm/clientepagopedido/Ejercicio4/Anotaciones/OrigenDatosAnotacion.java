package org.iesvdm.clientepagopedido.Ejercicio4.Anotaciones;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(LoginArray.class)

public @interface OrigenDatosAnotacion {

    String username();
    String password();
    String url();
    String driverClassName();
}

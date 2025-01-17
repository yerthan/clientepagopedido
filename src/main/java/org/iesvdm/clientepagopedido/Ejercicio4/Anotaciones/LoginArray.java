package org.iesvdm.clientepagopedido.Ejercicio4.Anotaciones;


import javax.swing.text.Element;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface LoginArray {
    OrigenDatosAnotacion[] value();
}

package edu.educacionit;

import edu.educacionit.ejercicio.Ejercicio;
import edu.educacionit.ejercicio.EjercicioFelipe;
import edu.educacionit.pila.EjemploPila;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class A {
    public static int variable1;
}

@SpringBootApplication
public class Init {
    public static void main(String[] args) {
        new EjemploPila().ejemploManejoErrores();
        // EjercicioFelipe.main(args);
    }
}

package edu.educacionit.pila;

public class EjemploPila {
    public void ejemploManejoErrores() {
        try {
            Pila p = new Pila();
            p.m1(995);
        }
        catch (RuntimeException ex) {
            System.out.println("Ocurrio un error");
            System.out.println(ex.getMessage());
        }
        new ErrorEnPila().mostrarHola();
    }
}

package edu.educacionit.pila;

public class ErrorEnPila {
    public void mostrarHola() {
        System.out.println("HOLA");
        mostrarChau();
    }
    public void mostrarChau() {
        System.out.println("CHAU");
        mostrarHola();
    }
}

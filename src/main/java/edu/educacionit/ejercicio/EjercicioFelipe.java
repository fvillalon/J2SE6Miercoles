package edu.educacionit.ejercicio;

public class EjercicioFelipe {
    public static void main(String[] args) {
        Botella b = new Botella();
           try {
               b.servir();
               b.servir();
               b.servir();
               b.servir();
           }
           catch (Exception ex) {
              System.out.println("Se acabo el vino");
              System.out.println(ex.getMessage());
           }
    }
}

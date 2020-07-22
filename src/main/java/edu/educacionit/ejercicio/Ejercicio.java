package edu.educacionit.ejercicio;

public class Ejercicio {
    public static void main(String args[]) {
        int ml = 1000;
  
        try{
            for(;;){
                System.out.println("Sirviendo...");
                if(ml < 300 ) {
                    // es error
                    throw new RuntimeException("Se acabo el vino");
                }
                else {
                    ml = ml - 300;
                }
            }
        } catch (Exception ex) {
            System.out.println("Se acabo el vino");
       }
    }
}

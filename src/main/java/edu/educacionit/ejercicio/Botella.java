package edu.educacionit.ejercicio;

public class Botella {    
    private static int ml = 1000;
    
    public void servir() {
        if(ml < 300){
            throw new RuntimeException("NO ALCANZA LA CANTIDAD PARA SERVIR");
        }
        ml -= 300;
        System.out.println("Sirviendo vino quedan "+ ml +" ml");
        // Muestra el mensaje despues de hacer el descuento, asi queda mas claro para el usuario final
    }
}

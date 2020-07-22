package edu.educacionit.ejercicio;

public class Botella {    
    private static int ml = 1000;
    
    public void servir() {
        if(ml < 300){
            throw new RuntimeException("NO ALCANZA LA CANTIDAD PARA SERVIR");
        }
        System.out.println("Servir ml :"+ ml);
        ml -= 300;
    }
}

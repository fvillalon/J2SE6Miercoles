package edu.educacionit;

import org.springframework.boot.autoconfigure.SpringBootApplication;

class A {
    public static int variable1;
}

@SpringBootApplication
public class Init {
    public static void main(String[] args) {
        /*
        Jugador compu = new JugadorConsola("juan");
        Jugador consola = new JugadorCompu();
        
        Juego juego = new Juego(compu, consola);
        juego.jugar();
        */
        
        /*
        
        A a1 = new A();
        a1.variable1 = 1000;
        A a2 = new A();
        a2.variable1 = 30000;
        
        System.out.println(a1.variable1);
        System.out.println(a2.variable1);
        */
        
        new edu.educacionit.manejoerrores.Init(2).intentarOperacion();
    }
}

package edu.educacionit;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Init {
    public static void main(String[] args) {
        Jugador compu = new JugadorConsola("juan");
        Jugador consola = new JugadorCompu();
        
        Juego juego = new Juego(compu, consola);
        juego.jugar();
    }
}

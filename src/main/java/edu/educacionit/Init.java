package edu.educacionit;

import edu.educacionit.ejercicio.Ejercicio;
import edu.educacionit.ejercicio.EjercicioFelipe;
import edu.educacionit.pila.EjemploPila;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Init {
    public static void main(String[] args) {
        Jugador compu = new JugadorConsola("juan");
        Jugador consola = new JugadorCompu();

        Juego juego = new Juego(new Apostador[] {});
        juego.jugar(compu, consola);
    }
}

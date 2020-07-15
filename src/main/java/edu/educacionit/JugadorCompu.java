package edu.educacionit;

public class JugadorCompu implements Jugador {
    public int obtenerJugada() {
        return (int)(Math.random()*3) +1;
    }

    public String obtenerNombre() {
        return "Dell Inspiron Gaming";
    }
}

package edu.educacionit;

import java.util.Scanner;

public class JugadorConsola implements Jugador {
    private String nombreJugador;

    public JugadorConsola(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    
    public int obtenerJugada() {
        Scanner entrada = new Scanner(System.in);
        String strOut = String.join(" ", "Por favor, ", nombreJugador, 
                "selecione 1. Piedra, 2. Papel, 3. Tijera: >");
        
        System.out.print(strOut);
        int respuesta = entrada.nextInt();
        System.out.println("");
        return respuesta;
    }

    public String obtenerNombre() {
        return this.nombreJugador;
    }
}

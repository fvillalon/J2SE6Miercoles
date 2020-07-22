package edu.educacionit;

public class Juego {
    
    private Apostador[] apostadores;
    
    public Juego(Apostador[] apostadores) {
        this.apostadores = apostadores;
    }
    
    public void jugar(Jugador primero, Jugador segundo) {
        int j1 = primero.obtenerJugada();
        int j2 = segundo.obtenerJugada();
        
        // ppt(j1, j2) -> resultado
        int resultado = LogicaPPT.jugar(j1, j2);
        
        switch (resultado) {
            case 0:
                System.out.println("Empate");
                break;
            case 1:
                System.out.println(String.join("", "Gano: ", primero.obtenerNombre()));
                break;
            case 2:
                System.out.println(String.join("", "Gano: ", segundo.obtenerNombre()));
                break;
        }
    }
}

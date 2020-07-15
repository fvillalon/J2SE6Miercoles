package edu.educacionit;

public class Juego {
    Jugador primero;
    Jugador segundo;

    public Juego(Jugador primero, Jugador segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }
    
    public void jugar() {
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

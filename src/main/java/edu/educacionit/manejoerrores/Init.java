package edu.educacionit.manejoerrores;

public class Init {
    public Init() {
        System.out.println("Constructor con 0 argumentos");
    }
    public Init(Integer x) {
        System.out.println("Constructor con 1 argumentos");
    }
    public void intentarOperacion() {
        try {
            System.out.println("Voy a intentar realizar operaciones matematicas");
            Integer resultado = dividir(sumar(3,400), sumar(-5, sumar(4, sumar(-3,4))));
            System.out.println("Resultado: " + String.valueOf(resultado));
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public Integer sumar(int x, int y) {
        System.out.println("Sumando...");
        return x + y;
    }
    public Integer dividir(int dividendo, int divisor) {
        System.out.println("Dividendo: ".concat(String.valueOf(dividendo)));
        System.out.println("Divisor: ".concat(String.valueOf(divisor)));
        System.out.println("Si el divisor es 0 ? entonces no se puede hacer ");
        if (divisor == 0) {
            throw new RuntimeException("Cuidado, NO se puede dividir por cero");
        }
        return dividendo / divisor;
    }
}

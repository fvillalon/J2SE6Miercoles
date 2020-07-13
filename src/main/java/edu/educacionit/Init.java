package edu.educacionit;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Init {
	public static void main(String[] args) {
                System.out.println("Bienvenidos a clase 2");
      		
                Conexion[] arrCon = new Conexion[] {
                    new ConexionMYSQL(),
                    new conexionOracle(),
                    new ConexionMongoDb(),
                    new conexionOracle()
                };
                
                for (Conexion c : arrCon) {
                    c.conectar();
                }
                
                // scope - las variables definidas
                // dentro de este scope, no van a colisionar
                // con las variables que esten en otro socpe
                {
                    int[] arrEnteros = new int[args.length];
                    
                    for (int i = 0; i < args.length; i++) {
                        arrEnteros[i] = Integer.parseInt(args[i]);
                    }
                    
                    System.out.println("");
                    for (int x : arrEnteros) {
                        System.out.print("Argumento: ");
                        System.out.println(x);
                    }
                }
	}
}

interface Conexion {
    void conectar();
}

class ConexionMYSQL implements Conexion {
    private String datosConexion = "Base de datos MySQL";
    public void conectar() {
        System.out.print("Conectando a: ");
        System.out.println(datosConexion);
    }
}

class conexionOracle implements Conexion {
    private String datosConexion = "Base de datos ORACLE";
    public void conectar() {
        System.out.print("Conectando a: ");
        System.out.println(datosConexion);
    }
}

class ConexionMongoDb implements Conexion {
    private String datosConexion = "Base de datos MongoDB";
    public void conectar() {
        System.out.print("Conectando a: ");
        System.out.println(datosConexion);
    }
}

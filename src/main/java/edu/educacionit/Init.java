package edu.educacionit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Init {
	public static void main(String[] args) {
		System.out.println("Bienvenidos a clase 2");
      		
                Conexion[] arrCon = new Conexion[] {
                    new Conexion(),
                    new Conexion(),
                    new Conexion(),
                    new Conexion()
                };
                
                for (Conexion c : arrCon) {
                    c.conectar();
                }
	}
}

class Conexion {
    private String datosConexion = "Base de datos MySQL";
    public void conectar() {
        System.out.print("Conectando a: ");
        System.out.println(datosConexion);
    }
}

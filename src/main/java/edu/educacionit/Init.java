package edu.educacionit;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Init {
	public static void main(String[] args) {
		System.out.println("Bienvenidos a clase 2");
      		
                Conexion[] arrCon = new Conexion[] {
                    new ConexionMYSQL(),
                    new conexionOracle(),
                    new ConexionMYSQL(),
                    new conexionOracle()
                };
                
                for (Conexion c : arrCon) {
                    c.conectar();
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

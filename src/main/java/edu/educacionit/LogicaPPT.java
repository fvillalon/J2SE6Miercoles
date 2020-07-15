package edu.educacionit;

public class LogicaPPT {
    public static final Integer Piedra = 1;
    public static final Integer Papel = 2;
    public static final Integer Tijera = 3;
    
    public static final Integer Empate = 0;
    public static final Integer Gana1 = 1;
    public static final Integer Gana2 = 2;
    
    public static Integer jugar(Integer j1, Integer j2) {
        if (j1==j2) {
            return Empate;
        }
        if (j1==Piedra){
            if (j2==Tijera) {
                return Gana1;
            }
            return Gana2;
        }
        if (j1==Papel){
            if (j2==Tijera) {
                return Gana2;
            }
            return Gana1;
        }
        if (j1==Tijera){
           if (j2==Papel) {
               return Gana1;
           }
           return Gana2;
       }
       throw new RuntimeException("No se pudo resolver");
    }
}

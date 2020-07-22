package edu.educacionit.pila;

public class Pila {
    public void m6(int x) throws Exception {
        String strOut = String.join("", "El valor de x es: ", String.valueOf(x));
        System.out.println("Llegue a m6");
        System.out.println(strOut);
        if (x==1000) {
            throw new Exception("No puede ser mil...");
        }
    }
    public void m5(int x) throws Exception {
        System.out.println("Antes de llamar a m6");
        m6(x+1);
        System.out.println("Despues de llamar a m6");
    }
    public void m4(int x) throws Exception {
        System.out.println("Antes de llamar a m5");
        m5(x+1);
        System.out.println("Despues de llamar a m5");
    }
    public void m3(int x) {
        System.out.println("Antes de llamar a m4");
        try {
            m4(x+1);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Despues de llamar a m4");
    }
    public void m2(int x) {
        System.out.println("Antes de llamar a m3");
        m3(x+1);
        System.out.println("Despues de llamar a m3");
    }
    public void m1(int x) {
        System.out.println("Antes de llamar a m2");
        m2(x+1);
        System.out.println("Despues de llamar a m2");
    }
}

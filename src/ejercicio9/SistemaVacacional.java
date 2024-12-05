/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author Victor Mejia
 */
public class SistemaVacacional {
    private int clave;
    private int antiguedad;
    private String nombre;
    
    public SistemaVacacional(){
        this.clave = 0;
        this.antiguedad = 0;
        this.nombre = "";
    }
    
    public void setClave(int clave){
        this.clave = clave;
    }
    
    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getClave(){
        return this.clave;
    }
    
    public int getAntiguedad(){
        return this.antiguedad;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void calcularDiasDeVacaciones(){
         if (this.getClave() == 1) {
            if (this.antiguedad == 1) {
                System.out.println(this.getNombre() + " " + "Derecho a 6 días de vacaciones");
            } else if (this.antiguedad >= 2 && this.antiguedad <= 6) {
                System.out.println(this.getNombre() + " " + "Derecho a 14 días de vacaciones");
            } else if (this.antiguedad == 7) {
                System.out.println(this.getNombre() + " " + "Derecho a 20 días de vacaciones");
            } else {
                System.out.println("Aun no tiene derecho a vacaciones");
            }
        } else if (this.getClave()  == 2) {
            if (this.antiguedad == 1) {
                System.out.println(this.getNombre() + " " + "Derecho a 7 días de vacaciones");
            } else if (this.antiguedad >= 2 && this.antiguedad <= 6) {
                System.out.println(this.getNombre() + " " + "Derecho a 15 días de vacaciones");
            } else if (this.antiguedad == 7) {
                System.out.println(this.getNombre() + " " + "Derecho a 22 días de vacaciones");
            } else {
                System.out.println("Aun no tiene derecho a vacaciones");
            }
        } else if (this.getClave()  == 3) {
            if (this.antiguedad == 1) {
                System.out.println(this.getNombre() + " " + "Derecho a 10 días de vacaciones");
            } else if (this.antiguedad >= 2 && this.antiguedad <= 6) {
                System.out.println(this.getNombre() + " " + "Derecho a 20 días de vacaciones");
            } else if (this.antiguedad == 7) {
                System.out.println(this.getNombre() + " " + "Derecho a 30 días de vacaciones");
            } else {
                System.out.println("Aun no tiene derecho a vacaciones");
            }
        }
    }
    
    
}

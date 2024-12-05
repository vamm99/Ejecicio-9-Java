/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Victor Mejía
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaVacacional s = new SistemaVacacional();
        
        System.out.println("Ingres el nombre: ");
        String nombre = scanner.nextLine();
        s.setNombre(nombre);
        
        System.out.println("Ingrese la antiguedad: ");
        int antiguedad = scanner.nextInt();
        s.setAntiguedad(antiguedad);
        
        System.out.println("Ingrese la clave del departamento: ");
        int clave = scanner.nextInt();
        s.setClave(clave);
        
        s.calcularDiasDeVacaciones();
       
      
       
    }
    
}

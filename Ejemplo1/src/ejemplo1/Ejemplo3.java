/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Scanner;

/**
 *
 * @author HRH
 */
public class Ejemplo3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Entre el valor del radio: ");
        Scanner scanner = new Scanner(System.in);
        double radio = scanner.nextDouble();
        System.out.println("El area del cuadrado es: "+(Math.PI*Math.pow(radio, 2)));
        
    }
}

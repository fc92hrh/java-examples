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
public class Ejercicio6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Introduce el precio del producto: ");
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        
        System.out.println("El precio final del producto con IVA incluido es de:" + (numero+numero*0.21));
    }
}

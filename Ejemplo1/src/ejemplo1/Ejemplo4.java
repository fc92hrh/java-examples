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
public class Ejemplo4 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Entre un numero: ");
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        System.out.println("El numero es: "+(numero % 2 == 0 ? "Par" : "Impar" ));
    }
}

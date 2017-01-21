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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escrib la cantidad de ventas a efectuar: ");
        int n = scanner.nextInt();
        double suma=0;
        for(int i=0;i<n;i++){
            System.out.print("Entre el valor de la venta numero "+(i+1)+": ");
            suma =scanner.nextDouble();
            
        }
        
        System.out.println("El valor total de las ventas es de: "+suma);
    }
    
}

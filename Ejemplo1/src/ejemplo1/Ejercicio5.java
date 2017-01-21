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
public class Ejercicio5 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Introduce un codigo de la tabla ASCII: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        char caracter = (char)numero;
        System.out.println("El caracter ASCII que le corresponde es: " + caracter);
        ///////////////////////////////////////////////////////
        System.out.println("------------------------------------");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Escribe el caracter al cual desea saber su codigo:");
        caracter = scanner1.nextLine().charAt(0);
        System.out.println("El codigo que le corresponde al caracter es: "+(int)(caracter));
    }
}

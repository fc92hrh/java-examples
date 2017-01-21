/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author HRH
 */
public class Ejercicio7 {
    
    public static void main(String[]args){
        System.out.println("Usando un ciclo while");
        int i = 1;
        while( i <= 100){
            System.out.println(i);
            i++;
        }
        System.out.println("-----------------------------------");
        System.out.println("Usando un ciclo for");
        for (int j = 1; j <= 100; j++) {
            System.out.println(j);
        }
        System.out.println("-------------------------------------");
        System.out.println("Usando un ciclo do while");
        i=0;
        do {   
            i++;
            if( i % 2 == 0 && i % 3 == 0 )
                System.out.println(i);
        } while (i<=100);
        
        
    }
    
}

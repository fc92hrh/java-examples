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
public class CalculadoraPolacaInversaApp {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        double operando1,operando2,resultado=0;
        String signo;
        System.out.println("Entre el operador numero 1: ");
        operando1 = scanner1.nextDouble();
        System.out.println("Entre el operador numero 2: ");
        operando2 = scanner1.nextDouble();
        System.out.println("Entre el signo de la operación: ");
        signo = scanner2.nextLine();
        switch(signo){
            case "+": 
                    resultado = operando1 + operando2;
                    break;
            case "-": 
                    resultado = operando1 - operando2;
                    break;
            case "*": 
                    resultado = operando1 * operando2;
                    break;
            case "/": 
                    resultado = operando1 / operando2;
                    break;
            case "^": 
                    resultado = (int)Math.pow(operando1,operando2);
                    break;
            case "%": 
                    resultado = operando1 % operando2;
                    break;
        }
        
        
        System.out.println("El resultado de la operacion es: " + resultado);
        
    }
    
}

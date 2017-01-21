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
public class Ejercicio9 {
    public static void main(String[] args) {
        String pass = "BlaBlaBla";
        int i =0;
        Scanner scanner = new Scanner(System.in);
        String res="";
        boolean activo = false;
        while ( i < 3 && !activo ){             
            System.out.println("Entre la contraseña: ");
            res = scanner.nextLine();
            if(pass.equals(res)){
                System.out.println("Enhorabuena, acertaste");
                activo = true;
            }
            i++;            
        }
        
    }
}

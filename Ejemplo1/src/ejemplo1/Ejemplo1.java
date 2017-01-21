/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author HRH
 * Ejeercicio 1 declarar dos variable snumericas con el valor que desees, mostrar por consola el resultado de las operaciones basicas  +modulo
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double var1 = 1234.678;
        double var2 = 425.789;
        System.out.println("(-----------------------------------------)");
        System.out.println("(---------Operaciones Basicas-------------)");
        System.out.println("La suma es: "+(var1+var2));
        System.out.println("La resta es:"+(var1-var2));
        System.out.println("La multiplicacion es: "+(var1*var2));
        System.out.println("La division es: "+(var1/var2));
        System.out.println("La division exacta es: "+(byte)(var1/var2));
        System.out.println("El modulo de la division es: "+(var1%var2));
    }
    
}

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
public class Ejercicio10 {
    public static void main(String[] args) {
        
        String str = "La lluvia en Sevilla es una maravilla";
        int cont = 0;
        for( int i = 0;i < str.length(); i++ ){
            if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u' )
                cont++;
        }
        System.out.println("En la oracion hay: " +cont+" vocales");
        //////////////////////////////////////////////////////////////////
        String str1 = str.replace('a', 'e');
        System.out.println(str1);
        //////////////////////////////////////////////////////////////////
        String nuevacadena="";
        for (int i = 0; i < str.length(); i++) {
            nuevacadena += (int)str.charAt(i);
            nuevacadena += " ";
        }
        System.out.println(nuevacadena);
    }
}

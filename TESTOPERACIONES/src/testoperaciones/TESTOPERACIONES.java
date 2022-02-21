/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testoperaciones;

import java.util.Scanner;

/**
 *
 * @author carpui
 */
public class TESTOPERACIONES {

    /**
     * Método que multiplica dos números enteros
     * @param a Primer número emtero
     * @param b Segundo número entero
     * @return 
     */
public static int multiplica(int a, int b) {
    return a*b;
}
/**
 * Método par acalcular ell factorial de un número
 * @param num El número que se le introduce
 * @return 
 */
public static int factorial(int num) {
    int factorial=num;
    if(num < 0 ) {
        throw new
            IllegalArgumentException("Factorial negativo!");
    }
    for (int i = (num - 1); i > 1; i--) {
        factorial *= i;
    }
    return factorial;
}
    public static void main(String[] args) {
        // TODO code application logic here
        int x=3;
        int y=6;
        System.out.println(multiplica(x, y));
        
        int numero=5;
        System.out.println(factorial(numero));
    }
    
}

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
     * Método para multiplicar a * b.
     * @param a variable para multiplicar por b.
     * @param b variable para multiplicar por a.
     * @return devuelve a * b.
     */
    public static int multiplica(int a, int b) {
        return a * b;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a , b;
        Scanner read = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        a = read.nextInt();
        System.out.println();
        
        System.out.print("Introduce otro numero: ");
        b = read.nextInt();
        System.out.println();
        
        System.out.println(multiplica(a, b));
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;
/*
Realizar un programa que pida dos enteros y muestre cual es el mayor y el menor, si son iguales lo indicará
también. 
*/
import java.util.Scanner;
import java.util.Locale;

public class Comparacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        System.out.println("Introduzca un número entero: ");
        n1 = entrada.nextInt();
        System.out.println("Introduzca otro número entero: ");
        n2 = entrada.nextInt();
        
        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            if (n1 > n2) {
                System.out.println(n1+" es mayor que "+n2);
            }
            else {
                System.out.println(n1+" es menor que "+n2);
            }
        }
    }  
}

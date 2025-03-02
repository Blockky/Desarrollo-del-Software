/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/*
Realizar un programa que pida un entero y muestre si es par o impar.
 */
public class ParImpar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        
        if (numero%2 == 0) {
            System.out.println("Es par");
        } else  {
            System.out.println("Es impar");
        }
    }
    
}

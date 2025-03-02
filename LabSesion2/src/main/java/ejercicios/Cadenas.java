/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

public class Cadenas {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num;
        String cadena;
        
        System.out.println("Introduce un número:");
        num = entrada.nextInt();
        
        System.out.println("Introduce una cadena:");
        cadena = entrada.next();
        
        // si el entero no es positivo no hacemos nada
        // si la cadena es "" no hacemos nada

        if (num > 0 && !cadena.equals("")) {
            for (int i = 0; i < num; i++) {
            System.out.println(cadena);
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.labsesion2;

import java.util.Scanner;
import java.util.Locale;

public class EntSalScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int edad;
        double altura;
        
        System.out.println("\nIntroduce tu nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("\nIntroduce tu edad: ");
        edad = entrada.nextInt();
        
        System.out.println("\nIntroduce tu altura (en metros): ");
        altura = entrada.nextDouble();
        
        System.out.print("\nTe llamas " + nombre + ", tienes " + edad + " años y mides " +
        altura + " metros.");
    }
}

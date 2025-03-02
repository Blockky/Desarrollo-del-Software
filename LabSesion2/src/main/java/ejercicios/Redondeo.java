/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Redondeo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double decimal;
        int redondeo;
        double parteDecimal;
        
        System.out.println("Introduzca un número decimal: ");
        decimal = entrada.nextDouble();
        
        redondeo = (int) decimal;
        parteDecimal = decimal - redondeo;
        
        if (parteDecimal >= 0.5)
            redondeo++;
            
        System.out.println("\nRedondeo: " + redondeo);
    }
}
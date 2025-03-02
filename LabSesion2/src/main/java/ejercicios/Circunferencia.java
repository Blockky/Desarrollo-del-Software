/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double radio;
        double longitud;
        double area;
        
        System.out.println("Introduzca el radio de la circunferencia: ");
        radio = entrada.nextDouble();
        
        longitud = 2*Math.PI*radio;
        area = Math.PI*Math.pow(radio,2);
        
        System.out.println("Longitud: " + longitud + ", area: " + area);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.labsesion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntSal {

    public static void main(String arg[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        String nombre;
        int edad;
        double altura;
        
        System.out.println("\nIntroduce tu nombre: ");
        nombre = entrada.readLine();
        
        System.out.println("\nIntroduce tu edad: ");
        edad = Integer.parseInt(entrada.readLine());
        
        System.out.println("\nIntroduce tu altura (en metros): ");
        altura = Double.parseDouble(entrada.readLine());
        
        System.out.print("\nTe llamas " + nombre + ", tienes " + edad + " años y mides " +
        altura + " metros.");
    }
}
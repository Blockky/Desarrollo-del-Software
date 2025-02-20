/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.labsesion2;

/* Importamos las librerias */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author block
 */
public class EntSal {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        String nombre;
        int edad;
        double altura;
        
        System.out.println("\nIntroduce tu nombre: ");
        nombre = entrada.readLine();
        
        System.out.println("\nIntroduce tu edad: ");
        edad = Integer.parseInt(entrada.readLine());
        
        System.out.println("\nIntroduce tu altura: ");
        altura = Double.parseDouble(entrada.readLine());
        
        System.out.println("\nTe llamas " + nombre + ", tienes " + edad + "años y mides " + altura + " metros.");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

public class Leche {

    public static void main(String[] args) {
        // TODO code application logic here
        double ganancias = 0;
        
        Scanner entrada = new Scanner(System.in);
        double datos[][] = new double[12][2];
        
        for (int i = 0; i < datos.length; i++) {
                datos[i][0] = entrada.nextDouble();
                datos[i][1] = entrada.nextDouble();
            
        }
        for (int i = 0; i < datos.length; i++) {
            ganancias += datos[i][0] * datos[i][1];
        }
        System.out.println(ganancias);
    }
}

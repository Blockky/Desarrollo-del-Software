/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;
/*
3. Realizar un programa que calcule la pendiente de una línea recta dada por dos
puntos de la misma (x1,y1) y (x2,y2).
*/
import java.util.Scanner;

public class Pendiente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pendiente;
        int x1, x2, y1, y2;
            System.out.println("Introduce x1:");
            x1 = entrada.nextInt();
            System.out.println("Introduce y1:");
            y1 = entrada.nextInt();
            System.out.println("Introduce x2:");
            x2 = entrada.nextInt();
            System.out.println("Introduce y2:");
            y2 = entrada.nextInt();
            pendiente = (double) (y2 - y1) / (x2 - x1);
            System.out.println("Pendiente: " + pendiente);
    }
}

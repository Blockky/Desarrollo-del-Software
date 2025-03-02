/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/*
6. Realizar un programa que pida una hora de la siguiente forma: hora, minutos y
segundos. Se debe mostrar la hora un segundo más tarde.
*/
import java.util.Scanner;
        
public class Hora {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int hora = entrada.nextInt();
        int minuto = entrada.nextInt();
        int segundo = entrada.nextInt();
        
        segundo++;
        
        if (segundo > 59) {
            segundo = 0;
            minuto++;
            if (minuto > 59) {
                minuto = 0;
                hora++;
            }
            if (hora > 23) {
            hora = 0;
            }
        }
        System.out.println("["+hora+":"+minuto+":"+segundo+"]");
    }

}

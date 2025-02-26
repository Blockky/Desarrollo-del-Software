package poo.ejercicios2;

import java.util.Scanner;
import java.util.Locale;

public class Redondeo3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Escriba un número decimal: ");
        double decimal = entrada.nextDouble();
        long redondeo = Math.round(decimal);
        System.out.println("Redondeo: "+redondeo);
    }
    
}

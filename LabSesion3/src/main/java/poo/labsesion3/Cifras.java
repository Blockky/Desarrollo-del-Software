package poo.labsesion3;

import java.util.Scanner;

public class Cifras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, divisor, cociente, cifras;
        num = entrada.nextInt();
        divisor = 1;
        cociente = 1;
        cifras = 0;
        if (num >= 0) {
            while (cociente >= 1) {
                divisor *= 10;
                cifras++;
                cociente = num/divisor;
            }
            System.out.println(cifras);
        } else {
            System.out.println(false);
        }
    }  
}

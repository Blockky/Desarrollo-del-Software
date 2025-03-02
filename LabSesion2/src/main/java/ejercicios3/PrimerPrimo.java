package ejercicios3;

import java.util.Scanner;

public class PrimerPrimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        if (num == 0) {
            System.out.println(false);
        } else {
        while (!esPrimo(num)) num++;
        System.out.println(num);
        }
        
    }
    public static boolean esPrimo(int num) {
        if (num==1 || num==0) return false;
        for (int i=2; i<num; i++) {
            if (num%i==0) return false;
        }
        return true;
    }
}

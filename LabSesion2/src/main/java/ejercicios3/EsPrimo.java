package ejercicios3;

import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        System.out.println(esPrimo(num));
    }
    public static boolean esPrimo(int num) {
        if (num==1 || num==0) return false;
        for (int i=2; i<num; i++) {
            if (num%i==0) return false;
        }
        return true;
    }
}

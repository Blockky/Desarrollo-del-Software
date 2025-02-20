package poo.labsesion3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cuenta, res;
        num = entrada.nextInt();
        cuenta = num;
        res = num;
        if (num >= 0) {
            while (cuenta != 1) {
                cuenta--;   
                res *= cuenta;
            }
            System.out.println(res);
        } else {
            System.out.println(false);
        }
    }  
}

package poo.labsesion3;

import java.util.Scanner;

public class Sumatorio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cuenta, res;
        num = entrada.nextInt();
        cuenta = num;
        res = 0;
        if (num >= 0) {
            while (cuenta != 0) {
                res += cuenta;
                cuenta--;               
            }
            System.out.println(res);
        } else {
            System.out.println(false);
        }
    }
}

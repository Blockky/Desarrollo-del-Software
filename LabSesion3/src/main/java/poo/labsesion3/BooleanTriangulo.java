package poo.labsesion3;

import java.util.Scanner;

public class BooleanTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, z;
        x = entrada.nextInt();
        y = entrada.nextInt();
        z = entrada.nextInt();
        if (x+y > z && y+z > x && x+z > y) {
            System.out.println(true);        
        } else {
            System.out.println(false);
        }
    }  
}

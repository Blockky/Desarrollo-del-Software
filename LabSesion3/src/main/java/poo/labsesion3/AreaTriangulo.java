package poo.labsesion3;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x, y, z;
        x = entrada.nextDouble();
        y = entrada.nextDouble();
        z = entrada.nextDouble();
        if (x+y > z && y+z > x && x+z > y) {
            double area = (x*y)/2;
            System.out.println(area);
        } else {
            System.out.println(false);
        }
    }  
}

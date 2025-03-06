package poo.labsesion1;

import java.util.Scanner;

public class HolaTal {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();
        System.out.println("Hola " + nombre);
    }
}

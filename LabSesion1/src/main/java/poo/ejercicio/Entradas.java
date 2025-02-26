package poo.ejercicio;

import java.util.Scanner;

public class Entradas {
  public static void main(String[] args) {
    // Escribe aquí el código
    Scanner entrada = new Scanner(System.in);
    while (entrada.hasNextLine()) {
        String linea = entrada.nextLine();
        System.out.println(linea);
    }
  }
}

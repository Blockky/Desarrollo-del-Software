package poo.ejercicios2;
import java.util.Locale;
import java.util.Scanner;

public class Redondeo2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double decimal;
        int redondeo;
        System.out.println("Escriba un número decimal: ");
        decimal = entrada.nextDouble();
        redondeo = (int) (decimal + 0.5);     
        
        System.out.println("Redondeo: " + redondeo);
  }
}

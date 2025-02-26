package poo.ejercicios2;
import java.util.Locale;
import java.util.Scanner;

public class Redondeo {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double decimal;
        int redondeo;
        double parteDecimal;
        
        System.out.println("Escriba un número decimal: ");
        decimal = entrada.nextDouble();
        
        redondeo = (int) decimal;
        parteDecimal = decimal - redondeo;
        
        if (parteDecimal >= 0.5)
            redondeo++;
            
        System.out.println("Redondeo: "+ redondeo);

        // Me he dado cuenta al final que también se puede importar una librería Math que te lo hace automáticamente //
  }
}

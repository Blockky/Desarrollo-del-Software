package ejercicios3;

import java.util.Scanner;

public class FechaValida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia = entrada.nextInt();
        int mes = entrada.nextInt();
        int anno = entrada.nextInt();
        System.out.println(esFechaValida(dia,mes,anno));
    }
    public static boolean esBisiesto(int x) {
        if (x%4==0) return true;
        else return false;
    }
    public static boolean esFechaValida(int dia, int mes, int anno) {
        int[] diasMes={31,28,31,30,31,30,31,31,30,31,30,31};
        if (esBisiesto(anno)) diasMes[1]=29;
        if (anno>0 && mes>=1 && mes<=12 && dia>=1 && dia<=diasMes[mes-1]) return true;
        else return false;
    }
}

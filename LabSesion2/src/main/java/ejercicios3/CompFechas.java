package ejercicios3;

import java.util.Scanner;

public class CompFechas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia = entrada.nextInt();
        int mes = entrada.nextInt();
        int anno = entrada.nextInt();
        int dia2 = entrada.nextInt();
        int mes2 = entrada.nextInt();
        int anno2 = entrada.nextInt();
        if (esFechaValida(dia,mes,anno) && esFechaValida(dia2,mes2,anno2)) {
            int diferencia = diferenciaDias(dia,mes,anno,dia2,mes2,anno2);
            System.out.println(diferencia);
        } else {
            System.out.println(false);
        }
        
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
    public static int diasDelAnno(int dia, int mes, int anno) {
        int[] diasMes={31,28,31,30,31,30,31,31,30,31,30,31};
        if (esBisiesto(anno)) diasMes[1]=29;
        int contadorDias = dia;
        for (int i=1; i < mes; i++) {
            contadorDias += diasMes[i-1];
        } return contadorDias;
    }
    public static int diferenciaDias(int d1, int m1, int a1, int d2, int m2, int a2) {
        if (a2 != a1) {
            int diff;
            int contadorDias = 0;
            int contadorDias2 = 0;
            for (int i=a2; i>=2000; i--) {
                    contadorDias2 += diasDelAnno(31,12,i-1);
                }
            for (int j=a1; j>=2000; j--) {
                    contadorDias += diasDelAnno(31,12,j-1);
                }
                if (a2>a1) {
                    diff = diasDelAnno(d2,m2,a2) + contadorDias2 - diasDelAnno(d1,m1,a1) - contadorDias;
                } else {
                    diff = diasDelAnno(d1,m1,a1) + contadorDias - diasDelAnno(d2,m2,a2) - contadorDias2;
                }
            return diff;
        } else {
            if (m2>m1 || (m2==m1 && d2>d1)) return diasDelAnno(d2,m2,a2) - diasDelAnno(d1,m1,a1);
            else return diasDelAnno(d1,m1,a1) - diasDelAnno(d2,m2,a2);
        }
        
    }
}

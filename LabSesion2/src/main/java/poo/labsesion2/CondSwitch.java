/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.labsesion2;

public class CondSwitch {
    public static void main(String[] args) {
        int dia = 5;
        String diaSemana;
        switch (dia) {
            case 1:
                diaSemana = "lunes";
                break;
            case 2:
                diaSemana = "martes";
                break;
            case 3:
                diaSemana = "miércoles";
                break;
            case 4:
                diaSemana = "jueves";
                break;
            case 5:
                diaSemana = "viernes";
                break;    
            case 6:
                diaSemana = "sábado";
                break;
            case 7:
                diaSemana = "domingo";
                break;
            default:
                diaSemana = "incorrecto";
                break;
        }
        System.out.println(diaSemana);
    }
    
}

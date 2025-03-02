/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.labsesion2;

public class CondIf {

    public static void main(String[] args) {
        // TODO code application logic here
        int x=5, y=1;
        //igual
        if (x==5) System.out.println("x=5");
        //distinto
        if (x!=2) System.out.println("x!=2");
        //y lógico
        if (x==5 && y==2) System.out.println("x=5, y=2");
        //o lógico
        if (x==5 || y==1) System.out.println("x=5");
        //operación
        if (x+y>10) System.out.println("x+y>10");
        else System.out.println("x+y<10");
    }
}

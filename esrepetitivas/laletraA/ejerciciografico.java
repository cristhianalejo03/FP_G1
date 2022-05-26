
package esrepetitivas.laletraA;

import java.util.Scanner;

public class ejerciciografico {
    static Scanner teclado=new Scanner(System.in);

    //variables
    int n;
    public static void garficarA() {
        System.out.println("por favor ingrese la altura de la letra a: ");
        int canf=teclado.nextInt();
        System.out.println("ingrese num fila para la linea: ");
        int numlinea=teclado.nextInt();
        int medio=canf+1;
        for (int f = 1; f <= canf; f++) {
            for (int c = 0; c <=2*canf+1 ; c++) {
                if (f==1 && medio==c) {
                    System.out.print("*");
                }else if (c==medio-f && f>1){
                    System.out.print("*");
                }else if (c==medio+f && f>1){
                    System.out.print("*");
                }else if (f==numlinea && c>=medio-f && c<=medio+f){
                    System.out.print("*");
                }else{
                    System.out.print(" ");

                }

            }
            System.out.print("\n");
        }
        System.out.print(" ");
    }

    public static void main(String[] args) {
        garficarA();
    }
    
}
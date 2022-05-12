package esrepetitivas;

import java.util.Scanner;

public class ejerciciosr {
    
    public static void imprimirWhileN1_10() {
    int numInIt=1;
    while (numInIt<=20) {
        System.out.println(numInIt);
        numInIt=numInIt+1;
    }

    }
    public static void imptimirDowhileeN1_20() {
       int numinit=1;
       do{
            System.out.println(numinit);
            numinit++;
       } while(numinit<=20);

    }
    public static void imprimirforN1_20() {
        for (int numinit = 19 ;numinit <=20; numinit++) {
            System.out.println(numinit); 
        }
    }
    public static void nombreinversa() {
        Scanner it=new Scanner(System.in);
        System.out.println("ingrese su nombre"); 
        String nombre = it.next();
        for (int i = nombre.length()-1; i >=0; i--) {
             System.out.println(nombre.charAt(i));

        }
    }
    public static void main(String[] args) {
       /*System.out.println("imprime while:"); imprimirWhileN1_10();
       System.out.println("imprime do while:"); imptimirDowhileeN1_20();
       System.out.println("imprime for;"); imprimirforN1_20();*/
       

       nombreinversa();
    }
}

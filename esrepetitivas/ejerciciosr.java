package esrepetitivas;

public class ejerciciosr {
    
    public static void imprimirWhileN1_10() {
    int numInIt=19;
    while (numInIt<=20) {
        System.out.println(numInIt);
        numInIt=numInIt+1;
    }

    }
    public static void imptimirDowhileeN1_20() {
       int numinit=19;
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
    public static void main(String[] args) {
       System.out.println("imprime while:"); imprimirWhileN1_10();
       System.out.println("imprime do while:"); imptimirDowhileeN1_20();
       System.out.println("imprime for;"); imprimirforN1_20();
    }
}

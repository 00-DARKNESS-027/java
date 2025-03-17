package org.example;
import java.util.Scanner;


public class Calculator_test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        while(true){
            //il ciclo continua fino a che non acade il break ho la scelta 5
            System.out.println("Seleziona l'operazione");
            System.out.println("1. Somma");
            System.out.println("2. Sotrazzione");
            System.out.println("3. Divisine");
            System.out.println("4. Moltiplicazione");
            System.out.println("5. Esci");

            int scelta = scanner.nextInt();

            if(scelta == 5){
                System.out.println("salve");
                break;
            }

            System.out.println("Inserisci il primo numero ");
            double numero1 = scanner.nextInt();
            System.out.println("Inserisci il secono numero ");
            double numero2 = scanner.nextInt();

            double rusultato = calculator.seguiOperazioni(scelta, numero1, numero2);
            System.out.println("il risultato é " + rusultato);
        }
        scanner.close();
        //suppongo che si chiude per qualche motivo di corezione del codice
    }
}



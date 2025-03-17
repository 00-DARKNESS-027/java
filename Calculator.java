package org.example;

public class Calculator {

    public static void main(String[] args) {
        // Non è necessario avere un corpo qui per questo esempio
    }

    public double seguiOperazioni(int scelta, double numero1, double numero2) {
        double risultato = 0.0;

        switch (scelta) {
            case 1:
                risultato = som(numero1, numero2);
                break;
            case 2:
                risultato = sort(numero1, numero2);
                break;
            case 3:
                risultato = div(numero1, numero2);
                break;
            case 4:
                risultato = mol(numero1, numero2);
                break;
            default:
                System.out.println("Errore: Operazione non valida.");
                break;
        }

        return risultato;
    }

    public double som(double a, double b) {
        return a + b;
    }

    public double sort(double a, double b) {
        return a - b;
    }

    public double mol(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Errore: Divisione per zero non permessa.");
            return 0;
        }
    }
}
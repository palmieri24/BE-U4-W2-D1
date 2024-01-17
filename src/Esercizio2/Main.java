package Esercizio2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio 2");

        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Quanti Km hai percorso?");
            int km = Integer.parseInt(input.nextLine());

            System.out.println("Quanti litri hai consumato?");
            int l = Integer.parseInt(input.nextLine());

            if (l == 0) {
                throw new ArithmeticException("Non si possono consumare 0 litri");
            }
            int result = km / l;
            System.out.println("Km a litro percorsi: " + result);

        } catch (Exception ex) {
            System.err.println( ex.getMessage());
        }


    }
}

package Esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 1");

        int[] newArray = new int[5];
        Random random = new Random();

        for(int i = 0; i < newArray.length; i++){
            int randomNumber = random.nextInt(1,10);
            newArray[i] = randomNumber;
        }

        System.out.println(Arrays.toString(newArray));

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Digita un valore numerico da inserire. Digita 0 per annullare l'operazione");
            Integer newNumber = scanner.nextInt();
            scanner.nextLine();
            if (newNumber.equals(0)){
                System.out.println("Exit");
                scanner.close();
                break;
            } else {
                try{
                    System.out.println("In quale posizione vuoi inserirlo?");
                    int newPos = scanner.nextInt();
                    scanner.nextLine();
                    newArray[newPos] = newNumber;
                    System.out.println(Arrays.toString(newArray));
                } catch (ArrayIndexOutOfBoundsException ex){
                    System.err.println(ex.getMessage());
                }

            }

        }




    }
}
package lt.bt.testai.uzdaviniai;

import java.util.Scanner;

public class Keltas {

    public static void main(String[] args) {

    printText("Automobilių skaičius?");

    int carsNumber = Integer.parseInt(readFromConsole());

    printText("Kiek į keltą telpa automobilių?");

    int capacityFerry = Integer.parseInt(readFromConsole());

    countQuantity(capacityFerry, carsNumber);



    }

    private static void printText(String text){ System.out.println(text);}

    private static String readFromConsole() {
        Scanner reader= new Scanner(System.in);
        String number = reader.nextLine();
//        reader.close();
        return number;

    }

    private static void countQuantity(int capacity, int car) {

        if (car >= capacity) {
            int counter = 0;
            for (int n = 1; capacity * n <= car; n++) {
                counter++;
            }
            int balance = car - capacity * counter;
            printText("Perkels per kartų: " + counter);
            printText("Liks neperkelta: " + balance);

        } else {
            int lack = capacity - car;
            printText("Keltas nekels. Iki pilno kelto uzpildymo truksta automobiliu: " + lack);
        }

    }


}

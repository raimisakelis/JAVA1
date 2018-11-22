package lt.bt.testai.uzdaviniai;

import java.util.Scanner;

public class Akvariumas {
    public static void main(String[] args) {

        printText("Kiek žuvų gyvena akvariume? ");

        int initialNumber = Integer.parseInt(readFromConsole());

        printText("Kiek žuvų į akvariumą įdedama kiekvieną dieną? ");

        int everyDayNumber = Integer.parseInt(readFromConsole());

        printText("Kiek dienų praėjo? ");

        int numberOfDays = Integer.parseInt(readFromConsole());

        int result = counterResult(initialNumber, everyDayNumber, numberOfDays);

        printText("Po " + numberOfDays + " dienų akvariume gyvens " +  result + " žuvų.");


    }


    private static void printText(String text){ System.out.println(text);}

    private static String readFromConsole() {
        Scanner reader= new Scanner(System.in);
        String number = reader.nextLine();
//        reader.close();
        return number;

    }

    private static int counterResult(int initialNumber, int everyDayNumber, int numberOfDays) {
        int result = initialNumber + everyDayNumber * numberOfDays;
        return result;
    }

}

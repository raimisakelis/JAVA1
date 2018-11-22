package lt.bt.testai.uzdaviniai;

import java.util.Scanner;

public class Gimtadienis {

    public static void main(String[] args) {

        printText("Kiek sausainių iškepė Tautvydas?");

        int cookiesTaut = Integer.parseInt(readFromConsole());

        printText("Keli draugai dar atsinešė po tiek pat sausainių?");

        int friendsNumber = Integer.parseInt(readFromConsole());

        printText("Kiek žmonių iš viso dalyvavo šventėje?");

        int allPeople = Integer.parseInt(readFromConsole());


        printResults(cookiesTaut, friendsNumber, allPeople);

    }


    private static void printText(String text){ System.out.println(text);}

    private static String readFromConsole() {
        Scanner reader= new Scanner(System.in);
        String number = reader.nextLine();
//        reader.close();
        return number;

    }

    private static void printResults (int initialCookies, int friendsNumber, int people) {
        int allCookies = initialCookies + initialCookies * friendsNumber;

        if (allCookies >= people) {
            int counter = 0;
            for (int n = 1; people * n <= allCookies; n++) {
                counter++;
            }

            int balance = allCookies - people * counter;
            printText("Kiekvienas šventės dalyvis gavo po " +  counter + " sausainius");
            printText("Tautvydui papildomai atiteko " + balance + " sausainiai");

        } else {
            int lack = people - allCookies;
            printText("Kad visi sventes dalyviai gautu po lygiai sausainiu, truksta " + lack + " sausainiu.");
        }

    }

}

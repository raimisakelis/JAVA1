package lt.bt.testai.uzdaviniai;

import java.util.Scanner;

public class MariausSaldainiai {

    public static void main(String[] args) {

        printText("Kiek saldainių gauna Marius?");

        int get = Integer.parseInt(readFromConsole());

        printText("Po kiek saldainių suvalgo?");

        int eat = Integer.parseInt(readFromConsole());

        printText("Kelios dienos liko iki Kalėdų?");

        int days = Integer.parseInt(readFromConsole());


        //is viso sukaupta saldainiu
       int accumulateCandy = accumulateAtAll(days, remainsEveryDay(get, eat));

        //kiek rinkiniu paruos ir kiek liks saldainiu
        kitsAndFriends(eat, accumulateCandy);



    }



    private static void printText(String text){ System.out.println(text);}

    private static String readFromConsole() {
        Scanner reader = new Scanner(System.in);
        String number = reader.nextLine();
//        reader.close();
        return number;
    }

    private static int remainsEveryDay(int get, int eat) {
        int remain = get - eat;
        return remain;
    }

    private static int accumulateAtAll(int days, int remain) {
        int accumulate = days * remain;
        return accumulate;
    }

    private static void kitsAndFriends(int kits, int accumulate) {
            //kits = eat
        if (kits <= accumulate) {
            int count = 0;
            for (int i = 1; kits * i <= accumulate; i++) {
                count++;
            }

            int balance = accumulate - count * kits;
            printText("Marius dovanas paruoš " + count + " draugų.");
            printText("Supakavus dovanas liks " + balance + " saldainiai.");

        } else {
            int lack = kits - accumulate;
            printText("Marius per daug suvalge. Kad sudaryti bent viena rinkini truksta " + lack + " saldainiu.");
        }
    }


}

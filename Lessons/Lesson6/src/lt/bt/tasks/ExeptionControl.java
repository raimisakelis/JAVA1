package lt.bt.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExeptionControl {

    public static void main(String[] args) throws FileNotFoundException {

        //res\\txt\\data\\datafile1.txt

        String filePath = readFromConsole();
        printText(filePath);

        //grazinti elementus ir ju skaiciu i konsole
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        int count1 = 0;
        while (scanner.hasNext()) {

            count1++;
            System.out.println(scanner.next());

        }

        System.out.println("elementu skaicius " + count1);
        scanner.close();




    }

    private static String readFromConsole() {

        System.out.println("Iveskite failo kelia (pvz, ..res\\txt\\data\\datafile1.txt: ");
        Scanner reader= new Scanner(System.in);
        String filePath = reader.nextLine();
        reader.close();
        return filePath;
    }


    private static void printText(String text) {
        System.out.println(text);
    }

}

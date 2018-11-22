package lt.bt.testai.uzdaviniai;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pamoka {

    public static void main(String[] args) throws IOException {

        //ask for the data
        System.out.println("Ivesti kiekvienos dienos pamoku skaiciu (pvz, 5 3 1 ..): ");

        //read from console
        String lessonsNumber = readFromConsole();

        //write to file
        writeToFile(lessonsNumber);

        //read from file and return results

        System.out.println("Pamoku skaicius: " + readFromFile()[0]);
        System.out.println("Tai sudaro minuciu: " + readFromFile()[1]);

    }


    private static String readFromConsole() {
        Scanner reader= new Scanner(System.in);
        String elements = reader.nextLine();
        reader.close();
        return elements;
    }

    private static void writeToFile(String information) throws IOException  {
        String fileName = "res\\txt\\demo\\pamoka.txt";
        //String content = information;
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(information);
        //System.out.println("Done");
        bw.close();
        fw.close();

    }

    private static int[] readFromFile() throws IOException {
        String filePath = "res\\txt\\demo\\pamoka.txt";
        File file = new File(filePath);
        Scanner s = new Scanner(file);
        int sum = 0;
        while (s.hasNextInt()) {
             sum += s.nextInt();
        }
        //System.out.println("Count done");
        s.close();

        int time = sum * 45;
        int[] resultsarray = new int[2];
        resultsarray[0] = sum;
        resultsarray[1] = time;

        return resultsarray;
    }

}

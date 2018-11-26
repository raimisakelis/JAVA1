package lt.bt.tasks;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utils {


    public static void printText(String text){System.out.println(text);}

    public static String readFromConsole() {
        Scanner reader= new Scanner(System.in);
        String number = reader.nextLine();
//        reader.close();
        return number;

    }

    public static int[] readFromFile(String filePath) {
        try {
            // count elements quantity
            File f = new File(filePath);
            Scanner s = new Scanner(f);
            int ctr = 0;
            while (s.hasNextInt()) {
                ctr++;
                s.nextInt();
            }

            //create new array with length ctr
            int[] arr = new int[ctr];
            Scanner s1 = new Scanner(f);
            for (int i = 0; i < arr.length; i++)
                arr[i] = s1.nextInt();
            return arr;

        }

        catch (Exception e) {
            return null;
        }
    }

    public static void writeToFile(String information) throws IOException  {
        String fileName = "res\\txt\\demo\\pamoka.txt";
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(information);
        //System.out.println("Done");
        bw.close();
        fw.close();

    }

}

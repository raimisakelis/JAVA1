package lt.bt.tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadCountAndWrite {

    public static void main (String[] args) throws IOException {

        //create new numbers file.

        String filePath = "res\\txt\\demo\\numbersfile.txt";
        File filenumbers = new File(filePath);
        FileWriter fw = new FileWriter(filenumbers);
        BufferedWriter bw = new BufferedWriter(fw);

        int quantitynumbers = 200;
        int number = 1;
        for (int i = 0; i < quantitynumbers; i++) {
            bw.write(String.valueOf(number++) + "\r\n");
        }
        System.out.println("Done");
        bw.close();
        fw.close();

        //read from numbers file and count

        String filePath2 = "res\\txt\\demo\\numbersfile.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath2));
        String st;
        int sum = 0;
        int quantity = 0;
        while ((st = br.readLine()) != null) {
            sum += Integer.parseInt(String.valueOf(st));
            quantity++;
        }
        double avarage = Double.valueOf(sum)/Double.valueOf(quantity);
        br.close();
        System.out.println("Faile esanciu skaiciu suma: " + sum);
        System.out.println("Faile esanciu duomenų kiekis: " + quantity);
        System.out.println("Faile esanciu duomenų vidurkis: " + avarage);

        //write results to new resultsfile

        String filePath3 = "res\\txt\\demo\\resultsfile.txt";
        File fileresults = new File(filePath3);
        FileWriter fw3 = new FileWriter(fileresults);
        BufferedWriter bw3 = new BufferedWriter(fw3);
        bw3.write(String.valueOf(avarage + "\r\n"));
        System.out.println("Task Done");
        bw3.close();
        fw3.close();


    }
}

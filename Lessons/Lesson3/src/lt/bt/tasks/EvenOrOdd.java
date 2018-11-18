package lt.bt.tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EvenOrOdd {

    public static void main (String[] args) throws IOException {

        //read from numbers file

        String filePath = "res\\txt\\demo\\numbersfile.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        //write to file
        String filePath2 = "res\\txt\\demo\\resultsfile2.txt";
        File fileresults2 = new File(filePath2);
        FileWriter fw2 = new FileWriter(fileresults2);
        BufferedWriter bw2 = new BufferedWriter(fw2);

        //read from numbers file while...
        String st;
        while ((st = br.readLine()) != null) {

            if (Integer.parseInt(String.valueOf(st)) % 2 == 0){
                bw2.write(String.valueOf(st) + "- lyginis" + "\r\n");

            } else {
                bw2.write((String.valueOf(st) + "- nelyginis" + "\r\n"));
            }

        }
        br.close();
        System.out.println("Task Done");
        bw2.close();
        fw2.close();




    }
}

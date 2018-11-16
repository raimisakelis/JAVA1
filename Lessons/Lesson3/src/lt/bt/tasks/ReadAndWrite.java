package lt.bt.tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadAndWrite {

    public static void main (String[] args) throws IOException {

        //read from file

        String filePath = "res\\txt\\demo\\sample1.txt";
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));

        //write to file

        String fileWrite = "res\\txt\\demo\\sample2.txt";
        FileWriter fw = new FileWriter(fileWrite);
        BufferedWriter bw = new BufferedWriter(fw);

        String st;
        while ((st = br.readLine()) != null) {
            bw.write(String.valueOf(st) + "\r\n"); // "\r\n" - newLine
        }
        System.out.println("Done");
        br.close();
        bw.close();
        fw.close();





        //code below just to understand how it work

//        //read from file
//
//        String kopijuojamofailokelias = "res\\txt\\demo\\sample1.txt";
//        File naujasfailas = new File(kopijuojamofailokelias);
//        BufferedReader bskaitytuvas = new BufferedReader(new FileReader(naujasfailas));
//
//        //write to file
//
//        String irasomofailokelias = "res\\txt\\demo\\sample2.txt";
//        FileWriter naujasfailas2 = new FileWriter(irasomofailokelias);
//        BufferedWriter brasytuvas = new BufferedWriter(naujasfailas2);
//
//        String st;
//        while ((st = bskaitytuvas.readLine()) != null) {
//            brasytuvas.write(String.valueOf(st) + "\r\n"); // "\r\n" - newLine
//        }
//        System.out.println("Done");
//        bskaitytuvas.close();
//        brasytuvas.close();
//        naujasfailas2.close();


    }
}

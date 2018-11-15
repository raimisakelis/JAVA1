package lt.bt.tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadAndWrite {

    public static void main (String[] args) throws IOException {

//        //read from file

        String filePath = "res\\txt\\demo\\sample1.txt";
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
            String fileName = "res\\txt\\demo\\sample2.txt";
            String content = st;
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            System.out.println("Done");
            bw.close();
            fw.close();
        }
        br.close();
    }

}

package lt.bt.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) throws FileNotFoundException {

        //how to use scanner




        boolean orNumb = true;
        String filePath = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\Lesson3\\src\\lt\\bt\\tasks\\data";
        File file = new File(filePath);
        Scanner scanner = new Scanner(new FileReader(file));



        String[] arrayText = new String[20];
        try {
            Integer.parseInt(scanner.next());
            orNumb = true;


        } catch (NumberFormatException e) {
            orNumb = false;

        }
            if ( !orNumb ) {

                String name = scanner.next();
                System.out.println(name);
            }


        System.out.println("Teksto masyvas " + Arrays.toString(arrayText));




    }
}

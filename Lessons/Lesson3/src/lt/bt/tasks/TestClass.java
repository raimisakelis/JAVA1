package lt.bt.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
public class TestClass {

    public static void main(String[] args) throws FileNotFoundException {

        //how to use scanner





        String filePath = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\Lesson3\\src\\lt\\bt\\tasks\\data";
        File file = new File(filePath);
        Scanner scanner = new Scanner(new FileReader(file));


        String s = scanner.nextLine();
        System.out.println("s reiksme " + s);





//        //veikia, grazina pavadinimus, praleisdamas skaicius ir taskus
//        String[] part = s.split("(\\d+)(.)");
//        System.out.println(part[0]);
//



//        public Temp[] readData(String filePath) throws FileNotFoundException{
//            Temp[] array = null;
//            File file = new File(filePath);
//            Scanner scanner = new Scanner(new FileReader(file));
//            int monthsCount = scanner.nextInt();
//            int measureCount = scanner.nextInt();
//            array = new Temp[monthsCount];
//            for(int i = 0; i < monthsCount; i++){
//                Temp temp = new Temp();
//                String monthName = scanner.next();
//                temp.setMonth(monthName);
//                double[] measures = new double[measureCount];
//                for(int j = 0; j < measureCount; j++){
//                    measures[j] = scanner.nextDouble();
//                }
//                temp.setTemp(measures);
//                array[i] = temp;
//            }
//            scanner.close();
//            return array;
//        }
//














        //veikia, bet float skaiciu perskiria i dvi dalis (po tasko)
        String[] part = s.split("(?<=\\D)(?=\\d)");
        System.out.println(part[0]);
        System.out.println(part[1]);
        System.out.println(part[2]);
        System.out.println(part[3]);
        System.out.println(part[4]);
        System.out.println(part[5]);
        System.out.println(part[6]);










        //example how to use regex

//        //Using "."
//        String[] items = "A.B.C".split(".");
//        System.out.println("Number of items is: " + items.length);
//
//        String[] items2 = "A.B.C".split("");
//        System.out.println("Number of items2 is: " + items2.length);
//
//        //Using "|"
//        String[] items3 = "A|B|C".split("|");
//        System.out.println("Number of items3 is: " + items3.length);
//
//        String[] items4 = "A|B|C".split("");
//        System.out.println("Number of items4 is: " + items4.length);
//
//        //Using "\\."
//        String[] items5 = "A.B.C".split("\\.");
//        System.out.println("Number of items5 is: " + items5.length);
//
//
//        //cases when elements in the returned String array have blank Strings
//        String[] items6 = ",A,B,C".split(",");
//        System.out.println("Number of items6 is: " + items6.length);
//
//        //Suffix - all occurence of the delimiter at the end of the String will be ignored.
//        String[] items7 = "A,B,C,,,,,,,,,,".split(",");
//        System.out.println("Number of items7 is: " + items7.length);
//
//        //count all extra delimiter at the end of the String by passing -1 as limit
//        String[] items8 = "A,B,C,,,".split(",", -1);
//        System.out.println("Number of items8 is: " + items8.length);


//        String example = "A dot is a special character in regular expression syntax. Use Pattern.quote() on the parameter to split(). if you want the split to be on a literal string pattern";
//        String[] part1 = example.split(Pattern.quote("."));
//        System.out.println(part1[0]);
//        System.out.println(part1[1]);
//        System.out.println(part1[2]);
//        System.out.println(part1[3]);
//        System.out.println(part1[4]);



    }
}

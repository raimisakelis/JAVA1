package lt.bt.tasks;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class AverageOfElements {

        public static void main (String[] args) throws IOException {

            String filePath2 = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\Lesson4\\res\\txt\\demo\\elementsofarray";
            int[] data = readFiles(filePath2);
            System.out.println(Arrays.toString(data));

           int sum = 0;
           for (int j = 0; j < data.length; j++) {
              sum += data[j];
          }

          double average = sum / data.length;

           System.out.println("Masyvo elementu suma: " + sum);
          System.out.println("Elementu kiekis masyve: " + data.length);
            System.out.println("Masyvo elementu vidurkis: " + average);
        }


        private static int[] readFiles(String filePath2) {

            try {

                // count elements quantity
                File f = new File(filePath2);
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



    }

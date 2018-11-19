package lt.bt.tasks;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class AverageOfElements {

        public static void main (String[] args) throws IOException {

            //tasks 3 - negative elements of array move to new array

            String filePath2 = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\Lesson4\\res\\txt\\demo\\elementsofarray";
            int[] data = readFiles(filePath2);
            System.out.println("Pradinis masyvas " + Arrays.toString(data));


        //how many negative elements are in the array.

            int negativeQuantity = 0;

            for (int j = 0; j < data.length; j++) {

                if (data[j] < 0) {
                    negativeQuantity++;

                }
            }


            int[] negativeData = new int[negativeQuantity];//new array with length negativeQuantity
            int[] dataWithoutNegative = new int[data.length - negativeQuantity];//new array without negative elements
            int m = 0;
            int n = 0;

            for (int k = 0; k < data.length; k++) {
                if (data[k] < 0) {
                    negativeData[m] = data[k];
                    m++;

                } else {
                    dataWithoutNegative[n] = data[k];
                    n++;
                }
            }

            System.out.println("Neigiamu skaiciu masyvas " + Arrays.toString(negativeData));
//            System.out.println("Likusiu skaiciu masyvas " + Arrays.toString(dataWithoutNegative));

            data = dataWithoutNegative;
            System.out.println("Pradinis masyvas be neigiamu skaiciu " + Arrays.toString(data));


            //tasks 4 - sort both arrays

            for (int r = 0; r < negativeData.length; r++) {
                for (int p = r + 1; p < negativeData.length; p++) {
                    int sk1 = negativeData[r];
                    int sk2 = negativeData[p];
                    if (sk1 > sk2) {
                        negativeData[r] = sk2;
                        negativeData[p] = sk1;
                    }
                }

            }

            System.out.println("Isrikiuotas neigiamu skaiciu masyvas " + Arrays.toString(negativeData));

            for (int a = 0; a < data.length; a++) {
                for (int b = a + 1; b < data.length; b++) {
                    int sk3 = data[a];
                    int sk4 = data[b];
                    if (sk4 < sk3) {
                        data[a] = sk4;
                        data[b] = sk3;
                    }
                }
            }

            System.out.println("Isrikiuotas pradinis masyvas be neigiamu skaiciu " + Arrays.toString(data));




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

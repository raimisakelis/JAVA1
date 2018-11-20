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


        //how many negative and positive elements are in the array "data"
            int negativeQuantity = quantityNegativeElements(data);
            int positiveQuantity = data.length - negativeQuantity;

        //create negative and positive numbers arrays

            int[] negativeArray = negativeElementsArray(data, negativeQuantity);//new array with length negativeQuantity
            int[] positiveArray = positiveElementsArray(data, positiveQuantity);//new array without negative elements
            data = positiveArray; //write positive numbers into initial array "data"

        //return results
            printText("Neigiamu skaiciu masyvas " + Arrays.toString(negativeArray));
            printText("Pradinis masyvas be neigiamu skaiciu" + Arrays.toString(data));

        //sort array
            sortAscendingOrder("Isrikiuotas masyvas didejimo tvarka", negativeArray);
            sortAscendingOrder("Isrikiuotas masyvas didejimo tvarka", positiveArray);







//            //tasks 4 - sort both arrays
//
//            for (int r = 0; r < negativeData.length; r++) {
////                for (int p = r + 1; p < negativeData.length; p++) {
////                    int sk1 = negativeData[r];
////                    int sk2 = negativeData[p];
////                    if (sk1 > sk2) {
////                        negativeData[r] = sk2;
////                        negativeData[p] = sk1;
////                    }
////                }
////
////            }
//
//            System.out.println("Isrikiuotas neigiamu skaiciu masyvas " + Arrays.toString(negativeData));
//
//            for (int a = 0; a < data.length; a++) {
//                for (int b = a + 1; b < data.length; b++) {
//                    int sk3 = data[a];
//                    int sk4 = data[b];
//                    if (sk4 < sk3) {
//                        data[a] = sk4;
//                        data[b] = sk3;
//                    }
//                }
//            }
//
//            System.out.println("Isrikiuotas pradinis masyvas be neigiamu skaiciu " + Arrays.toString(data));

        }



    //return text
        private static void printText(String text) {System.out.println(text);}

        //return text and array
        private static void  sortAscendingOrder(String text, int[] array) {
            for (int r = 0; r < array.length; r++) {
                for (int p = r + 1; p < array.length; p++) {
                    int sk1 = array[r];
                    int sk2 = array[p];
                    if (sk1 > sk2) {
                        array[r] = sk2;
                        array[p] = sk1;
                    }
                }
            }

            System.out.println(text + " " +  Arrays.toString(array));
        }

        //this function count negative elements of the array
        private static int quantityNegativeElements(int[] array) {
            int quantity = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < 0) {
                    quantity++;
                }
            }

            return quantity;
        }


        //this function writing negative elements into new array
        private static int[] negativeElementsArray(int[] initialArray, int newArrayLength) {
            int m = 0;
            int[] negativeArray = new int[newArrayLength];
            for (int k = 0; k < initialArray.length; k++) {
                if (initialArray[k] < 0) {
                    negativeArray[m] = initialArray[k];
                    m++;
                }
            }
                return negativeArray;
        }

        //this function writing positive elements into new array
        private static int[] positiveElementsArray(int[] initialArray, int newArrayLength) {
            int n = 0;
            int[] positiveArray = new int[newArrayLength];
            for (int k = 0; k < initialArray.length; k++) {
                if (initialArray[k] >= 0) {
                    positiveArray[n] = initialArray[k];
                    n++;
                }
            }
            return positiveArray;
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

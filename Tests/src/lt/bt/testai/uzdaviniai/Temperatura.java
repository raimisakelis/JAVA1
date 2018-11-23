package lt.bt.testai.uzdaviniai;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        //number format
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.UK);
        nf.setMaximumFractionDigits(1);
        //nf.setMinimumIntegerDigits(1);

        //example number format
        double input = 32.123456;
        System.out.println("double : " + input);
        System.out.println("double : " + nf.format(input));



        //data file path
        String filePath = "res\\txt\\demo\\duomenys.txt";

        //read data from file
        String[] temperature = readFromFile(filePath);

        printText("Temperaturu masyvas " + Arrays.toString(temperature));

        //count difference of temperature
        String[] differenceTemp = differenceOfTemperature(temperature);

        printText("Temperaturu skirtumu masyvas " + Arrays.toString(differenceTemp));



    }

    private static void printArray(int i, int[] array){
        if(i < array.length){
            System.out.println(array[i]);
            i = i + 1;
            printArray(i, array);
        }
    }






    private static String absoluteValue(String[] diffArray) {

        int i = 0;
        if (i < diffArray. length) {
            double number1 = Math.abs(Double.parseDouble(diffArray[0]));
            double number2 = Math.abs(Double.parseDouble(diffArray[i]));

            if (number2 > number1) {
                number1 = number2;

            }

            i++;
        }


        return String.valueOf(0);
    }





    private static void printText(String text) {System.out.println(text);}

    private static String[] readFromFile(String filePath){

        try {
            // count elements quantity
            File f = new File(filePath);
            Scanner s = new Scanner(f);
            int ctr = 0;
            while (s.hasNext()) {
                ctr++;
                s.next();
            }
            printText("Counting done. Elements number " + ctr);

            //create new array with length ctr
            String[] tempArray = new String[ctr];
            Scanner s1 = new Scanner(f);
            for (int i = 0; i < tempArray.length; i++) {
                tempArray[i] = s1.next();
            }
            printText("Writing done.");
            return tempArray;

        } catch (Exception e) {
            return null;
        }
    }



    private static String[] differenceOfTemperature (String[] arrayTemp){

        String[] tempDifference = new String[arrayTemp.length / 2];
        for (int i = 0, j = 0; i < arrayTemp.length / 2; i++) {

            BigDecimal d = new BigDecimal(arrayTemp[j]).subtract(new BigDecimal(arrayTemp[j+1]));
            tempDifference[i] = String.valueOf(d);
            j += + 2;
        }

        printText("Difference of temperature done");
        return tempDifference;
    }


}

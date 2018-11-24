package lt.bt.testai.uzdaviniai;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) throws IOException {

        //data file path
        String readFilePath = "res\\txt\\demo\\duomenys.txt";

        //read data from file
        String[] temperature = readFromFile(readFilePath);
        printText("Temperaturu masyvas " + Arrays.toString(temperature));

        //count difference of temperature
        String[] differenceTemp = differenceOfTemperature(temperature);
        printText("Temperaturu skirtumu masyvas " + Arrays.toString(differenceTemp));

        //max absolute value
        String maxAbsolute = absoluteValue(differenceTemp);
        printText("Didziausias temperaturos pokytis  " + maxAbsolute);

        //the number of data
        int numberOfData = getElementsQuantity(readFilePath);

        //results array
        String[] arrayResults = resultsArray(numberOfData, temperature, differenceTemp);
        printText("Rezultatu masyvas: " + Arrays.toString(arrayResults));

        //write to file
        writeToFile(arrayResults);



    }

    private static void writeToFile(String[] resultsData) throws IOException {
        String fileName = "res\\txt\\demo\\results.txt";
        //String content = "This is the content to write into file\n";
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);

        for(int i =0; i < resultsData.length; i++ ) {
            bw.write(resultsData[i] + "\n");

        }

        System.out.println("Done");
        bw.close();
        fw.close();
    }

    //method print text
    private static void printText(String text) {System.out.println(text);}

    //count the number of data (file)
    private static int getElementsQuantity(String readFilePath) throws IOException{

            File f = new File(readFilePath);
            Scanner s = new Scanner(f);
            int ctr = 0;
            while (s.hasNext()) {
                ctr++;
                s.next();
            }
            return ctr;

    }


    //read data from file and create new array
    private static String[] readFromFile(String readFilePath){

        try {
            //create new array
            int dataNumb = getElementsQuantity(readFilePath);
            String[] tempArray = new String[dataNumb];
            File f = new File(readFilePath);
            Scanner s = new Scanner(f);
            for (int i = 0; i < tempArray.length; i++) {
                tempArray[i] = s.next();
            }

            return tempArray;

        } catch (Exception e) {
            return null;
        }
    }


    //count difference of temperature and create new array
    private static String[] differenceOfTemperature (String[] arrayTemp){

        String[] tempDifference = new String[arrayTemp.length - 1];
        for (int i = 0, j = 0; i < arrayTemp.length - 1; i++, j++) {
            BigDecimal d = new BigDecimal(arrayTemp[j]).subtract(new BigDecimal(arrayTemp[j+1]));
            tempDifference[i] = String.valueOf(d);
        }

        return tempDifference;
    }

    //find max absolute value of difference temperature
    private static String absoluteValue(String[] diffArray) {

        int i = 0;
        double number1 = Math.abs(Double.parseDouble(diffArray[0]));
        if (i < diffArray. length) {
            double number2 = Math.abs(Double.parseDouble(diffArray[i]));
            if (number2 > number1) {
                number1 = number2;
            }

            i++;
        }

        return String.valueOf(number1);
    }

    //results write to array
    private static String[] resultsArray(int numbData, String[] tempArray, String[] diffArray) {
        String[] resultsArray = new String[tempArray.length +  diffArray.length + 3];
        int d = resultsArray.length - 3;
        try {
            //write to results array temperature
            for (int i = 0; i <  tempArray.length; i++) {
                resultsArray[i*2] = tempArray[i];
            }
            //write to results array difference temperature
            for (int j = 0; j < diffArray.length; j++) {
                //if is required to add a + character
                BigDecimal z = new BigDecimal(diffArray[j]);
                if (Double.valueOf(String.valueOf(z)) >= 0) {
                    resultsArray[j*2+1] = "    (+" + diffArray[j] + ")";

                } else {
                    resultsArray[j*2+1] = "    (" + diffArray[j] + ")";
                }
            }

        }   finally {
            //finally three results array elements
            resultsArray[d] = "----------------";
            printText(resultsArray[d]);

            resultsArray[++d] = "Dienu skaicius: " + numbData;
            printText(resultsArray[d]);

            resultsArray[++d] = "Didžiausias temperatūros pokytis: " + absoluteValue(diffArray);
            printText(resultsArray[d]);

        }

        return resultsArray;

    }


}

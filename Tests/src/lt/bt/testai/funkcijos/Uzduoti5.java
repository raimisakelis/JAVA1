package lt.bt.testai.funkcijos;

import java.util.Scanner;

public class Uzduoti5 {

    public static void main(String[] args) {

    int[] myArray = {3, 4, 5, 7, 4, 22, 11, 3, 5, 6, 6};

    int number = readFromSreen();

    int count = equalNumber(number, myArray);
    prinText(number, count);



    }

    private static int readFromSreen () {
        System.out.println("Iveskite skaiciu: ");
        Scanner reader= new Scanner(System.in);
        int myNumber = reader.nextInt();
        reader.close();
        return myNumber;
    }


    private static int equalNumber(int myNumber, int[] array) {
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if (myNumber == array[i]) {
                count++;

            }
        }
        return count;
    }


    private static void prinText(int number, int count) {
        if (count == 0) {
            System.out.println("Skacius " + number + " masyve nerastas. Pasikartojimu skaicius " + count);
        } else {
            System.out.println("Skacius " + number + " masyve pasikartoja " + count + " kartu");
        }
    }
}

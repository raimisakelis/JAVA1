package lt.bt.testai.masyvai;

public class Uzduotis4 {

    public static void main(String[] args) {

        int[] numbersArray = {3, 5, 7, 34, 1, 3, 6, 8, 8, 5};

        for (int i = 0; i < numbersArray.length; i++) {
            int quantity = 0;
            for (int j = 0; j < numbersArray.length; j++) {
                if (numbersArray[i] == numbersArray[j]) {
                    quantity++;
                }
            }

            System.out.println(numbersArray[i] + " - " + quantity++);

        }

    }
}

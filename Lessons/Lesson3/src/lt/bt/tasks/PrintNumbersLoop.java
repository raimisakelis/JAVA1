package lt.bt.tasks;

public class PrintNumbersLoop {

    public static void main(String[] args) {


        //for loop
        for (int i = 0; i < 100; i++) {
            int number = 1;
            number += i;
            System.out.println("number" + number);
        }

        //while loop
        int j = 0;
        while(j < 100){
            int number1 = 1;
            number1 += j;
            System.out.println("number1 " + number1);
            j++;
        }


        //do while loop
        int k = 0;
        do{
            int number3 = 1;
            number3 += k;
            k++;
            System.out.println("number3 " + number3);
        }while (k < 100);


        //do while loop (another way)
        int number4 = 0, l = 0;
        do{
            number4++;
            l++;
            System.out.println("number4 " + number4);
        }while (l < 100);


    }

}

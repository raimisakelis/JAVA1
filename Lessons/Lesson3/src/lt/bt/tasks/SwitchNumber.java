package lt.bt.tasks;

import java.util.Scanner;

public class SwitchNumber {

    public static void main (String[] args) {

        System.out.println("Iveskite skaiciu: ");
        Scanner reader= new Scanner(System.in);
        String skaicius = reader.nextLine();


        boolean arSkaicius = true;
        //check if int
        try {
            Integer.parseInt(skaicius);
            arSkaicius = true;

        } catch(NumberFormatException e){
            //not int
            arSkaicius = false;
        }


        if (arSkaicius == true) {
            switch(Integer.parseInt(skaicius)){
                case 1:
                    System.out.println("vienas");
                    break;
                case 2:
                    System.out.println("du");
                    break;
                case 3:
                    System.out.println("trys");
                    break;
                case 4:
                    System.out.println("keturi");
                    break;

                default:
                    System.out.println("Skacius neapibreztas");
            }
            System.exit(0);
        }



        switch(skaicius){
            case "vienas":
                System.out.println("1");
                break;
             case "du":
                System.out.println("2");
                break;
            case "trys":
                System.out.println("3");
                break;
            case "keturi":
                System.out.println("4");
                break;

            default :
                System.out.println("Skacius neapibreztas");
        }

    }
}

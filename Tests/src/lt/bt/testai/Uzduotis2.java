package lt.bt.testai;

import java.util.Scanner;

public class Uzduotis2 {

    public static void main(String[] args) {
        System.out.println("Nurodykite kokie dabar metai: ");
        Scanner reader= new Scanner(System.in);
        String dmetai = reader.nextLine();
        System.out.println("Iveskite savo gimimo metus: ");
        Scanner reader1= new Scanner(System.in);
        String metai = reader1.nextLine();

        boolean arSkaicius = true;
        //check if int
        try{
            Integer.parseInt(dmetai);
            Integer.parseInt(metai);
            arSkaicius = true;

        }catch(NumberFormatException e){
            //not int
            arSkaicius = false;
        }

        if (!arSkaicius) {
            System.out.println("Kazkuriame lauke ivestas ne skaicius, bandykite dar karta");
            System.exit(0);
        }



        int kiekmetu = (Integer.parseInt(dmetai)) - (Integer.parseInt(metai));;

        if (kiekmetu < 18) {
            System.out.println("Jums yra " + kiekmetu + " metai . Jus nepilnametis");

        } else if (18 <= kiekmetu && kiekmetu < 130) {
            System.out.println("Jums yra " + kiekmetu + " metai . Jus pilnametis");
        } else {
            System.out.println("Jus tikriausiai juokaujate ?!!! :D");
        }

        reader.close();
        reader1.close();
    }

}

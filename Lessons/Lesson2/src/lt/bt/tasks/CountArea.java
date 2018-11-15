package lt.bt.tasks;

public class CountArea {

    public static void main (String[] args) {

//        trikampio plotas

        int krast1 = 3;
        int krast2 = 2;
        int krast3 = 3;
        double pusper = (krast1 + krast2 + krast3) / 2;


        if(krast1 < krast2 + krast3 && krast2 < krast1 + krast3 && krast3 < krast1 + krast2){
            double plotas =  Math.sqrt(pusper * (pusper - krast1) * (pusper - krast2) * (pusper - krast3));
            System.out.println(plotas);
        } else {
            System.out.println("Trikampio sudaryti negalima");
        }


//        staciakampio plotas

        int stkrast1 = 2; // st - staciakmpio krastines ilgis
        int stkrast2 = 2;
        int stkrast3 = 2;
        int stkrast4 = 2;
        int stperim = stkrast1 + stkrast2 + stkrast3 + stkrast4; //stperim - staciakampio perimetras

        if (stkrast1 == stkrast2 && stkrast1 == stkrast3 && stkrast1 == stkrast4) {
            double kvplotas = Math.pow(stkrast1, 2); //kvplotas - kvadrato plotas
            System.out.println("Kvadrato plotas: " + kvplotas);
        }   else if (stkrast1 == stkrast3 && stkrast2 == stkrast4 && stkrast1 != stkrast2) {
            double stplotas = (((stperim / 2) - stkrast1) * stkrast1); //stplotas - staciakampio plotas
            System.out.println("Stačiakampio plotas: " + stplotas);
        } else {
            System.out.println("Keturkampio plotą žino tik pats Dievas!");
        }


//        Skritulio plotas

        int skR = 5; //skR - skritulio spindulys
        float pi = 3.14159f; //pi - pi reiksme
        double skplotas = pi * Math.pow(skR, 2);

        System.out.println(skplotas);

//        Kvadratine lygtis

        int a = 1;
        int b = 2;
        int c = 0;
//        kvadratine lygtis ax^2 + bx + c = 0


        double diskrim = (Math.pow(b, 2) - 4 * a * c);

        if (diskrim > 0 && a != 0) {
            double x1 = ((-b + Math.sqrt(diskrim)) / 2 * a);
            double x2 = ((-b - Math.sqrt(diskrim)) / 2 * a);
            System.out.println("Lygties sprendiniai: x1 = " + x1 + " " + "x2 = " + x2 );
        } else if (diskrim == 0 && a != 0) {
            double x = -(b / 2 *a);
            System.out.println("Lygties sprendinys: x = " + x );
        } else if (diskrim < 0 && a != 0){
            double reald = -(b / (2 * a));
            double mend = ((Math.sqrt(Math.abs(diskrim))) / (2 * a));
            String s = "±";
            System.out.println("Lygties sprendiniai: x1,2 = " +  reald + " " + s + " i" + mend);
        } else {
            System.out.println("Jeigu koeficientas a = 0, tuomet tai tiesine lygtis");
        }

    }
}

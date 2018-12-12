package lt.bt.task;

import lt.bt.task.data.Case;
import lt.bt.task.data.Kid;

import java.util.Iterator;
import java.util.List;

public class KidCalc extends Kid {



    //return kid's behavior
    public static Case behavior(Kid kid) {
        String behavior = kid.getKidsBehavior().toUpperCase();
        switch (behavior) {
            case "GERAS":
                return Case.GERAS;
            case "GERA":
                return Case.GERA;
            case "BLOGAS":
                return Case.BLOGAS;
            case "BLOGA":
                return Case.BLOGA;
            default:
                System.out.println("Senelis nesuprato ar vaikas nusipelno dovanu");
                return null;
        }
    }


    //separate kids who are over 15 years old
    public static List<Kid> separateKids(List<Kid> allKids) {
        Iterator<Kid> iterator = allKids.iterator();
        while (iterator.hasNext()) {
            Kid kid = iterator.next();
            if (kid.getKidsAges() > 15) {
                iterator.remove();
            }
        }
        return allKids;
    }


    //find child
    public static boolean compareKidsName(Kid kidOne, Kid kidTwo) {
        boolean kidFound = false;
            if (kidOne.getKidsName().equals(kidTwo.getKidsName()) &&
                    kidOne.getKidsLastName().equals(kidTwo.getKidsLastName())) {
                kidFound = true;
                //System.out.println("Vaikas rastas: " + kid.getKidsName() + " " +kid.getKidsLastName());
            }

        return kidFound;
    }


}

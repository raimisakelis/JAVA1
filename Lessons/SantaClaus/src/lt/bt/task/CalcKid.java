package lt.bt.task;

import lt.bt.task.data.Behavior;
import lt.bt.task.data.Kid;

import java.util.Iterator;
import java.util.List;

public class CalcKid extends Kid {

    //return kid's behavior
    public static Behavior convertBehavior (String kidsBehavior){
        Behavior behavior = null;
        String kidsBehaviorLower = kidsBehavior.toLowerCase();
        if(kidsBehaviorLower.equals("geras")){
            behavior = Behavior.GERAS;
        } else if(kidsBehaviorLower.equals("gera")){
            behavior = Behavior.GERA;
        } else if(kidsBehaviorLower.equals("blogas")){
            behavior = Behavior.BLOGAS;
        } else if(kidsBehaviorLower.equals("bloga")){
            behavior = Behavior.BLOGA;
        }
        return behavior;
    }


    //separate kids who are over 15 years old
    public List<Kid> separateKids(List<Kid> allKids) {
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

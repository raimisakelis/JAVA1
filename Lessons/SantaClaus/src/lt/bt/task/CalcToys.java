package lt.bt.task;

import lt.bt.task.data.Behavior;
import lt.bt.task.data.Kid;
import lt.bt.task.data.Toy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CalcToys {

    private static final String CARBON = "Anglių maišas";


    //count needed toys and carbon bags
    public Map<String,Integer> countNeededToysAndCarbon(List<Kid> littleKids, List<Kid> kidsCharacter) {
        Map<String, Integer> neededToysList = new HashMap<>();//create needed toys list
        Iterator<Kid> iterator = littleKids.iterator();
        while (iterator.hasNext()) {
            Kid kid = iterator.next();
            Iterator<Kid> iterator2 = kidsCharacter.iterator();
            while (iterator2.hasNext()) {
                Kid kidChar = iterator2.next();
                boolean kidFound = CalcKid.compareKidsName(kid, kidChar);//to find kid
                if (kidFound) {
                    //check kid's behavior
                    Behavior kidsBehavior = CalcKid.convertBehavior(kidChar.getKidsBehavior().trim());
                    if (kidsBehavior != null && (kidsBehavior.equals(Behavior.GERAS) || kidsBehavior.equals(Behavior.GERA))) {
                        Toy toy = new Toy();
                        toy.setToyName(kid.getKidsDesire().trim());
                        smartAddToMap(toy.getToyName(),neededToysList);//if kid was good, than add toy to neededToysList
                    }
                    else if (kidsBehavior != null && (kidsBehavior.equals(Behavior.BLOGAS) || kidsBehavior.equals(Behavior.BLOGA))){
                        Toy toy = new Toy();
                        toy.setToyName(CARBON);
                        smartAddToMap(toy.getToyName(),neededToysList);//if kid was bad, add one bag carbon
                    }
                }
            }
        }
        return neededToysList;
    }


    //smart add element into Map list
    public static void smartAddToMap(String name, Map<String, Integer> neededToysList) {
        if( !neededToysList.containsKey( name) ){
            neededToysList.put( name, 1 );
        }
        else {
            neededToysList.put( name, neededToysList.get( name ) + 1 );
        }
    }




//    //smart add toy into Map list
//    public static void addToy(Toy toy, Map<String, Integer> neededToysList) {
//        if( !neededToysList.containsKey( toy.getToyName()) ){
//            neededToysList.put( toy.getToyName(), 1 );
//        }
//        else {
//            neededToysList.put( toy.getToyName(), neededToysList.get( toy.getToyName() ) + 1 );
//        }
//    }



}

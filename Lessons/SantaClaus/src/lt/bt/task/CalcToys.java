package lt.bt.task;

import lt.bt.task.data.Case;
import lt.bt.task.data.Kid;
import lt.bt.task.data.Toy;
import lt.bt.task.data.ToysWrapper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CalcToys {



        //count needed toys and carbon bags
    public static ToysWrapper countNeededToysAndCarbon(List<Kid> littleKids, List<Kid> kidsCharacter) {
        Toy carbon = new Toy();//create carbon bag
        carbon.setToyQuantity(0);
        Map<String, Integer> neededToysList = new HashMap<>();

        Iterator<Kid> iterator = littleKids.iterator();
        while (iterator.hasNext()) {
            Kid kid = iterator.next();
            Iterator<Kid> iterator2 = kidsCharacter.iterator();
            while (iterator2.hasNext()) {
                Kid kidChar = iterator2.next();

                boolean kidFound = KidCalc.compareKidsName(kid, kidChar);//to find kid
                if (kidFound) {

                   //check kid's character

                    if (KidCalc.behavior(kidChar) == Case.GERAS || KidCalc.behavior(kidChar) == Case.GERA) {
                        Toy toy = new Toy();
                        toy.setToyName(kid.getKidsDesire().trim());

                        //add toy to neededToysList
                        if( !neededToysList.containsKey( toy.getToyName()) ){
                            neededToysList.put( toy.getToyName(), 1 );
                        }
                        else {
                            neededToysList.put( toy.getToyName(), neededToysList.get( toy.getToyName() ) + 1 );
                        }

                    }
                    else if (KidCalc.behavior(kidChar) == Case.BLOGAS || KidCalc.behavior(kidChar) == Case.BLOGA){
                        carbon.setCarbonQuantity(carbon.getCarbonQuantity() + 1);//if kid was bad, add one bag carbon
                    }

                }

            }
        }
        ToysWrapper toysAndCarbon = new ToysWrapper();//create wrapper object
        toysAndCarbon.setToyList(neededToysList);//set neededToys list like new object parameter "neededToy"
        toysAndCarbon.setNeededCarbon(carbon);//set carbon like new object parameter "neededCarbon"
        return toysAndCarbon;
    }






}

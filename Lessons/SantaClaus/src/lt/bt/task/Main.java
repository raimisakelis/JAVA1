package lt.bt.task;

import lt.bt.task.data.Kid;
import lt.bt.task.data.Toy;
import lt.bt.task.data.ToysWrapper;

import java.util.*;

import static lt.bt.task.Utils.readKidsBehavior;


public class Main {


    private Toy toy;


    public static void main(String[] args) {

        Main main = new Main();

        String elfsFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\data\\ElfuSandelis.txt";
        String desireFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\data\\VaikuNorai.txt";
        String behaviorFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\data\\VaikoCharakteristika.txt";


        Map<String,Integer> elfToys = StorageReadAndWrite.readElfFile(elfsFile);
        List<Kid> allKids = DesireReadAndWrite.readDesireFile(desireFile);
        List<Kid> behaviorKids = BehaviorRead.readKidsBehavior(behaviorFile);

        //checking
        System.out.println("-------Elfu sandelis------");
        //elf's storage
        for(String key : elfToys.keySet()){
            System.out.print(key);
            System.out.print(" " + elfToys.get(key));
            System.out.println();
        }

        System.out.println("-----Vaiku norai-----");
        //desireKids
        Iterator<Kid> iterator = allKids.iterator();
        while (iterator.hasNext()) {
            Kid kid = iterator.next();
            System.out.println(kid.toString());
        }

        System.out.println("-------Vaiku elgesys-------");
        //behaviorKids
        Iterator<Kid> iterator2 = behaviorKids.iterator();
        while (iterator2.hasNext()) {
            Kid kid = iterator2.next();
            System.out.println(kid.getKidsName() + " " + kid.getKidsLastName() + " " + kid.getKidsBehavior());
        }

        //separate kids who are over than 15 years old
        List<Kid> littleKids = KidCalc.separateKids(allKids);

        //calculate needed toys and carbon bags
        ToysWrapper toysAndCarbon = CalcToys.countNeededToysAndCarbon(littleKids, behaviorKids);

        //needed carbon bags
        Toy neededCarbon = toysAndCarbon.getNeededCarbon();

        //all needed toys
        Map<String,Integer> neededToys = toysAndCarbon.getToyList();


        //checking
        System.out.println("-----Reikalingi zaislai------");
        for(String key : neededToys.keySet()){
            System.out.print(key);
            System.out.print(" " + neededToys.get(key));
            System.out.println();
        }


        System.out.println("Reikes anglies maisu: " + neededCarbon.getCarbonQuantity());








    }






//    private boolean compareToyName(List<Toy> neededToys, Toy kidsToy) {
//        boolean toyFound = false;
//        Iterator<Toy> iterator = neededToys.iterator();
//        while (iterator.hasNext()) {
//            Toy toy = iterator.next();
//            if (toy.getToyName().equals(kidsToy.getToyName())) {
//                toyFound = true;
//            }
//
//        }
//        return toyFound;
//    }
//
//
//
//
//    private int calculateToysQuantity(List<Toy> neededToys, Toy kidToy) {
//        int quantity = 0;
//        Iterator<Toy> iterator = neededToys.iterator();
//        while (iterator.hasNext()) {
//            Toy toy = iterator.next();
//            if (toy.getToyName() == kidToy.getToyName()) {
//                quantity = toy.getToyQuantity() + 1;
//            } else {
//                quantity = 1;
//            }
//        }
//
//        return quantity;
//    }
//
//
//
//
//    //count needed toys and carbon bags
//    private ToysWrapper countNeededToysAndCarbon(List<Kid> littleKids, List<Kid> kidsCharacter) {
//        Toy carbon = new Toy();//create carbon bag
//        carbon.setToyQuantity(0);
//        Map<String, Integer> neededToysList = new HashMap<>();
//
//        Iterator<Kid> iterator = littleKids.iterator();
//        while (iterator.hasNext()) {
//            Kid kid = iterator.next();
//            Iterator<Kid> iterator2 = kidsCharacter.iterator();
//            while (iterator2.hasNext()) {
//                Kid kidChar = iterator2.next();
//                boolean kidFound = compareKidsName(kid, kidChar);//to find kid
//                if (kidFound) {
//                    boolean goodKid = kidsBehavior(kidChar);//check kid's character
//                    if (goodKid) {
//                        Toy toy = new Toy();
//                        toy.setToyName(kid.getKidsDesire().trim());
//
//                        //add toy to neededToysList
//                        if( !neededToysList.containsKey( toy.getToyName()) ){
//                            neededToysList.put( toy.getToyName(), 1 );
//                        } else {
//                            neededToysList.put( toy.getToyName(), neededToysList.get( toy.getToyName() ) + 1 );
//                        }
//
//                    }
//                    else {
//                        carbon.setCarbonQuantity(carbon.getCarbonQuantity() + 1);//if kid was bad, add one bag carbon
//                    }
//                }
//            }
//        }
//        ToysWrapper toysAndCarbon = new ToysWrapper();//create wrapper object
//        toysAndCarbon.setToyList(neededToysList);//set neededToys list like new object parameter "neededToy"
//        toysAndCarbon.setNeededCarbon(carbon);//set carbon like new object parameter "neededCarbon"
//        return toysAndCarbon;
//    }
//
//
//
//
//
//
//
//
//
//    //evaluate the behavior of the child
//    private boolean kidsBehavior(Kid kid) {
//        boolean good = false;
//        if (kid.getKidsBehavior().trim().equals("Geras") || kid.getKidsBehavior().trim().equals("Gera")) {
//            good = true;
//            //System.out.println("VAIKAS GERAS");
//        }
//        return good;
//    }
//
//
//    //does it exist kid?
//    private boolean compareKidsName(Kid littleKid, Kid charakterKid) {
//        boolean kidFound = false;
//            if (littleKid.getKidsName().equals(charakterKid.getKidsName()) &&
//                    littleKid.getKidsLastName().equals(charakterKid.getKidsLastName())) {
//                kidFound = true;
//                //System.out.println("Vaikas rastas: " + kid.getKidsName() + " " +kid.getKidsLastName());
//            }
//
//        return kidFound;
//    }
//
//
//    //separate kids who are over 15 years old
//    private List<Kid> separateKids(List<Kid> allKids) {
//        Iterator<Kid> iterator = allKids.iterator();
//        while (iterator.hasNext()) {
//            Kid kid = iterator.next();
//            if (kid.getKidsAges() > 15) {
//                iterator.remove();
//            }
//        }
//        return allKids;
//    }


























//    //count needed toys and carbon bags
//    private ToysWrapper countNeededToysAndCarbon(List<Kid> littleKids, List<Kid> kidsCharacter) {
//        Toy carbon = new Toy();//create carbon bag
//        carbon.setToyQuantity(0);
//        List<Toy> neededToys = new ArrayList<>();//create new needed toys list
//        Iterator<Kid> iterator = littleKids.iterator();
//        while (iterator.hasNext()) {
//            Kid kid = iterator.next();
//            Iterator<Kid> iterator2 = kidsCharacter.iterator();
//            while (iterator2.hasNext()) {
//                Kid kidChar = iterator2.next();
//                boolean kidFound = compareKidsName(kid, kidChar);//to find kid
//                if (kidFound) {
//                    boolean goodKid = kidsBehavior(kidChar);//check kid's character
//                    if (goodKid) {
//                        Toy toy = new Toy();
//                        toy.setToyName(kid.getKidsDesire().trim());
//                        toy.setToyQuantity(1);
//                        neededToys.add(toy);//add toy to neededToys list
//                    }
//                    else {
//                        carbon.setCarbonQuantity(carbon.getCarbonQuantity() + 1);//if kid was bad, add one bag carbon
//                    }
//                }
//            }
//        }
//        ToysWrapper toysAndCarbon = new ToysWrapper();//create wrapper object
//        toysAndCarbon.setNeededToy(neededToys);//set neededToys list like new object parameter "neededToy"
//        toysAndCarbon.setNeededCarbon(carbon);//set carbon like new object parameter "neededCarbon"
//        return toysAndCarbon;
//    }
//






















}




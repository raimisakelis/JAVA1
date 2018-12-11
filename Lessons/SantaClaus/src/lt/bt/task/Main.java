package lt.bt.task;

import lt.bt.task.data.Kid;
import lt.bt.task.data.Toy;
import lt.bt.task.data.ToysWrapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Main main = new Main();

        String elfsFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\data\\ElfuSandelis.txt";
        String kidsFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\data\\VaikuNorai.txt";
        String behaviorFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\data\\VaikoCharakteristika.txt";


        List<Toy> elfToy = Utils.readElfFile(elfsFile);
        List<Kid> allKids = Utils.readKidsDesireFile(kidsFile);
        List<Kid> kidCharacter = Utils.readKidsBehavior(behaviorFile);

        //separate kids who are over than 15 years old
        List<Kid> littleKids = main.separateKids(allKids);


//        Iterator<Kid> iterator = littleKids.iterator();
//        while (iterator.hasNext()) {
//            Kid kid = iterator.next();
//            System.out.println(kid.toString());
//        }


        //found kids
//        boolean kidFound = main.compareKidsName(littleKids.get(0), kidCharacter.get(0));
//
//        if(kidFound) {
//            System.out.println("Vaikas sarase rastas");
//        } else {
//            System.out.println("Vaiko sarase nera");
//        }


        //kids good or bad?
//        boolean kidGood = main.kidsBehavior(kidCharacter.get(2));
//
//        if(kidGood) {
//            System.out.println("Vaikas geras/a");
//        } else {
//            System.out.println("Vaikas elgesi blogai");
//        }








        ToysWrapper allNeededItems = main.countNeededToysAndCarbon(littleKids, kidCharacter);

        List<Toy> neededToys = allNeededItems.getNeededToy();
        Toy neededCarbon = allNeededItems.getNeededCarbon();



        Iterator<Toy> iterator = neededToys.iterator();
        while (iterator.hasNext()) {
            Toy toy = iterator.next();
            System.out.println(toy.toString());
        }

        System.out.println("Reikes anglies maisu: " + neededCarbon.getCarbonQuantity());


//        Iterator<Kid> iterator = littleKids.iterator();
//        while (iterator.hasNext()) {
//            Kid kid = iterator.next();
//            System.out.println(kid.toString());
//        }


    }






    private boolean compareToyName(List<Toy> neededToys, Toy kidsToy) {
        boolean toyFound = false;
        Iterator<Toy> iterator = neededToys.iterator();
        while (iterator.hasNext()) {
            Toy toy = iterator.next();
            if (toy.getToyName().equals(kidsToy.getToyName())) {
                toyFound = true;
            }

        }
        return toyFound;
    }




    private int calculateToysQuantity(List<Toy> neededToys, Toy kidToy) {
        int quantity = 0;
        Iterator<Toy> iterator = neededToys.iterator();
        while (iterator.hasNext()) {
            Toy toy = iterator.next();
            if (toy.getToyName() == kidToy.getToyName()) {
                quantity = toy.getToyQuantity() + 1;
            } else {
                quantity = 1;
            }
        }

        return quantity;
    }
















    //count needed toys and carbon bags
    private ToysWrapper countNeededToysAndCarbon(List<Kid> littleKids, List<Kid> kidsCharacter) {
        Toy carbon = new Toy();//create carbon bag
        carbon.setToyQuantity(0);
        List<Toy> neededToys = new ArrayList<>();//create new needed toys list
        Iterator<Kid> iterator = littleKids.iterator();
        while (iterator.hasNext()) {
            Kid kid = iterator.next();
            Iterator<Kid> iterator2 = kidsCharacter.iterator();
            while (iterator2.hasNext()) {
                Kid kidChar = iterator2.next();
                boolean kidFound = compareKidsName(kid, kidChar);//to find kid
                if (kidFound) {
                    boolean goodKid = kidsBehavior(kidChar);//check kid's character
                    if (goodKid) {
                        Toy toy = new Toy();
                        toy.setToyName(kid.getKidsDesire().trim());
                        toy.setToyQuantity(1);
                        neededToys.add(toy);//add toy to neededToys list
                    }
                    else {
                        carbon.setCarbonQuantity(carbon.getCarbonQuantity() + 1);//if kid was bad, add one bag carbon
                    }
                }
            }
        }
        ToysWrapper toysAndCarbon = new ToysWrapper();//create wrapper object
        toysAndCarbon.setNeededToy(neededToys);//set neededToys list like new object parameter "neededToy"
        toysAndCarbon.setNeededCarbon(carbon);//set carbon like new object parameter "neededCarbon"
        return toysAndCarbon;
    }


    //evaluate the behavior of the child
    private boolean kidsBehavior(Kid kid) {
        boolean good = false;
        if (kid.getKidsBehavior().trim().equals("Geras") || kid.getKidsBehavior().trim().equals("Gera")) {
            good = true;
            //System.out.println("VAIKAS GERAS");
        }
        return good;
    }


    //does it exist kid?
    private boolean compareKidsName(Kid littleKid, Kid charakterKid) {
        boolean kidFound = false;
            if (littleKid.getKidsName().equals(charakterKid.getKidsName()) &&
                    littleKid.getKidsLastName().equals(charakterKid.getKidsLastName())) {
                kidFound = true;
                //System.out.println("Vaikas rastas: " + kid.getKidsName() + " " +kid.getKidsLastName());
            }

        return kidFound;
    }


    //separate kids who are over 15 years old
    private List<Kid> separateKids(List<Kid> allKids) {
        Iterator<Kid> iterator = allKids.iterator();
        while (iterator.hasNext()) {
            Kid kid = iterator.next();
            if (kid.getKidsAges() > 15) {
                iterator.remove();
            }
        }
        return allKids;
    }




}




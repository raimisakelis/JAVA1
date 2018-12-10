package lt.bt.task;

import lt.bt.task.Utils;
import lt.bt.task.data.Kid;
import lt.bt.task.data.Toy;
import lt.bt.task.data.ToysWraper;
import lt.bt.task.data.UseBehavior;

import java.io.FileNotFoundException;
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
        List<Kid> kidBehavior = Utils.readKidsBehavior(behaviorFile);


        List<Kid> littleKids = main.separateKids(allKids);

        ToysWraper allNeededItems = main.countNeededToys(littleKids, kidBehavior);

        List<Toy> neededToys = allNeededItems.getNeededToy();
        Toy neededCarbon = allNeededItems.getNeededCarbon();



        Iterator<Toy> iterator = neededToys.iterator();
        while (iterator.hasNext()) {
            Toy toy = iterator.next();
            System.out.println(toy.toString());
        }

        System.out.println("Reikes anglies maisu: " + neededCarbon);












//        Iterator<Kid> iterator = littleKids.iterator();
//        while (iterator.hasNext()) {
//            Kid kid = iterator.next();
//            System.out.println(kid.toString());
//        }







    }
//monster :D
//    private ToysWraper countNeededToys(List<Kid> littleKids, List<Kid> kidsCharacter) {
//        boolean kidFound = compareKidsName(littleKids, kidsCharacter);
//
//        Toy carbon = new Toy();
//        List<Toy> neededToys = new ArrayList<Toy>();
//        Iterator<Kid> iterator = littleKids.iterator();
//        Iterator<Kid> iterator2 = kidsCharacter.iterator();
//
//        while (iterator.hasNext()) {
//            Kid kid = iterator.next();
//            while (iterator2.hasNext()) {
//                Kid kidChar = iterator2.next();
//                if(kidFound) {
//                    boolean goodKid = kidsBehavior(kidChar);
//                    if(goodKid) {
//                        Toy toy = new Toy();
//                        if(neededToys.size() == 0) {
//                            toy.setToyName(kid.getKidsDesire());
//                            toy.setToyQuantity(1);
//                            neededToys.add(toy);
//
//                        } else {
//                            boolean toyFound = compareToyName(neededToys,toy);
//                            if(toyFound) {
//                                toy.setToyName(kid.getKidsDesire());
//                                int quantityToys = calculateToysQuantity(neededToys, toy);
//                                toy.setToyQuantity(quantityToys);
//                                neededToys.add(toy)
//                            }
//
//
//                        }
//
//
//                       ;
//
//                        System.out.println(toy.getToyName() + " " + toy.getToyQuantity());
//
//                    } else {
//                        carbon.setCarbonQuantity(carbon.getCarbonQuantity() + 1);
//
//                    }
//                }
//            }
//        }
//        System.out.println("Reikes anglies maisu: " + carbon.getCarbonQuantity());
//        ToysWraper toysAndCarbon = new ToysWraper();
//        toysAndCarbon.setNeededToy(neededToys);
//        toysAndCarbon.setNeededCarbon(carbon);
//
//       return toysAndCarbon;
//    }







    private int calculateToysQuantity(List<Toy> neededToys, Toy kidToy) {
        int quantity = 0;
        Iterator<Toy> iterator = neededToys.iterator();
        while (iterator.hasNext()) {
            Toy toy = iterator.next();
            if(toy.getToyName() == kidToy.getToyName()){
               quantity = toy.getToyQuantity() + 1;
            } else {
                quantity = 1;
            }
        }

        return quantity;
    }







        public boolean kidsBehavior (Kid kid) {
        boolean good = false;
            if(kid.getKidsBehavior() == "Geras" || kid.getKidsBehavior() == "Gera") {
                good = true;
            }
        return good;
    }





    private boolean compareToyName(List<Toy> neededToys, Toy kidsToy) {
        boolean toyFound = false;
        Iterator<Toy> iterator = neededToys.iterator();
        while (iterator.hasNext()) {
            Toy toy = iterator.next();
                if(toy.getToyName().equals(kidsToy.getToyName())) {
                    toyFound = true;
                }

        }
        return toyFound;
    }













    private boolean compareKidsName(List<Kid> littleKids, List<Kid> kidsCharacter) {
        boolean kidFound = false;
        Iterator<Kid> iterator = littleKids.iterator();
        Iterator<Kid> iterator2 = kidsCharacter.iterator();
        while (iterator.hasNext()) {
            Kid kid = iterator.next();
            while (iterator2.hasNext()) {
                Kid kidChar = iterator2.next();
                if(kid.getKidsName().equals(kidChar.getKidsName()) &&
                        kid.getKidsLastName().equals(kidChar.getKidsLastName())) {
                    kidFound = true;
                }
            }
        }
        return kidFound;
    }













    //separate kids who are over 15 years old
    private List<Kid> separateKids(List<Kid> allKids) {
        Iterator<Kid> iterator = allKids.iterator();
        while (iterator.hasNext()) {
            Kid kid = iterator.next();
            if(kid.getKidsAges() > 15) {
                iterator.remove();
            }
        }
        return allKids;
    }




}



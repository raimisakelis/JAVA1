package lt.bt.task;

import lt.bt.task.data.Kid;
import lt.bt.task.data.Toy;

import java.util.List;
import java.util.Map;


public class Main {


    private Toy toy;


    public static void main(String[] args) {

        Main main = new Main();

        String elfsFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\data\\ElfuSandelis.txt";
        String desireFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\data\\VaikuNorai.txt";
        String behaviorFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\data\\VaikoCharakteristika.txt";

        //create needed objects
        StorageReadAndWrite storageRW = new StorageReadAndWrite();
        DesireReadAndWrite desireRW = new DesireReadAndWrite();
        BehaviorRead behaviorR = new BehaviorRead();
        CalcToys calcToys = new CalcToys();
        CalcKid calcKid = new CalcKid();

        //read data from files
        Map<String,Integer> elfToys = storageRW.readElfFile(elfsFile);//read data from "ElfuSandelis"
        List<Kid> allKids = desireRW.readDesireFile(desireFile);//read data from "VaikuNorai"
        List<Kid> behaviorKids = behaviorR.readKidsBehavior(behaviorFile);//read data from "VaikoCharakteristika"

        //separate kids who are over than 15 years old
        List<Kid> littleKids = calcKid.separateKids(allKids);

        //calculate needed toys and carbon bags
        Map<String,Integer> neeedToysAndCarbon= calcToys.countNeededToysAndCarbon(littleKids, behaviorKids);






        //checking
        System.out.println("-------Elfu sandelis------");
        //elf's storage
        for(String key : elfToys.keySet()){
            System.out.print(key);
            System.out.print(" " + elfToys.get(key));
            System.out.println();
        }

        //checking
        System.out.println("-----Reikalingi zaislai------");
        for(String key : neeedToysAndCarbon.keySet()){
            System.out.print(key);
            System.out.print(" " + neeedToysAndCarbon.get(key));
            System.out.println();
        }








//        System.out.println("-----Vaiku norai-----");
//        //desireKids
//        Iterator<Kid> iterator = allKids.iterator();
//        while (iterator.hasNext()) {
//            Kid kid = iterator.next();
//            System.out.println(kid.toString());
//        }

//        System.out.println("-------Vaiku elgesys-------");
//        //behaviorKids
//        Iterator<Kid> iterator2 = behaviorKids.iterator();
//        while (iterator2.hasNext()) {
//            Kid kid = iterator2.next();
//            System.out.println(kid.getKidsName() + " " + kid.getKidsLastName() + " " + kid.getKidsBehavior());
//        }


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









}




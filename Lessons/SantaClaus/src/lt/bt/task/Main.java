package lt.bt.task;

import lt.bt.task.data.Kid;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Main {



    public static void main(String[] args) throws IOException {
        //data files paths
        String storageFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\data\\ElfuSandelis.txt";
        String desireFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\data\\VaikuNorai.txt";
        String behaviorFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\data\\VaikoCharakteristika.txt";

        //results files paths
        String orderResultsFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\out\\ElfuUzsakymai";
        String deliveryResultsFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\out\\KalėduSenelioPristatymai";
        String wasteToysResultsFile = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\out\\ZaislaiIsarymui";



        //create needed objects
        StorageReadAndWrite storageRW = new StorageReadAndWrite();
        DesireReadAndWrite desireRW = new DesireReadAndWrite();
        BehaviorRead behaviorR = new BehaviorRead();
        CalcToys calcToys = new CalcToys();
        CalcKid calcKid = new CalcKid();

        //read data from files
        Map<String,Integer> elfToys = storageRW.readElfFile(storageFile);//read data from "ElfuSandelis"
        List<Kid> allKids = desireRW.readDesireFile(desireFile);//read data from "VaikuNorai"
        List<Kid> behaviorKids = behaviorR.readKidsBehavior(behaviorFile);//read data from "VaikoCharakteristika"

        //separate kids who are over than 15 years old
        List<Kid> littleKids = calcKid.separateKids(allKids);

        //calculate needed toys and carbon bags
        Map<String,Integer> neeedToysAndCarbon = calcToys.countNeededToysAndCarbon(littleKids, behaviorKids);

        //create Santa Claus delivery list
        List<Kid> deliveryList = calcToys.createDeliveryList(littleKids, behaviorKids);

        //create order list for elves
        Map<String,Integer> ordersList = calcToys.createOrderList(elfToys,neeedToysAndCarbon);

        //create not needed toys list
        Map<String,Integer> wasteToysList = calcToys.createWasteToysList(elfToys,neeedToysAndCarbon);

        //write order list into file
        storageRW.writeMapToFile(orderResultsFile,ordersList);

        //write Santa Claus delivery list into file
        desireRW.writeListToFile(deliveryResultsFile,deliveryList);

        //write order list into file
        storageRW.writeMapToFile(wasteToysResultsFile,wasteToysList);





//        //checking
//        System.out.println("-------Elfu sandelis------");
//        //elf's storage
//        for(String key : elfToys.keySet()){
//            System.out.print(key);
//            System.out.print(" " + elfToys.get(key));
//            System.out.println();
//        }
//
//        //checking
//        System.out.println("-----Reikalingi zaislai------");
//        for(String key : neeedToysAndCarbon.keySet()){
//            System.out.print(key);
//            System.out.print(" " + neeedToysAndCarbon.get(key));
//            System.out.println();
//        }
//
//        //checking
//        System.out.println("-----Senelio pristatymu sarasas-----");
//        Iterator<Kid> iterator = deliveryList.iterator();
//        while (iterator.hasNext()) {
//            Kid kid = iterator.next();
//            System.out.println(kid.getKidsName() + " " + kid.getKidsLastName() + " " + kid.getKidsAges()
//            + " " + kid.getKidsAddress() + " " + kid.getKidsDesire());
////        }
//
//        //checking
//        System.out.println("--------Elfu uzsakymai---------");
//        ordersList.keySet().forEach(key -> {
//                System.out.print(key);
//                System.out.print(" " + ordersList.get(key));
//                System.out.println();
//                //System.out.println("kyeSet" + elfToys.keySet());
//        });
//
//        //checking
//        System.out.println("--------Nereikalingu zaislu sarasas---------");
//        wasteToysList.keySet().forEach(key -> {
//            System.out.print(key);
//            System.out.print(" " + wasteToysList.get(key));
//            System.out.println();
//            //System.out.println("kyeSet" + elfToys.keySet());
//        });

    }

}




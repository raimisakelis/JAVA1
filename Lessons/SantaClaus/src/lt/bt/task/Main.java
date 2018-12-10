package lt.bt.task;

import lt.bt.task.Utils;
import lt.bt.task.data.Kid;
import lt.bt.task.data.Toy;

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





//        Iterator<Toy> iterator = elfToy.iterator();
//        while (iterator.hasNext()) {
//            Toy toy = iterator.next();
//            System.out.println(toy.toString());
//        }


    }


    private List<Kid> separateKids(List<Kid> allKids) {
        //List<Kid> littleKids = new ArrayList<>();

        Iterator<Kid> iterator = allKids.iterator();
        while (iterator.hasNext()) {
            Kid kid = iterator.next();
            if(kid.getKidsAges() > 15) {
                System.out.println("--------------");
                iterator.remove();
                System.out.println("--------------");
            }

            System.out.println(kid.toString());
        }

        return allKids;
    }




}



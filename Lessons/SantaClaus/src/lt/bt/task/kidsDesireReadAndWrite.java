package lt.bt.task;

import lt.bt.task.data.Kid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class kidsDesireReadAndWrite extends ReadAndWrite {

    private static final int KIDS_NAME = 0;
    private static final int KIDS_LAST_NAME = 1;
    private static final int KIDS_AGES = 2;
    private static final int KIDS_ADDRESS = 3;
    private static final int KIDS_DESIRE = 4;
    private String filePath = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\SantaClaus\\src\\lt\\bt\\task\\data\\VaikuNorai.txt";





    //read data from file: "VaikuNorai"
    protected  List<Kid> readKidsDesireFile(){
        List<Kid> kidsDesire = new ArrayList<Kid>();
        List<String> initialList = readFromFile(filePath);
        Iterator<String> iterator = initialList.iterator();
        while (iterator.hasNext()) {
            Kid kid = new Kid();
            String kidData = iterator.next();
            String[] part = kidData.split(",");//split specification of toy
            kid.setKidsName(part[KIDS_NAME]);
            kid.setKidsLastName(part[KIDS_LAST_NAME]);
            kid.setKidsAges(Integer.parseInt(part[KIDS_AGES].trim()));
            kid.setKidsAddress(part[KIDS_ADDRESS]);
            kid.setKidsDesire(part[KIDS_DESIRE]);
            kidsDesire.add(kid);
            //System.out.println(part[0] + " " + part[1] + " " + part[2] + " " + part[3] + " " + part[4]);
        }
        return kidsDesire;
    }


}

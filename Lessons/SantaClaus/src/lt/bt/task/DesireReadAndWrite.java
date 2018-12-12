package lt.bt.task;

import lt.bt.task.data.Kid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DesireReadAndWrite extends ReadAndWrite {

    private static final int KIDS_NAME = 0;
    private static final int KIDS_LAST_NAME = 1;
    private static final int KIDS_AGES = 2;
    private static final int KIDS_ADDRESS = 3;
    private static final int KIDS_DESIRE = 4;
    private static List<Kid> kidsDesire = new ArrayList<>();


    //read data from file: "VaikuNorai"
    public static List<Kid> readDesireFile(String filePath){
        List<String> initialList = readFromFile(filePath);
        Iterator<String> iterator = initialList.iterator();
        while (iterator.hasNext()) {
            Kid kid = new Kid();
            String kidData = iterator.next();
            String[] part = kidData.split(",");//split data about kid
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


    @Override
    public void writeToFile() {

    }
}

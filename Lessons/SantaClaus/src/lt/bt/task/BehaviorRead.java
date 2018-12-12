package lt.bt.task;

import lt.bt.task.data.Kid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BehaviorRead extends ReadAndWrite{

    private static final int KIDS_NAME = 0;
    private static final int KIDS_LAST_NAME = 1;
    private static final int KIDS_BEHAVIOR = 2;
    private static List<Kid> kids = new ArrayList<>();


    public static List<Kid> readKidsBehavior(String filePath){
        List<String> initialList = readFromFile(filePath);
        Iterator<String> iterator = initialList.iterator();
        while (iterator.hasNext()) {
            Kid kid = new Kid();
            String kidData = iterator.next();
            String[] part = kidData.split(",");//split data about kid
            kid.setKidsName(part[KIDS_NAME]);
            kid.setKidsLastName(part[KIDS_LAST_NAME]);
            kid.setKidsBehavior(part[KIDS_BEHAVIOR]);
            kids.add(kid);
            //System.out.println(part[0] + " " + part[1] + " " + part[2]);
        }
        return kids;
    }

    @Override
    public void writeToFile() {

    }


}

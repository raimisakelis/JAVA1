package lt.bt.task;

import lt.bt.task.data.Kid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BehaviorRead extends ReadAndWrite{

    private static final int KIDS_NAME = 0;
    private static final int KIDS_LAST_NAME = 1;
    private static final int KIDS_BEHAVIOR = 2;
    private List<Kid> kids = new ArrayList<>();


    public List<Kid> readKidsBehavior(String filePath){
        List<String> initialList = readFromFile(filePath);
        Iterator<String> iterator = initialList.iterator();
        while (iterator.hasNext()) {
            String kidData = iterator.next();
            String[] part = kidData.split(",");//split data about kid
            Kid kid = new Kid(part[KIDS_NAME], part[KIDS_LAST_NAME], part[KIDS_BEHAVIOR]);
            kids.add(kid);
        }
        return kids;
    }

}

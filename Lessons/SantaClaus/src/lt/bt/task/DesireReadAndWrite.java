package lt.bt.task;

import lt.bt.task.data.Kid;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DesireReadAndWrite extends ReadAndWrite {

    private static final int KIDS_NAME = 0;
    private static final int KIDS_LAST_NAME = 1;
    private static final int KIDS_AGES = 2;
    private static final int KIDS_ADDRESS = 3;
    private static final int KIDS_DESIRE = 4;
    private List<Kid> kidsDesire = new ArrayList<>();


    //read data from file: "VaikuNorai"
    public List<Kid> readDesireFile(String filePath){
        List<String> initialList = readFromFile(filePath);
        Iterator<String> iterator = initialList.iterator();
        while (iterator.hasNext()) {
            String kidData = iterator.next();
            String[] part = kidData.split(",");//split data about kid
            Kid kid = new Kid(part[KIDS_NAME], part[KIDS_LAST_NAME], Integer.parseInt(part[KIDS_AGES].trim()), part[KIDS_ADDRESS], part[KIDS_DESIRE]);
            kidsDesire.add(kid);
        }
        return kidsDesire;
    }


    public void writeListToFile(String filePath, List<Kid> ordersList) throws IOException {
        fw = new FileWriter(filePath);
        bw = new BufferedWriter(fw);
        Iterator<Kid> iterator = ordersList.iterator();
        while (iterator.hasNext()) {
            Kid kid = iterator.next();
            bw.write(kid.toString() + "\n");
        }
        close();
    }

}

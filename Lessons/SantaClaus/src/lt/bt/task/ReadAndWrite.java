package lt.bt.task;


import lt.bt.task.data.Kid;

import java.io.*;
import java.util.*;

public abstract class  ReadAndWrite {

    protected FileWriter fw = null;
    protected BufferedWriter bw = null;


    public static List<String> readFromFile(String filePath){
        List<String> dataList = new ArrayList<>();
       try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(new FileReader(file));
            while (scanner.hasNext()) {
                dataList.add(scanner.nextLine());
            }
            scanner.close();
            return dataList;
       }
       catch (Exception e){
            System.out.println("Wrong file path");
            return null;
       }
    }

    public void writeMapToFile(String filePath, Map<String,Integer> ordersList) throws IOException {
        fw = new FileWriter(filePath);
        bw = new BufferedWriter(fw);
        for (String key : ordersList.keySet()) {
            bw.write(key + " " + ordersList.get(key) + "\n");
        }
        close();
    }

    public void close() throws IOException {
        bw.close();
        fw.close();
    }

}

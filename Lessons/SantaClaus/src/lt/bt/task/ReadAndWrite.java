package lt.bt.task;


import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class  ReadAndWrite {



    public abstract void writeToFile();


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

}

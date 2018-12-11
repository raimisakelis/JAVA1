package lt.bt.task;


import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public abstract class  ReadAndWrite {

    private String filePath;
    private List<String> dataList;




    public void writeToFile(String filePath){
        this.filePath = filePath;
    }


    public List<String> readFromFile(String filePath){
        this.filePath = filePath;
        this.dataList = dataList;
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

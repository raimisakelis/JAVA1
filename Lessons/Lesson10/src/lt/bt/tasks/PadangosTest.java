package lt.bt.tasks;

import lt.bt.tasks.data.Padangos;

import java.io.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Locale.UK;

public class PadangosTest {

    private String fileName = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\Lesson10\\src\\lt\\bt\\tasks\\out\\rez.txt";
    private FileWriter fw = null;
    private BufferedWriter bw = null;

//    protected NumberFormat nf;  {
//        nf = NumberFormat.getNumberInstance(UK);
//        nf.setMaximumFractionDigits(3);
//        nf.setMinimumIntegerDigits(1);
//    }

    public PadangosTest () throws IOException{
        fw = new FileWriter(fileName);
        bw = new BufferedWriter(fw);
    }


    public static void main(String[] args)throws IOException{
        //read file and create new tires array (one array for client and storage)
        String filePath = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\Lesson10\\src\\lt\\bt\\tasks\\data\\Duomenys.txt";
        PadangosTest test = new PadangosTest();
        Padangos[] joinTiresArray = test.readData(filePath);
        test.saveToFile(joinTiresArray);
        test.close();

        //below are alternative way solve this task

//        //separate client tire
//        Padangos client = joinTiresArray[0];
//        //separate storage tires
//        Padangos[] storage = test.separateClientAndStorage(joinTiresArray);
//        //count suitable tires
//        int suitableTires = test.countTiresNumber(client, storage);
//        //count tires price
//        double tiresPrice = test.countTiresPrice(client, storage);
//        //save to file
//        test.saveToFile(suitableTires, tiresPrice);
//        test.close();

    }



    public Padangos[] readData(String filePath) throws FileNotFoundException {

        File file = new File(filePath);
        Scanner scanner = new Scanner(new FileReader(file));
        Padangos padClient = new Padangos();
        padClient.setWidth(Integer.parseInt(scanner.next()));
        padClient.setHeight(Integer.parseInt(scanner.next()));
        padClient.setIndex(scanner.next());
        int quantity = Integer.parseInt(scanner.next());
        Padangos[] array = new Padangos [quantity+1];
        array[0] = padClient;
        for (int i = 1; i < array.length; i++) {
            Padangos padStorage = new Padangos();
            padStorage.setWidth(Integer.parseInt(scanner.next()));
            padStorage.setHeight(Integer.parseInt(scanner.next()));
            padStorage.setIndex(scanner.next());
            padStorage.setPrice(Double.parseDouble(scanner.next()));
            array[i] = padStorage;
        }

        scanner.close();
        return array;
    }

    public Padangos[] separateClientAndStorage(Padangos[] jointArray) {
        Padangos[] storage = new Padangos[jointArray.length - 1];
        for(int i = 1, j = 0; i < jointArray.length; i++, j++) {
            storage[j] = jointArray[i];
        }

        return storage;
    }

    public double countTiresPrice (Padangos client, Padangos[] storage) {
        double price = 0;
        for(int i = 0; i < storage.length; i++) {
            if(client.getWidth() == storage[i].getWidth() && client.getHeight() == storage[i].getHeight() && client.getIndex().equals(storage[i].getIndex())) {
                price += storage[i].getPrice();
            }
        }
       return price;
    }


    public int countTiresNumber(Padangos client, Padangos[] storage) {
        int count = 0;
        for(int i = 0; i < storage.length; i++) {
            if(client.getWidth() == storage[i].getWidth() && client.getHeight() == storage[i].getHeight() && client.getIndex().equals(storage[i].getIndex())) {
                count++;
            }
        }
        return count;
    }


    private void saveToFile(Padangos[] jointArray) throws IOException{
        Padangos client = jointArray[0];
        Padangos[] storage = separateClientAndStorage(jointArray);
        int suitableTires = countTiresNumber(client, storage);
        double tiresPrice = countTiresPrice(client, storage);
        if(suitableTires > 0) {
            bw.write("Tinkamų padangų skaičius: " + suitableTires + "\n");
            bw.write("Jos kainuotų: " + tiresPrice + " LT" + "\n");
        } else {
            bw.write("Nera");
        }
    }

    //alternative way save to file using one function
    private void saveToFile(int suitableTires, double tiresPrice) throws IOException{
        if(suitableTires > 0) {
            bw.write("Tinkamų padangų skaičius: " + suitableTires + "\n");
            bw.write("Jos kainuotų: " + tiresPrice + " LT" + "\n");
        } else {
            bw.write("Nera");
        }
    }


    public void close() throws IOException{
        bw.close();
        fw.close();
    }


}

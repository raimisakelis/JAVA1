package lt.bt.task;


import lt.bt.task.data.Kid;
import lt.bt.task.data.Toy;

import java.util.*;

public class StorageReadAndWrite extends ReadAndWrite{

    private static final int TOY_NAME = 0;
    private static final int TOY_QUANTITY = 1;
    private Map<String,Integer> neededToysList = new HashMap<>();



    //read data from file: "elf's storage"
    public Map<String,Integer> readElfFile(String filePath) {
        List<String> initialList = readFromFile(filePath);
        Iterator<String> iterator = initialList.iterator();
        while (iterator.hasNext()) {
            String toyData = iterator.next();
            String[] part = toyData.split(",");//split specification of toy
            Toy toy = new Toy(part[TOY_NAME], Integer.parseInt(part[TOY_QUANTITY].trim()));
            neededToysList.put(toy.getToyName(), toy.getToyQuantity());
        }
        return neededToysList;
    }


}

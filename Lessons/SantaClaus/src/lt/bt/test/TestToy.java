package lt.bt.test;

import lt.bt.task.data.Toy;
import org.junit.Test;

import java.util.*;

import static lt.bt.task.CalcToys.createOrderList;
import static lt.bt.task.CalcToys.createWasteToysList;
import static lt.bt.task.CalcToys.smartAddToMap;
import static org.junit.Assert.assertEquals;

public class TestToy {

    @Test
    public void smartAddToMap_test(){
        List<Toy> toyList = new ArrayList<>();
        toyList.add(new Toy("Vienas"));
        toyList.add(new Toy("Vienas"));
        toyList.add(new Toy("Du"));
        toyList.add(new Toy("Trys"));
        toyList.add(new Toy("Keturi"));
        toyList.add(new Toy("Du"));
        toyList.add(new Toy("Vienas"));
        Map<String, Integer> test = new HashMap<>();
        Iterator<Toy> iterator3 = toyList.iterator();
        while (iterator3.hasNext()) {
            Toy toy = iterator3.next();
            smartAddToMap(toy.getToyName(),test);
        }

        Map<String, Integer> expected = new HashMap<>();
        expected.put("Vienas", 3);
        expected.put("Du", 2);
        expected.put("Trys", 1);
        expected.put("Keturi", 1);

        assertEquals(expected,test);
    }


    @Test
    public void createOrderList_test(){
        Map<String,Integer> storage = new HashMap<>();
        storage.put("Pirmas",2);
        storage.put("Antras",1);
        storage.put("Trecias",4);
        storage.put("Ketvirtas",1);
        Map<String,Integer> items = new HashMap<>();
        items.put("Antras",1);
        items.put("Trecias",2);
        items.put("Ketvirtas",3);
        items.put("Penktas",1);

        Map<String,Integer> expected = new HashMap<>();
        expected.put("Penktas",1);
        expected.put("Ketvirtas",2);

        Map<String,Integer> test = createOrderList(storage,items);

        assertEquals(expected,test);
    }


    @Test
    public void createWasteToysList_test(){
        Map<String,Integer> storage = new HashMap<>();
        storage.put("Pirmas",2);
        storage.put("Antras",1);
        storage.put("Trecias",4);
        storage.put("Ketvirtas",1);
        Map<String,Integer> items = new HashMap<>();
        items.put("Antras",1);
        items.put("Trecias",2);
        items.put("Ketvirtas",3);
        items.put("Penktas",1);

        Map<String,Integer> expected = new HashMap<>();
        expected.put("Pirmas",2);
        expected.put("Trecias",2);

        Map<String,Integer> test = createWasteToysList(storage,items);

        assertEquals(expected,test);
    }

}

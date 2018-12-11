package lt.bt.task;

import lt.bt.task.data.Kid;
import lt.bt.task.data.Toy;

import java.io.File;

import java.io.FileReader;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Utils {

    //private Toy toy;
    //private Kid kid;




    //read data from file: "elf's storage"
    protected static List<Toy> readElfFile(String filePath){
        try {
            List<Toy> toys = new ArrayList<Toy>();
            File file = new File(filePath);
            Scanner scanner = new Scanner(new FileReader(file));
            while (scanner.hasNext()) {
                Toy toy = new Toy();
                String toyData = scanner.nextLine();
                String[] part = toyData.split(",");//split specification of toy
                toy.setToyName(part[0]);
                toy.setToyQuantity(Integer.parseInt(part[1].trim()));
                toys.add(toy);
                //System.out.println(toy.getToyName() + " " + toy.getToyQuantity());
            }
            scanner.close();
            return toys;

        } catch (Exception e) {
            System.out.println("Wrong file path or data file format");
            return null;
        }
    }


    //read data from file: "kid character"
    protected static List<Kid> readKidsDesireFile(String filePath){
        try {
            List<Kid> kids = new ArrayList<Kid>();
            File file = new File(filePath);
            Scanner scanner = new Scanner(new FileReader(file));
            while (scanner.hasNext()) {
                Kid kid = new Kid();
                String kidData = scanner.nextLine();
                String[] part = kidData.split(",");//split specification of toy
                kid.setKidsName(part[0]);
                kid.setKidsLastName(part[1]);
                kid.setKidsAges(Integer.parseInt(part[2].trim()));
                kid.setKidsAddress(part[3]);
                kid.setKidsDesire(part[4]);
                kids.add(kid);
                //System.out.println(part[0] + " " + part[1] + " " + part[2] + " " + part[3] + " " + part[4]);
            }
            scanner.close();
            return kids;

        } catch (Exception e) {
            System.out.println("Wrong file path or data file format");
            return null;
        }
    }


    //read data from file: "kid's desires"
    protected static List<Kid> readKidsBehavior(String filePath){
        try {
            List<Kid> kids = new ArrayList<Kid>();
            File file = new File(filePath);
            Scanner scanner = new Scanner(new FileReader(file));
            while (scanner.hasNext()) {
                Kid kid = new Kid();
                String kidData = scanner.nextLine();
                String[] part = kidData.split(",");//split specification of toy
                kid.setKidsName(part[0]);
                kid.setKidsLastName(part[1]);
                kid.setKidsBehavior(part[2]);
                kids.add(kid);
                //System.out.println(part[0] + " " + part[1] + " " + part[2]);
            }
            scanner.close();
            return kids;

        } catch (Exception e) {
            System.out.println("Wrong file path or data file format");
            return null;
        }
    }




//    //read data from file: "elf's storage"
//    protected static List<Toy> readElfFile(String filePath){
//        try {
//            List<Toy> toys = new ArrayList<Toy>();
//            File file = new File(filePath);
//            Scanner scanner = new Scanner(new FileReader(file));
//            while (scanner.hasNext()) {
//                Toy toy = new Toy();
//                String toyData = scanner.nextLine();
//                String[] part = toyData.split(",");//split specification of toy
//                toy.setToyName(part[0]);
//                toy.setToyQuantity(Integer.parseInt(part[1].trim()));
//                toys.add(toy);
//                //System.out.println(toy.getToyName() + " " + toy.getToyQuantity());
//            }
//            scanner.close();
//            return toys;
//
//        } catch (Exception e) {
//            System.out.println("Wrong file path or data file format");
//            return null;
//        }
//    }
//

















}

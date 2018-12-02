package lt.bt.testai.uzdaviniai.prekybaBuitineTechnika;

import java.io.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Locale.UK;

public class TradeProd {

    private String fileName1 = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Tests\\src\\lt\\bt\\testai\\uzdaviniai\\prekybaBuitineTechnika\\data\\Sandelis.txt";
    private String fileName2 = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Tests\\src\\lt\\bt\\testai\\uzdaviniai\\prekybaBuitineTechnika\\data\\Uzsakymai.txt";
    private FileWriter fw = null;
    private BufferedWriter bw = null;

//    protected NumberFormat nf;  {
//        nf = NumberFormat.getNumberInstance(UK);
//        nf.setMaximumFractionDigits(2);
//        nf.setMinimumIntegerDigits(1);
//    }




    public TradeProd() throws IOException {
        //fw = new FileWriter(fileName1);
        //bw = new BufferedWriter(fw);

    }

    public static void main(String[] args) throws IOException{

        //read data from storage file
        String filePath1 = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Tests\\src\\lt\\bt\\testai\\uzdaviniai\\prekybaBuitineTechnika\\data\\Sandelis.txt";
        TradeProd storage = new TradeProd();
        Product[] productsArray = storage.readDataStorage(filePath1);
        System.out.println("Produktu masyvas " + Arrays.toString(productsArray));

        //read data from orders file
        String filePath2 ="C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Tests\\src\\lt\\bt\\testai\\uzdaviniai\\prekybaBuitineTechnika\\data\\Uzsakymai.txt";
        TradeProd orders = new TradeProd();
        Product[] ordersArray = orders.readDataOrders(filePath2);
        System.out.println("Uzsakymu masyvas " + Arrays.toString(ordersArray));




    }

//    public Product[] calculateBalanceOfStorage(Product[] storage, Product[] orders) {
//        int difference = storage.length - orders.length;
//        Product[] balance = new Product[difference];
//        for(int i = 0; i < storage.length; i++) {
//            for(int j =0; j < orders.length; j++ ) {
//                if(storage[i].getItemCode() == orders[j].getItemCode()) {
//                    Product prod = new Product();
//                    prod.setItemName(storage[i].getItemName());
//                    int quant = storage[i].getItemQuantity() - orders[j].getItemQuantity();
//                    prod.setItemQuantity(quant);
//
//                    break;
//                }
//            }
//        }
//
//
//
//        return null;
//    }




    public Product[] readDataOrders(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(new FileReader(file));
        int productCount = scanner.nextInt();
        Product[] array = new Product[productCount];
        for(int i = 0; i < productCount; i++){
            Product prod = new Product();
            prod.setItemCode(scanner.next().trim());
            prod.setItemQuantity(scanner.nextInt());
            array[i] = prod;
           // System.out.println(prod.getItemCode());
           // System.out.println(prod.getItemQuantity());
        }
        scanner.close();
        return array;
    }








    public Product[] readDataStorage(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(new FileReader(file));
        int productCount = Integer.parseInt(scanner.nextLine());//with scanner.nextInt() or scanner.next() does not work
        Product[] array = new Product[productCount];
        for(int i = 0; i < productCount; i++){
            System.out.println("vykdo 2, i reiksme  " + i);
            Product prod = new Product();
            String s = scanner.nextLine();
            String[] part = s.split("(?<=\\D)(?=\\d)");//split specification of product
            prod.setItemName(part[0]);
            prod.setItemCode(part[1].trim());
            prod.setItemQuantity(Integer.parseInt(String.valueOf(part[2].trim())));
            prod.setItemPrice(Double.parseDouble(String.valueOf((part[3].trim()) + (part[4].trim()))));//because price is float and split function splits it into two parts
            array[i] = prod;

            //System.out.println(prod.getItemName());
           // System.out.println(prod.getItemCode());
           // System.out.println(prod.getItemQuantity());
            //System.out.println(prod.getItemPrice());

        }
        scanner.close();
        return array;
    }




}

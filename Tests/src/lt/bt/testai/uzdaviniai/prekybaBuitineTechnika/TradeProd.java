package lt.bt.testai.uzdaviniai.prekybaBuitineTechnika;

import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Locale.UK;

public class TradeProd {


    private String filePath2 = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Tests\\src\\lt\\bt\\testai\\uzdaviniai\\prekybaBuitineTechnika\\out\\UzsakymaiRez.txt";
    private FileWriter fw = null;
    private BufferedWriter bw = null;

//    public static NumberFormat nf;  {
//        nf = NumberFormat.getNumberInstance(UK);
//        nf.setMaximumFractionDigits(2);
//        nf.setMinimumIntegerDigits(4);
//    }




    public TradeProd() throws IOException {
        //fw = new FileWriter(fileName1);
        //bw = new BufferedWriter(fw);

    }

    public static void main(String[] args) throws IOException{

        //read data from storage file
        String filePath1 = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Tests\\src\\lt\\bt\\testai\\uzdaviniai\\prekybaBuitineTechnika\\data\\Sandelis.txt";
        TradeProd trade = new TradeProd();
        Product[] storage = trade.readDataStorage(filePath1);
        System.out.println("Produktu masyvas " + Arrays.toString(storage));

        //read data from orders file
        String filePath2 ="C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Tests\\src\\lt\\bt\\testai\\uzdaviniai\\prekybaBuitineTechnika\\data\\Uzsakymai.txt";
        Product[] orders = trade.readDataOrders(filePath2);
        System.out.println("Uzsakymu masyvas " + Arrays.toString(orders));


        //get storage balance
        Product[] balanceOfStorage = trade.calculateBalanceOfStorage(storage, orders);
        System.out.println("Sandelyje esanciu prekiu balansas " + Arrays.toString(balanceOfStorage));

        //get rest of products in the storage
        Product[] restProducts = trade.restProductOfStorage(balanceOfStorage);
        System.out.println("Likutis sandelyje " + Arrays.toString(restProducts));

        //needed products list
        Product[] neededProducts = trade.misingProduct(balanceOfStorage);
        System.out.println("Technika kuria reikia uzsakyti  " + Arrays.toString(neededProducts));

        //needed products price
        double productsPrice = trade.calculatePrice(neededProducts);
        System.out.println("Sumoketi tiekejams " + productsPrice);

        //write to file products of storage
        trade.saveStorage(restProducts);


//        String s = "a.b.c.d m";
//        int charCount = s.length();
//
//        System.out.println("raidziu kiekis " + charCount);
//
//
//        String str = "Hello Word!!";
//
//        //StringUtils.leftPad(str, 10)
//        System.out.println(StringUtils.leftPad(str, 10));
//
//        System.out.println(String.format("%1$" + (10 + str.length()) + "s", str));
//
//        System.out.println(StringUtils.rightPad(str, 10));


    }






    private void saveStorage(Product[] prod) throws IOException{
        String filePath = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Tests\\src\\lt\\bt\\testai\\uzdaviniai\\prekybaBuitineTechnika\\out\\SandelisRez.txt";
        fw = new FileWriter(filePath);
        bw = new BufferedWriter(fw);
        for(int i = 0; i < prod.length; i++) {



            bw.write(prod[i].getItemName() + " " + prod[i].getItemCode() + " " + prod[i].getItemQuantity() + " " + prod[i].getItemPrice() + "\n");
        }

        close();
    }




    public void close() throws IOException{
        bw.close();
        fw.close();
    }













    public double calculatePrice(Product[] array) {
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i].getItemPrice() * array[i].getItemQuantity();
        }
        return sum;
    }



    public Product[] misingProduct(Product[] balanceOfStorage) {
        Product[] missing = null;
        int counter = 0;
        for(int i = 0; i < balanceOfStorage.length; i ++) {
            if(balanceOfStorage[i].getItemQuantity() < 0) {
                int neededQuantity = Math.abs(balanceOfStorage[i].getItemQuantity());
                balanceOfStorage[i].setItemQuantity(neededQuantity);
                if (missing == null) {
                    missing = new Product[1];
                    missing[0] = balanceOfStorage[i];
                    counter++;

                } else {
                    Product[] tmp = new Product[counter + 1];
                    for(int k = 0; k < counter; k++) {
                        tmp[k] = missing[k];
                    }
                    tmp[counter] = balanceOfStorage[i];
                    counter++;
                    missing = tmp;
                }
            }
        }
        return missing;
    }




    public Product[] restProductOfStorage(Product[] balanceOfStorage) {
        Product[] rest = null;
        int counter = 0;
        for(int i = 0; i < balanceOfStorage.length; i ++) {
            if(balanceOfStorage[i].getItemQuantity() > 0) {
                if (rest == null) {
                    rest = new Product[1];
                    rest[0] = balanceOfStorage[i];
                    counter++;

                } else {
                    Product[] tmp = new Product[counter + 1];
                    for(int k = 0; k < counter; k++) {
                        tmp[k] = rest[k];
                    }
                    tmp[counter] = balanceOfStorage[i];
                    counter++;
                    rest = tmp;
                }
            }
        }
        return rest;
    }



    public Product[] calculateBalanceOfStorage(Product[] storage, Product[] orders) {
        Product[] balance = new Product[storage.length];
        for(int i = 0; i < storage.length; i++) {
            for(int j =0; j < orders.length; j++ ) {
                if(storage[i].getItemCode().equals(orders[j].getItemCode())) {
                    int quantity = storage[i].getItemQuantity() - orders[j].getItemQuantity();
                    storage[i].setItemQuantity(quantity);
                }
            }
            balance[i] = storage[i];
        }
        return balance;
    }




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

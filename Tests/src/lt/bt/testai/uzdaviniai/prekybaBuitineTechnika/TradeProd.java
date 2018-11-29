package lt.bt.testai.uzdaviniai.prekybaBuitineTechnika;

import java.io.*;
import java.util.Scanner;

public class TradeProd {

    private String fileName1 = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Tests\\src\\lt\\bt\\testai\\uzdaviniai\\prekybaBuitineTechnika\\data\\Sandelis.txt";
    private String fileName2 = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Tests\\src\\lt\\bt\\testai\\uzdaviniai\\prekybaBuitineTechnika\\data\\Uzsakymai.txt";
    private FileWriter fw = null;
    private BufferedWriter bw = null;

    public TradeProd() throws IOException {
        fw = new FileWriter(fileName1);
        bw = new BufferedWriter(fw);

    }

    public static void main(String[] args) {


    }

    public Product[] readData(String filePath) throws FileNotFoundException {
        boolean orNumb = true;
        Product[] array = null;
        File file = new File(filePath);
        Scanner scanner = new Scanner(new FileReader(file));
        int productCount = scanner.nextInt();
        array = new Product[productCount];
        for(int i = 0; i < productCount; i++){
            Product prod = new Product();

            try {
                Integer.parseInt(scanner.next());
                orNumb = true;

            } catch (NumberFormatException e) {
                orNumb = false;
            }


            while ( scanner.hasNext() != orNumb) {


            }


//            String monthName = scanner.next();
//            temp.setMonth(monthName);
//            double[] measures = new double[measureCount];
//            for(int j = 0; j < measureCount; j++){
//                measures[j] = scanner.nextDouble();
//            }
//            temp.setTemp(measures);
//            array[i] = temp;
        }
        scanner.close();
        return array;
    }




}

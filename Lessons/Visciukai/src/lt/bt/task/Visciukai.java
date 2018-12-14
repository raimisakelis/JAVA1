package lt.bt.task;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Visciukai {

    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\Visciukai\\src\\lt\\bt\\task\\duomenys.txt";
        File f = new File(filePath);
        Scanner s = new Scanner(f);

        int visciukuKiekis = s.nextInt();
        //sukuriam du masyvus: i viena desime visciuku svori, i kita visciuku amziu
        int[] visciukuSvoris = new int[visciukuKiekis];
        int[] visciukuAmzius = new int[visciukuKiekis];

        for (int i = 0; i < visciukuKiekis; i++) {
            visciukuSvoris[i] = s.nextInt();
            visciukuAmzius[i] = s.nextInt();
        }

        //atsispausdiname pasiziureti ar gerai sudejo duomenis i masyvus
        System.out.println("Visciuku svorio masyvas " + Arrays.toString(visciukuSvoris));
        System.out.println("Visciuku amziaus masyvas " + Arrays.toString(visciukuAmzius));



        //ieskome sunkiausio visciuko
        int sunkiausioNumeris = sunkiausiasVisciukas(visciukuSvoris);
        System.out.println("Sunkiausio visciuko numeris " + sunkiausioNumeris);


        //ieskome jauniausio visciuko
        int jauniausioNumeris = jauniausiasVisciukas(visciukuAmzius);
        System.out.println("Jauniauiso visciuko numeris " + jauniausioNumeris);


    }

    private static void writeToFile(int[] visciukuSvoris, int[] visciukuAmzius) throws IOException {


            String fileName = "C:\\Program Files (x86)\\Ampps\\www\\JAVA1\\Lessons\\Visciukai\\src\\lt\\bt\\task\\rezultatai.txt";
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Pradiniai duomenys: " + "\n");
            for (int i = 0, j = 1; i < visciukuSvoris.length; i++, j++) {
                bw.write("Visciukas Nr." + j + ": " + "mase: " + visciukuSvoris[0] + " amzius: " + visciukuAmzius[i]);



            }
                bw.write(resultsData[i] + "\n");



            System.out.println("Done");
            bw.close();
            fw.close();



    }














    private static int sunkiausiasVisciukas(int[] visciukuSvoris) {
        //is visciuku svorio masyvo ieskome didziausio svorio visciuko
        //pirmo visciuko svori prisilyginame kintamajam, jeigu kito visciuko svoris bus didesnis, tuomet
        //i ta pati kintamaji issaugosime jo svori

        int visciukoNumeris = 1;
        int sunkiausiasVisciukas = visciukuSvoris[0];

        for (int i = 0; i < visciukuSvoris.length; i++) {
            if (visciukuSvoris[i] > sunkiausiasVisciukas) {
                sunkiausiasVisciukas = visciukuSvoris[i];

                // logika tokia: kai sukantis ciklui kazkuri momenta bus ispildyta if salyga, i jos vidu ieis iteratorius i
                //ir jo reiksme issisaugos visciukoNumeryje (Ps. kadangi masyvas prasideda nuo 0 elemento, o mes visciukus skaiciuojame nuo
                // vieneto, tai prie visciukoNumeris reikia prideti 1; jeigu if neispildys, vadinasi sunkiausias pirmasis visciukas
                visciukoNumeris = i + 1;
            }
        }

        return visciukoNumeris;
    }


    private static int jauniausiasVisciukas(int[] visciukuAmzius) {
        int visciukoNumeris = 1;
        int jauniausiasVisciukas = visciukuAmzius[0];

        for (int i = 0; i < visciukuAmzius.length; i++) {
            if (visciukuAmzius[i] < jauniausiasVisciukas) {
                jauniausiasVisciukas = visciukuAmzius[i];
        visciukoNumeris = i + 1;
            }
        }
        return visciukoNumeris;
    }





}






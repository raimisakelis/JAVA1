package lt.bt.tasks;

import java.util.Arrays;

public class Farm {

 public static void main(String[] args) {

     Animal cat1 = new Cat("Murke");
     Animal cat2 = new Cat("Burke");
     Animal cat3 = new Cat("Micius");

     Animal dog1 = new Dog("Brisius");
     Animal dog2 = new Dog("Dzeis");

     Animal cow1 = new Cow("Marge");
     Animal cow2 = new Cow("Zalmarge");
     Animal cow3 = new Cow("Juodmarge");
     Animal cow4 = new Cow("Ryze");

     Animal sheep = new Sheep("Mekeke");

     Animal chicken = new Chicken("Cyplius");

     Animal[] arrayAnimals = {cat1, dog1, sheep, cat2, cow1, cow2, chicken, dog2, cat3, cow3, cow4};


         int catNumb = 0;
         int dogNumb = 0;
         int cowNumb = 0;
         int sheepNumb = 0;
         int chickenNumb = 0;
         for (int i = 0; i < arrayAnimals.length; i++) {
             Animal b = arrayAnimals[i];

             if (b instanceof Cat) {
                 catNumb++;

             } else if (b instanceof Dog) {
                 dogNumb++;

             } else if (b instanceof Cow) {
                 cowNumb++;

             } else if (b instanceof Sheep) {
                 sheepNumb++;

             } else if (b instanceof Chicken) {
                 chickenNumb++;

             }

         }

         System.out.println("Kaciu skaicius: " + catNumb + " - " + cat1.toString());
         System.out.println("Sunu skaicius: " + dogNumb + " - " + dog1.toString());
         System.out.println("Karviu skaicius: " + cowNumb + " - " + cow1.toString());
         System.out.println("Aviu skaicius: " + sheepNumb + " - " + sheep.toString());
         System.out.println("Visciuku skaicius: " + chickenNumb + " - " + chicken.toString());



    }


}

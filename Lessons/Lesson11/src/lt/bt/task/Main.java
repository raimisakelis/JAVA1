package lt.bt.task;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {


        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Employee("Petras", "LT 0750 8900 0000 0175 7814", new double[]{100, 65, -55, 63, -40, -33}));
        personList.add(new Employee("Jonas", "LT 0750 8900 0580 0175 7814", new double[]{-25, -60, 120, 65, 80, -95, -63}));
        personList.add(new Client("Aleksas", "LT 0750 8900 0580 0175 9864", new double[]{65, -61, -25, -30, 700, -90}));
        personList.add(new Employee("Marius", "LT 0980 8900 0580 0175 7814", new double[]{800, 10, -54, -300, -40, -30}));
        personList.add(new Client("Tomas", "LT 0750 8900 0580 0175 9876", new double[]{90, -60, 800, 63, 84, -75, -93}));


        for (Person sk : personList) {
            System.out.println(sk);
        }


    }

}

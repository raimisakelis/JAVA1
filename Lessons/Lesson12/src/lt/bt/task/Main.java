package lt.bt.task;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> listEmpl = new ArrayList<>();

        listEmpl.add(new Employee("Jonas", new Employee.Address("Kaunas", "Pakalnuciu g. 53")));
        listEmpl.add(new Employee("Petras", new Employee.Address("Kauans", "Krumu g. 64")));
        listEmpl.add(new Employee("Marius", new Employee.Address("Panevezys", "Klevu g. 24")));
        listEmpl.add(new Employee("Ona", new Employee.Address("Marijampole", "Kirtimu g. 6")));
        listEmpl.add(new Employee("Jonas", new Employee.Address("Panevezys", "Pakalnes g. 9")));
        listEmpl.add(new Employee("Marija", new Employee.Address("Alytus", "Kryziu g. 7")));
        listEmpl.add(new Employee("Algimantas", new Employee.Address("Alytus", "Pakeles g. 19")));
        listEmpl.add(new Employee("Gabija", new Employee.Address("Kauans", "Alksniu g. 64")));








    }

}

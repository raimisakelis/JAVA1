package lt.bt.task;

public class Employee implements Comparable<Employee> {

   private String name;
   private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;

    }

    @Override
    public int compareTo(Employee o) {
        Employee employee = (Employee) o;



        return 0;
    }


    static class Address {
        String city;
        String address;

        public Address(String city, String address) {
            this.city = city;
            this.address = address;
        }
    }

}

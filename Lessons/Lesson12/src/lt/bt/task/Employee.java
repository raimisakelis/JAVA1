package lt.bt.task;

public class Employee  {

   private String name;
   private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;

    }


    public String getName() {
        return name;
    }

    public Address getAddress() { return address; }



    //    @Override
//    public int compareTo(Employee o) {
//        Employee employee = (Employee) o;
//
//
//
//        return 0;
//    }


    static class Address {
        String city;
        String address;

        public String getCity() { return  city; }
        public static String getAddress() {return address; }


        public Address(String city, String address) {
            this.city = city;
            this.address = address;
        }
    }

    public String toString() {
        return "Vardas: " + name + ", miestas: " + address.city + ", adresas:" + address.address;
    }

}

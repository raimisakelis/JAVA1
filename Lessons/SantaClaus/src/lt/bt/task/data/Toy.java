package lt.bt.task.data;

public class Toy {

    private String toyName;
    private int toyQuantity;
    private int carbonQuantity;


    public Toy(){}

    public Toy(String toyName) {
        this.toyName = toyName;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getToyQuantity() {
        return toyQuantity;
    }

    public void setToyQuantity(int toyQuantity) {
        this.toyQuantity = toyQuantity;
    }

    public int getCarbonQuantity() {
        return carbonQuantity;
    }

    public void setCarbonQuantity(int carbonQuantity) {
        this.carbonQuantity = carbonQuantity;
    }


    @Override
    public String toString() {
        return getToyName() + " " + getToyQuantity();
    }


}





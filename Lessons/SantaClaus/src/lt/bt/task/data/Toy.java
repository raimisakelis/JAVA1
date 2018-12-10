package lt.bt.task.data;

public class Toy {

    private String toyName;
    private int toyQuantity;
    private String carbonQuantity;



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


    public String getCarbonQuantity() {
        return carbonQuantity;
    }

    public void setCarbonQuantity(String carbonQuantity) {
        this.carbonQuantity = carbonQuantity;
    }



    @Override
    public String toString() {
        return getToyName() + " " + getToyQuantity();
    }



}





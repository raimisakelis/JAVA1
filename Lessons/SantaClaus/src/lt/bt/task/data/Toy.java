package lt.bt.task.data;

public class Toy {

    private String toyName;
    private int toyQuantity;



    public Toy(){}

    public Toy(String toyName, int toyQuantity){
        this.toyName = toyName;
        this.toyQuantity = toyQuantity;
    }

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


    @Override
    public String toString() {
        return getToyName() + " " + getToyQuantity();
    }


}





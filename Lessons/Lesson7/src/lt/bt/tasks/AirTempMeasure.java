package lt.bt.tasks;

public class AirTempMeasure {

    private int months;
    private int quantity;
    private String name = "";
    private int[] measure = null;

    public int getMonths() { return  months; }
    public int getQuantity() { return quantity; }
    public String getName() { return name; }
    public int[] getMeasure() { return measure; }

    public void setMonths(int months) { this.months = months; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setName(String name) { this.name = name; }
    public void setMeasure(int[] measure) { this.measure = measure; }



    public AirTempMeasure(String name, int[] measure) {
        this.name = name;
        this.measure = measure;

    }


    public AirTempMeasure() {

    }


}

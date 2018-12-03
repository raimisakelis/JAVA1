package lt.bt.tasks.data;

public class Padangos {

    private int width;
    private int height;
    private String index;
    private double price;

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }
    public void setIndex(String index) { this.index = index; }
    public void setPrice(double price) { this.price = price; }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public String getIndex() { return index; }
    public double getPrice() { return price; }

    public Padangos(){}

    @Override
    public String toString() {
        return width + " " + height + " " + index + " " + price;
    }
}

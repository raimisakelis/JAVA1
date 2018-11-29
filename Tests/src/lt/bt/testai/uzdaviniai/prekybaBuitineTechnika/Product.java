package lt.bt.testai.uzdaviniai.prekybaBuitineTechnika;

public class Product {

    private String itemName;
    private int itemCode;
    private double itemPrice;
    private int itemQuantity;
    private double[] itemData;

    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setItemCode(int itemCode) { this.itemCode = itemCode; }
    public void setItemPrice(double itemPrice) { this.itemPrice = itemPrice; }
    public void setItemQuantity(int itemQuantity) { this.itemQuantity = itemQuantity; }
    public void setItemData(double[] itemData) { this.itemData = itemData; }

    public String getItemName() { return itemName; }
    public int getItemCode() { return itemCode; }
    public double getItemPrice() { return itemPrice; }
    public int getItemQuantity() { return itemQuantity; }
    public double[] getItemData() { return itemData; }

}

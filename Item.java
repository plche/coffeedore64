/**
 * Item
 */
public class Item {

    private int index;
    private String name;
    private double price;

    public Item(int index, String name, double price) {
        this.index = index;
        this.name = name;
        this.price = price;
    }
    
    // getter for index
    public int getIndex() {
        return index;
    }

    // setter for index
    public void setIndex(int index) {
        this.index = index;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for price
    public double getPrice() {
        return price;
    }

    // setter for price
    public void setPrice(double price) {
        this.price = price;
    }
}
import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * Order
 */
public class Order {

    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order() {
        name = "Guest";
        items = new ArrayList<Item>();
    }
    
    public Order(String name) {
        this.name = name;
        items = new ArrayList<Item>();
    }
    
    // getter para name
    public String getName() {
        return name;
    }

    // setter para name
    public void setName(String name) {
        this.name = name;
    }

    // getter para ready
    public boolean isReady() {
        return ready;
    }

    // setter para ready
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    // getter para items
    public ArrayList<Item> getItems() {
        return items;
    }

    // setter para items
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // método addItem
    public void addItem(Item item) {
        items.add(item);
    }

    // método getStatusMessage
    public String getStatusMessage() {
        String str = "Dear " + name + ": ";
        if (ready) {
            return str + "Your order is ready.";
        } else {
            return str + "Thank you for waiting. Your order will be ready soon.";
        }
    }

    // método display
    public void display() {
        DecimalFormat frmtDouble = new DecimalFormat("$###,###.###");
        System.out.println("Customer name: " + name);
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName() + ": " + frmtDouble.format(items.get(i).getPrice()));
        }
        System.out.println("Total: " + frmtDouble.format(getOrderTotal()));
    }

    // método getOrderTotal
    public double getOrderTotal() {
        // En un método, se necesita inicializar la variable local.
        double total = 0.0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice();
        }
        return total;
    }
}
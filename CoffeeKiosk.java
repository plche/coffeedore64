/**
 * CoffeeKiosk
 */
public class CoffeeKiosk {

    public static void main(String[] args) {
        
        // Simulaciones de la aplicación
        // Prueba creación de instancias y creación de menú
        KioskOrder testApp = new KioskOrder();
        testApp.addMenuItem("banana", 2.00);
        testApp.addMenuItem("coffee", 1.50);
        testApp.addMenuItem("latte", 4.50);
        testApp.addMenuItem("capuccino", 3.00);
        testApp.addMenuItem("muffin", 4.00);

        // Prueba newOrder
        System.out.println("\n----- Prueba newOrder -----");
        testApp.newOrder();
    }
}
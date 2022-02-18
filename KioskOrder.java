import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * KioskOrder
 */
public class KioskOrder {

    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public KioskOrder() {
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price) {
        Item newItem = new Item(menu.size(), name, price);
        menu.add(newItem);
    }

    public void displayMenu() {
        DecimalFormat frmtDouble = new DecimalFormat("$###,###.###");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i).getIndex() + " " + menu.get(i).getName() + " -- " + frmtDouble.format(menu.get(i).getPrice()));
        }
    }

    public void newOrder() {
        
    	// Mostrar al usuario un aviso de mensaje y luego establece su entrada en una variable, nombre
        System.out.println("Ingrese el nombre del cliente para el nuevo pedido:");
        String name = System.console().readLine();
    
    	// Tu código:
        // Crea un nuevo pedido con la cadena de entrada dada
        // Muestra el menú al usuario, para que puedan elegir artículos para agregar
        Order createNewOrder = new Order(name);
        displayMenu();
        
    	// Pedir al usuario que ingrese un número de artículo
        System.out.println("Ingrese un índice de artículo del menú o q para salir:");
        String itemNumber = System.console().readLine();
        
        // Escribir un bucle while para recopilar todos los artículos del pedido del usuario
        while(!itemNumber.equals("q")) {
            
            // Obtén el objeto del artículo del menú y agrega el artículo al pedido
            // Pídales que ingresen un nuevo índice de artículo o q nuevamente, y toma su entrada
            int chosenItemNumber = Integer.parseInt(itemNumber);
            Item chosenItem = menu.get(chosenItemNumber);
            createNewOrder.addItem(chosenItem);
            orders.add(createNewOrder);
            System.out.println("Ingrese un índice de artículo del menú o q para salir:");
            itemNumber = System.console().readLine();
        }
        // Después de haber completado su pedido, imprime los detalles del pedido
    	// como el ejemplo de abajo. Puedes utilizar el método de visualización del pedido
        System.out.println("Gracias, " + name + ". Aquí están los detalles de tu pedido:");
        orders.get(0).display();
    }
}
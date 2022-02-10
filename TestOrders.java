import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 2.99);
        Item item2 = new Item("latte", 3.50);
        Item item3 = new Item("drip coffee", 3.50);
        Item item4 = new Item("cappuccino", 9.95);

        // 2 orders for unspecified guests without specifying a name
        Order order1 = new Order();
        Order order2 = new Order();

        // 3 orders using the overloaded constructor to assign a name
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Hannah");

        // add at least 2 items to each order
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item2);
        order4.addItem(item3);
        order4.addItem(item4);
        order5.addItem(item1);
        order5.addItem(item2);

        // test getStatusMessage functionaltity by setting some orders to ready and printing
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        order2.setReady(true);
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());

        // print total
        System.out.println(order1.getOrderTotal());

         // print display
        order4.display();
    }
}

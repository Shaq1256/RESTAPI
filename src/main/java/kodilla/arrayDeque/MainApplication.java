package kodilla.arrayDeque;

import java.util.ArrayDeque;

public class MainApplication {
    public static void main(String[] args) {
        Book theBook1 = new Book("Indiana Jones", "Stephen Spilberg", 1999);
        Book theBook2 = new Book("Historie XX wieku", "Boguslaw Woloszański", 2012);
        Book theBook3 = new Book("Python - Rusz głową", "Garry Barry", 2020);
        Book theBook4 = new Book("Thinking in Java", "Bruce Eckel", 2018);
        Book theBook5 = new Book("Zawód tester", "Radosław Smilgin", 2019);

        Order theOrder1 = new Order(theBook1, 2020, 2, 10);
        Order theOrder2 = new Order(theBook2, 2020, 3, 12);
        Order theOrder3 = new Order(theBook5, 2020, 2, 22);
        Order theOrder4 = new Order(theBook3, 2020, 1, 17);
        Order theOrder5 = new Order(theBook1, 2020, 5, 9);
        Order theOrder6 = new Order(theBook4, 2020, 1, 19);

        ArrayDeque<Order> theOrders = new ArrayDeque<Order>();

        System.out.println("Stos size: " + theOrders.size());

        //adding orders to stos
        theOrders.push(theOrder1);
        theOrders.push(theOrder2);
        theOrders.push(theOrder3);
        theOrders.push(theOrder4);
        theOrders.push(theOrder5);
        theOrders.push(theOrder6);

        System.out.println("Stos size after adding orders: " + theOrders.size());
        for (Order o : theOrders) {
            System.out.println(o);
        }

        //deleting orders from stos
        Order temp = null;
        for (int i = theOrders.size(); i > 0; i--) {
            temp = theOrders.pop();
        }

        System.out.println("");
        System.out.println("Stos size after deleting orders: " + theOrders.size());
        System.out.println("Order which was deleted as last: ");
        System.out.println(temp);

    }
}

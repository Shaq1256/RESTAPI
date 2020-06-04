package kodilla.operationTiming;

public class LinkedList {
    public void testLinkedList() {
        java.util.LinkedList<Book> linkedListBook = new java.util.LinkedList<>();
        for (int i = 0; i < 500000; i++) {
            linkedListBook.add(new Book("Author " + i,  " - Title: " + i));
//            System.out.println(linkedListBook.get(i));
        }
        System.out.println("Size of LinkedList: " + linkedListBook.size());

        long begin = System.nanoTime();
        linkedListBook.add(0, new Book("Author: ", "Title: "));
        long end = System.nanoTime();
        System.out.println("Time of adding first element of the LinkedList: " + (end - begin) + "ns");

        begin = System.nanoTime();
        linkedListBook.add(new Book("Author: ", "Title: "));
        end = System.nanoTime();
        System.out.println("Time of adding last element of the LinkedList: " + (end - begin) + "ns");

        begin = System.nanoTime();
        linkedListBook.pollFirst();
        end = System.nanoTime();
        System.out.println("Time of deleting first element of the LinkedList: " + (end - begin) + "ns");

        begin = System.nanoTime();
        linkedListBook.pollLast();
        end = System.nanoTime();
        System.out.println("Time of deleting last element of the LinkedList: " + (end - begin) + "ns");
    }
}

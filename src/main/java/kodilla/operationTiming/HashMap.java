
package kodilla.operationTiming;

public class HashMap {
    public void TestHashMap() {
        java.util.HashMap<String, Book> hashMapBook = new java.util.HashMap<>();
        for (int i = 0; i < 500000; i++) {
            hashMapBook.put("indeks " + i, new Book("Author " + i, "Title: " + i));
        }
        System.out.println("Size of HashMap: " + hashMapBook.size());

        long begin = System.nanoTime();
        hashMapBook.put("indeks " + 0, new Book("Author", "Title"));
        long end = System.nanoTime();
        System.out.println("Time of adding first element to the HashMap: " + (end - begin) + "ns");

        begin = System.nanoTime();
        hashMapBook.put("indeks " + 500000, new Book("Author", "Title"));
        end = System.nanoTime();
        System.out.println("Time of adding last element to the HashMap: " + (end - begin) + "ns");

        begin = System.nanoTime();
        hashMapBook.remove("indeks " + 0);
        end = System.nanoTime();
        System.out.println("Time of deleting first element to the HashMap: " + (end - begin) + "ns");

        begin = System.nanoTime();
        hashMapBook.remove("indeks " + 500000);
        end = System.nanoTime();
        System.out.println("Time of deleting last element to the HashMap: " + (end - begin) + "ns");
    }
}

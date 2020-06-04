package kodilla.lists;

import java.util.ArrayDeque;
import java.util.Random;

public class ClassA {
    String letterA = "a";
    String licznikA = "";

    public void GeneratedListA() {
        Random generator = new Random();
        ArrayDeque<String> theList = new ArrayDeque<String>();
        int liczbaA = 0;

        while (theList.size() < 3) {
            liczbaA = generator.nextInt(5);
            if (liczbaA != 0) {
                System.out.println(liczbaA);
                for (int i = 0; i < liczbaA; i++) {
                    licznikA += letterA;
                }
            }
            theList.offer(licznikA);
        }
//        System.out.println(theList.size());
        SplitLetters a = new SplitLetters();
        a.SplittingA(theList);

    }
}

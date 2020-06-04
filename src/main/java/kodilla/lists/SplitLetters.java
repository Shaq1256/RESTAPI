package kodilla.lists;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class SplitLetters {
    ArrayList<String> even = new ArrayList<String>();
    ArrayList<String> odd = new ArrayList<String>();
    String letter = null;

    public void SplittingA(ArrayDeque<String> theList) {
        while (theList.size() > 0) {
            letter = theList.poll();
            if ((letter.length() % 2) == 0 ) {
                even.add(letter);
                System.out.println("Even: " + letter);
            } else {
                odd.add(letter);
                System.out.println("Odd: " + letter);
            }
        }
    }
}

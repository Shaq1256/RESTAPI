package kodilla.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer>  numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer no : numbers) {
            if ((no % 2) == 0) {
                evenNumbers.add(no);
            }
        }

        return evenNumbers;
    }
}

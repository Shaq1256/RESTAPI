package kodilla.average;

import java.util.Random;

public class avg {

    public static void main(String[] args) {
        int sum = 0;
        Integer[] tab = new Integer[20];
        Random rand = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(10);;
            System.out.print(tab[i] + ", ");
            sum += tab[i];
        }

        System.out.println("");
        System.out.println("Liczba elementów w tablicy: " + tab.length);
        System.out.println("Suma liczb z tablicy: " + sum);
        System.out.println("Srednia liczb z tabeli: " + (double)sum/tab.length);

    }
}


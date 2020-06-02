package kodilla.sumRun;

import java.util.Random;

public class sumRun {
    public static void main(String[] args) {
        int sumA = 1000;
        int sumB = 0;
        int licznik = 0;

        Random generator = new Random();

        while (sumA > sumB) {
            licznik++;
            sumA += generator.nextInt(10);
            sumB += generator.nextInt(50);
            System.out.println(licznik + ") sumA: " + sumA + ",  sumB: " + sumB);
        }
    }
}

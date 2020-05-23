package kodilla.averageDegree;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class ItClassDegree {
    Double min = Double.MIN_VALUE;
    Double max = Double.MAX_VALUE;
    Double sum = 0.0;
    Double avg = 0.0;
    DecimalFormat df = new DecimalFormat("#.00");

    public ItClassDegree() {
        ArrayList<Double> itDegree = new ArrayList<>();
        itDegree.add(2.5);
        itDegree.add(5.0);
        itDegree.add(4.0);
        itDegree.add(2.0);
        itDegree.add(3.5);
        itDegree.add(3.0);
        itDegree.add(6.0);

        for (int i = 0; i < itDegree.size(); i++) {
            sum += itDegree.get(i);
        }

        min = Collections.min(itDegree);
        max = Collections.max(itDegree);
        avg = (sum-min-max)/(itDegree.size()-2);

        System.out.println("Oceny w klasie z przedmiotu IT: " + itDegree);
        System.out.println("Najnizsza ocena w klasie to:" + min);
        System.out.println("Najwyzsza ocena w klasie to: " + max);
        System.out.println("Srednia ocen w klasie (z pominięciem max i min): " + df.format(avg));
    }
}

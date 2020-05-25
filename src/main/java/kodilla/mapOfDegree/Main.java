package kodilla.mapOfDegree;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");

        Students student1 = new Students("Tomasz ", "Takieta ");
        Students student2 = new Students("Daniel ", "Gil ");
        Students student3 = new Students("Anita ", "Tokarczuk ");
        Students student4 = new Students("Ola ", "Lewandowska ");

        Grades grades1 = new Grades(4.0, 5.0, 3.0, 3.5);
        Grades grades2 = new Grades(3.0, 4.5, 4.0, 3.0);
        Grades grades3 = new Grades(4.0, 3.0, 4.5, 3.5);
        Grades grades4 = new Grades(5.0, 3.5, 4.5, 4.5);

        HashMap<Students, Grades> studentsLists = new HashMap<>();

        studentsLists.put(student1, grades1);
        studentsLists.put(student2, grades2);
        studentsLists.put(student3, grades3);
        studentsLists.put(student4, grades4);

        System.out.println("Average grade for each student:");
        for (Map.Entry<Students, Grades> entry : studentsLists.entrySet()) {
            System.out.println(entry.getKey() + " : " + df.format(entry.getValue().getAverage()));
        }
    }
}

package kodilla.cannon;

import java.util.LinkedList;

public class MainApplication {
    public static void main(String[] args) {

        LinkedList<Cannon> cannons = new LinkedList<>();
        Cannon cannon1 = new Cannon("Cannon1", true);
        Cannon cannon2 = new Cannon("Cannon2", false);
        Cannon cannon3 = new Cannon("Cannon3", true);
        Cannon cannon4 = new Cannon("Cannon4", true);
        Cannon cannon5 = new Cannon("Cannon5", false);

        cannons.add(cannon1);
        cannons.add(cannon2);
        cannons.add(cannon3);
        cannons.add(cannon4);
        cannons.add(cannon5);

        cannon1.fire();
        cannon2.fire();
        cannon3.fire();
        cannon4.fire();
        cannon5.fire();
    }
}

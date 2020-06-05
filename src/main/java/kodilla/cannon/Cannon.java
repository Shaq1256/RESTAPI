package kodilla.cannon;

public class Cannon {
    String name;
    Boolean loaded;

    public Cannon(String name, Boolean loaded) {
        this.name = name;
        this.loaded = loaded;
    }

    public void fire() {
        if (loaded) {
            System.out.println(name + " Boom!!!");
        } else {
            System.out.println(name + " is not loaded.");
            System.out.println(name + " has been loaded");
            loaded = true;
            fire();
        }
    }
}

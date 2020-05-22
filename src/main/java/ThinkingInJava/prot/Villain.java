package ThinkingInJava.prot;

public class Villain {
    private String name;

    protected void set(String nm) {
        name = nm;
    }

    public Villain(String name) {
        this.name = name;
    }

    public String toString() {
        return "Jestem Łobuzem i mam na imie " + name;
    }
}

package ThinkingInJava.extention;

class Homar {
    int fish(int c) {
        System.out.println("fish int");
        return c;
    }
    double fish(double c) {
        System.out.println("fish double");
        return c;
    }
    String fish(String c) {
        System.out.println("fish String");
        return c;
    }
}

class Cod extends Homar {
    char fish(char c) {
        System.out.println("fish char");
        return c;
    }
}

public class Main {
    public static void main(String[] args) {
        Cod s = new Cod();
        s.fish(1);
        s.fish(2.0);
        s.fish("fish");
        s.fish('g');
    }
}

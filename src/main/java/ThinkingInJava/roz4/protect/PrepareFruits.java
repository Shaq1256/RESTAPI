package ThinkingInJava.roz4.protect;

public class PrepareFruits {
    public PrepareFruits() {
        System.out.println("Peel the fruit");
    }

    protected void eat(String fruit) {
        System.out.println("Eat the " + fruit + " !!!");
    }
}

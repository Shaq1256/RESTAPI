package ThinkingInJava.roz4.eenum;

public class Main {
    public static void main(String[] args) {
        for (Banknoty diengi : Banknoty.values()) {
            System.out.println(diengi + " waluta miejsce " + diengi.ordinal());
        }
        System.out.println(" ");
        Bank
                test1 = new Bank(Banknoty.DOLARY),
                test2 = new Bank(Banknoty.FUNTY),
                test3 = new Bank(Banknoty.ZLOTY);

        test1.Description();
        test2.Description();
        test3.Description();
    }

}

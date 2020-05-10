package ThinkingInJava.roz4.Enum;

public class Bank {
    Banknoty kasa;

    public Bank(Banknoty kasa) {
        this.kasa = kasa;
    }

    public void Description() {
        switch (kasa) {
            case EURO:
                System.out.println(" waluta obowiązująca w UE.");
                break;
            case YENY:
                System.out.println(" waluta obowiązująca w Chinach");
                break;
            case FUNTY:
                System.out.println(" waluta obowiązująca w Anglii");
                break;
            case ZLOTY:
                System.out.println(" waluta obowiązująca w Polsce");
                break;
            case DOLARY:
                System.out.println(" waluta obowiązująca w USA");
                break;
            default:
                System.out.println(" Niema takiej waluty");
        }
    }
}

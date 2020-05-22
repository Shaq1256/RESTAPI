package ThinkingInJava.connectionManager;

public class Main {
    public static void main(String[] args) {
        ConnectionManager protector = new ConnectionManager("ORP");
        protector.forward(100);
    }
}

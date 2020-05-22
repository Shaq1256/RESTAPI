package ThinkingInJava.connectionManager;

public class ConnectionManager {
  private String name;
  private Connection controls = new Connection();

    public ConnectionManager(String name) {
        this.name = name;
    }

    public void up(int i) {
        controls.up(i);
    }
    public void down(int i) {
        controls.down(i);
    }
    public void left(int i) {
        controls.left(i);
    }
    public void right(int i) {
        controls.right(i);
    }
    public void back(int i) {
        controls.back(i);
    }
    public void forward(int i) {
        controls.forward(i);
    }
    public void turboBoost() {
        controls.turboBoost();
    }
}

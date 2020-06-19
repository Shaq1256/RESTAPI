package kodilla.shape;

public class Square implements Shape {
    String name;
    Double field;

    public Square(String name, Double field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return null;
    }

    public Double getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Square name: '" + name + '\'' +
                ", field: " + field;
    }
}

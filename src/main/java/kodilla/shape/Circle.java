package kodilla.shape;

public class Circle implements Shape{
    String name;
    Double field;

    public Circle(String name, Double field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public Double getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Circle name: '" + name + '\'' +
                ", field: " + field;
    }
}

package kodilla.shape;

public class Triangle implements Shape {
    String name;
    Double field;

    public Triangle(String name, Double field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    public Double getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Triangle name: '" + name + '\'' +
                ", field: " + field;
    }
}

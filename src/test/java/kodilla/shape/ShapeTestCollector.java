package kodilla.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTestCollector {

    @Test
    public void addFigureTest() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Circle circle1 = new Circle("Circle1", 3.0);

        //When
        figure.addFigure(circle1);

        //Then
        Assert.assertEquals(1, figure.shapeList.size());
        Assert.assertEquals(circle1, figure.shapeList.get(0));
    }

    @Test
    public void removeFigureTest() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Triangle triangle1 = new Triangle("Triangle1", 5.0);

        //When
        figure.addFigure(triangle1);
        figure.removeFigures(triangle1);

        //Then
        Assert.assertEquals(0, figure.shapeList.size());
    }

    @Test
    public void getFigureTest() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Square square1 = new Square("Square1", 1.5);

        //When
        figure.addFigure(square1);
        System.out.println(figure.getFigure(0));

        //Then
        Assert.assertEquals(square1, figure.getFigure(0));
    }

    @Test
    public void showFigureTest() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Square square1 = new Square("Square1", 1.5);
        Triangle triangle1 = new Triangle("Triangle1", 5.0);
        Circle circle1 = new Circle("Circle1", 3.0);

        //When
        figure.addFigure(square1);
        figure.addFigure(triangle1);
        figure.addFigure(circle1);
        System.out.println(figure.shapeList);

        //Then
        Assert.assertEquals(3, figure.shapeList.size());

    }

}

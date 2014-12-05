package by.htp.krozov.sample.figures.model;

/**
 * Created by krozov on 05.12.14.
 */
public class Rectangle implements Figure {
    private Point pointA;
    private Point pointD;

    public Rectangle(Point pointA, Point pointD) {
        this.pointA = pointA;
        this.pointD = pointD;
    }

    @Override
    public double perimeter() {
        return 2 * (width() + height());
    }

    public int width() {
        return pointD.getX() - pointA.getX();
    }

    public int height() {
        return pointD.getY() - pointA.getY();
    }

    @Override
    public double square() {
        return width() * height();
    }
}

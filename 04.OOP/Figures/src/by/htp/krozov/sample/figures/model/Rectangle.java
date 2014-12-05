package by.htp.krozov.sample.figures.model;

/**
 * Created by krozov on 05.12.14.
 */
public class Rectangle extends Figure {
    // Top left point
    private Point topLeftPoint;
    // bottom right point
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    @Override
    public double perimeter() {
        return 2 * (width() + height());
    }

    public final int width() {
        return bottomRightPoint.getX() - topLeftPoint.getX();
    }

    public final int height() {
        return bottomRightPoint.getY() - topLeftPoint.getY();
    }

    @Override
    public double square() {
        return width() * height();
    }
}

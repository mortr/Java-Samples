package by.htp.krozov.sample.figures.model;

/**
 * Created by krozov on 05.12.14.
 */
public class Rectangle extends Figure {
    // Top left point
    protected Point topLeftPoint;
    // bottom right point
    protected Point bottomRightPoint;

    protected Rectangle(String name, Point topLeftPoint, Point bottomRightPoint) {
        super(name);
        if (topLeftPoint.getX() >= bottomRightPoint.getX()
                || topLeftPoint.getY() <= bottomRightPoint.getY()) {
            throw new RuntimeException("Illegal points for rectangle.");
        }

        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this("Rectangle", topLeftPoint, bottomRightPoint);
    }

    public Line getDiagonal() {
        return new Line(topLeftPoint, bottomRightPoint);
    }

    @Override
    public double perimeter() {
        return 2 * (width() + height());
    }

    public final int width() {
        return bottomRightPoint.getX() - topLeftPoint.getX();
    }

    public final int height() {
        return topLeftPoint.getY() - bottomRightPoint.getY();
    }

    @Override
    public double square() {
        return width() * height();
    }
}

package by.htp.krozov.sample.figures.model;

public class Square extends Rectangle {

    private final int width;

    public Square(Point topLeftPoint, Point bottomRightPoint) {
        super("Square", topLeftPoint, bottomRightPoint);
        if (super.width() != super.height()) {
            throw new RuntimeException("Can't be square");
        }
        this.width = bottomRightPoint.getX() - topLeftPoint.getX();
    }

    public Square(Point topLeftPoint, int width) {
        super("Square", topLeftPoint, new Point(topLeftPoint.getX() + width, topLeftPoint.getY() - width));
        this.width = bottomRightPoint.getX() - topLeftPoint.getX();
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double perimeter() {
        return width * 4;
    }

    @Override
    public double square() {
        return Math.pow(width, 2.);
    }
}

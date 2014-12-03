package by.htp.krozov.sample.figures.model;

/**
 * Created by krozov on 03.12.14.
 */
public class Line extends Figure {
    private Point pointA;
    private Point pointB;

    public Line(Point pointA, Point pointB) {
        super("Line");
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Line(Point point, Vector vector) {
        super("Line");
        this.pointA = point;
        this.pointB = new Point(point.getX() + vector.getX(), point.getY() + vector.getY());
    }

    @Override
    public void print() {
        System.out.print(this);
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    @Override
    public String toString() {
        return "Line{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                '}';
    }
}

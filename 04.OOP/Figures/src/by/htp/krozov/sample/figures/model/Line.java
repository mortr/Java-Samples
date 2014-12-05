package by.htp.krozov.sample.figures.model;

/**
 * Created by krozov on 03.12.14.
 */
public class Line {
    private Point pointA;
    private Point pointB;

    public Line(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Line(Point point, Vector vector) {
        this.pointA = point;
        this.pointB = new Point(point.getX() + vector.getX(), point.getY() + vector.getY());
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public double length() {
        return Math.hypot(pointA.getX() - pointB.getX(), pointA.getY() - pointB.getY());
    }

    @Override
    public String toString() {
        return "Line{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                '}';
    }
}

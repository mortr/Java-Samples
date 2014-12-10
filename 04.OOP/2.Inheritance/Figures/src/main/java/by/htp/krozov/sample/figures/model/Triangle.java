package by.htp.krozov.sample.figures.model;

/**
 * Created by krozov on 03.12.14.
 */
public class Triangle extends Figure {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    @Override
    public double perimeter() {
        double ab = pointA.distance(pointB);
        double ac = pointA.distance(pointC);
        double bc = pointB.distance(pointC);
        return ab + ac + bc;
    }

    @Override
    public double square() {
        double ab = pointA.distance(pointB);
        double ac = pointA.distance(pointC);
        double bc = pointB.distance(pointC);
        double halfPerimeter = (ab + ac + bc) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - ab) * (halfPerimeter - ac) * (halfPerimeter - bc));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Triangle triangle = (Triangle) o;
        return pointA.equals(triangle.pointA)
                && pointB.equals(triangle.pointB)
                && pointC.equals(triangle.pointC);

    }

    @Override
    public int hashCode() {
        int result = pointA.hashCode();
        result = 31 * result + pointB.hashCode();
        result = 31 * result + pointC.hashCode();
        return result;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }
}

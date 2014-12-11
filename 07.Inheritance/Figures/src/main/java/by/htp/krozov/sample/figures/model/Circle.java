package by.htp.krozov.sample.figures.model;

public class Circle extends Figure {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        super("Circle");
        if (radius <= 0) {
            throw new RuntimeException("Radius must be positive value");
        }
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

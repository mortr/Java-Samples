package by.htp.krozov.sample.figures.model;

/**
 * Created by krozov on 05.12.14.
 */
public abstract class Figure {
    private final String name;

    public Figure() {
        this(null);
    }

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double square();

    public abstract double perimeter();
}

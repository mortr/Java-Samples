package by.htp.krozov.sample.figures.model;

/**
 * Created by krozov on 03.12.14.
 */
public abstract class Figure {
    private String name;

    protected Figure(String name) {
        this.name = name;
    }

    public abstract void print();

    public String getName() {
        return name;
    }
}

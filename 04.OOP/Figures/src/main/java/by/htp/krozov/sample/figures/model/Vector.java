package by.htp.krozov.sample.figures.model;

import org.jetbrains.annotations.NotNull;

/**
 * Vector in 2D.
 */
public class Vector {
    protected int x;
    protected int y;

    public Vector(int x, int y) {
        // Неявный вызов конструктора суперкласса
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int scalarProduct(@NotNull Vector v) {
        return v.x * this.x + v.y * this.y;
    }

    public double length() {
        return Math.hypot(x, y);
    }
}

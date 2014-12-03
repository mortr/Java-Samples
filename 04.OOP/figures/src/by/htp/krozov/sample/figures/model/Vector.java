package by.htp.krozov.sample.figures.model;

import com.sun.istack.internal.NotNull;

/**
 * Vector in 2D.
 */
public class Vector {
    private int x;
    private int y;

    public Vector(int x, int y) {
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

    /**
     * Compute length of vector in coordinates.
     */
    public double length() {
        return Math.hypot(x, y);
    }
}

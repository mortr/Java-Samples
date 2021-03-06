package by.htp.krozov.sample.figures.model;

import org.jetbrains.annotations.NotNull;

/**
 * Vector in 2D.
 */
public class Vector3D extends Vector {
    private int z;

    public Vector3D(int x, int y, int z) {
        // Explicit call superclass constructor
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public int scalarProduct(@NotNull Vector3D v) {
        return super.scalarProduct(v) + v.z * z;
    }

    @Override
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}

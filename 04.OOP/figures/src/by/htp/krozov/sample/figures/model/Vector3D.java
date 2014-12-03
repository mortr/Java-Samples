package by.htp.krozov.sample.figures.model;

import com.sun.istack.internal.NotNull;

/**
 * Vector in 2D.
 */
public class Vector3D extends Vector {
    private int z;

    public Vector3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Vector3D(Vector vector) {
        super(vector.getX(), vector.getY());
    }

    public int getZ() {
        return z;
    }

    public int scalarProduct(@NotNull Vector3D v) {
        return super.scalarProduct(v) + v.z * this.z;
    }

    public double length() {
        return Math.hypot(super.length(), z);
    }
}

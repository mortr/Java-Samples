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

    public int getZ() {
        return z;
    }

    public int scalarProduct(@NotNull Vector3D v) {
        return super.scalarProduct(v) + v.z * this.z;
    }

    @Override
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}

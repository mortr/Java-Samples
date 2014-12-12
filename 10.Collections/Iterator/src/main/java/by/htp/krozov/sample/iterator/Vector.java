package by.htp.krozov.sample.iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Representation of vector in algebra. Access to item in native way.
 */
public final class Vector implements Iterable<Integer> {
    private final int[] values;

    /**
     * Create new vector with described size and all zero items.
     *
     * @throws java.lang.IllegalArgumentException WWhen vector size if negative value.
     */
    public Vector(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Vector size can't be negative value.");
        }
        values = new int[size];
    }

    public int[] toArray(){
        return Arrays.copyOf(values, values.length);
    }

    /**
     * Get vector item in described position.
     *
     * @param position Position of item.
     * @return Item in position.
     * @throws java.lang.IllegalArgumentException If index uot ou vector size bounds.
     */
    public int getItem(int position) {
        if (position < 1 || position > values.length) {
            throw new IllegalArgumentException("Item position must be in bounds [1, size()].");
        }
        return values[position - 1];
    }

    /**
     * Set vector item in described position.
     *
     * @param position Position of item.
     * @param value    New value of item.
     * @throws java.lang.IllegalArgumentException If index uot ou vector size bounds.
     */
    public void setItem(int position, int value) {
        if (position < 1 || position > values.length) {
            throw new IllegalArgumentException("Item position must be in bounds [1, size()].");
        }
        values[position - 1] = value;
    }

    /**
     * Get array size.
     */
    public int size() {
        return values.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Vector vector = (Vector) o;
        return Arrays.equals(values, vector.values);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(values);
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new VectorIterator();
    }

    private class VectorIterator implements Iterator<Integer> {
        private int currentItemIndex = 0;

        @Override
        public boolean hasNext() {
            // Check if current item index is in bounds.
            return currentItemIndex < values.length;
        }

        @Override
        public Integer next() {
            // Get current item and postfix increment it
            return values[currentItemIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Can't remove item.");
        }
    }
}

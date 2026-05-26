/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.number;

/**
 * {@link Number} as {@link Comparable}.
 *
 * <p>
 * There is no thread-safety guarantee.
 *
 * @since 1.0.0
 */
public final class ComparableNumber extends Number implements Comparable<ComparableNumber> {

    /**
     * Serialization marker.
     */
    private static final long serialVersionUID = -2598821437507165938L;

    /**
     * Wrapped number.
     */
    private final Number wrapped;

    /**
     * Ctor.
     * @param nbr Number
     */
    public ComparableNumber(final Number nbr) {
        super();
        this.wrapped = nbr;
    }

    @Override
    public int intValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public long longValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public float floatValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public double doubleValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int compareTo(final ComparableNumber nbr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.number;

/**
 * Envelope for the {@link Number}.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @since 1.0.0
 */
public abstract class NumberEnvelope extends Number {

    /**
     * Serialization marker.
     */
    private static final long serialVersionUID = -8562608838611967858L;

    /**
     * Wrapped Number.
     */
    private final Number wrapped;

    /**
     * Ctor.
     * @param wrapped Number
     */
    public NumberEnvelope(final Number wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public final int intValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final long longValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final float floatValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final double doubleValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final short shortValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final byte byteValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final boolean equals(final Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

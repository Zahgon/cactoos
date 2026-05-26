/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.number;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.cactoos.Scalar;
import org.cactoos.scalar.Unchecked;

/**
 * {@link Number} from {@link Scalar}s.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @since 1.0.0
 */
@SuppressWarnings("serial")
@SuppressFBWarnings({ "SE_NO_SERIALVERSIONID", "SE_BAD_FIELD" })
public final class NumberOfScalars extends Number {

    /**
     * The LONG number.
     */
    private final Scalar<Long> lnum;

    /**
     * The INT number.
     */
    private final Scalar<Integer> inum;

    /**
     * The FLOAT number.
     */
    private final Scalar<Float> fnum;

    /**
     * The DOUBLE number.
     */
    private final Scalar<Double> dnum;

    /**
     * Ctor.
     * @param nbr Number
     */
    public NumberOfScalars(final Scalar<? extends Number> nbr) {
        this(() -> nbr.value().longValue(), () -> nbr.value().intValue(), () -> nbr.value().floatValue(), () -> nbr.value().doubleValue());
    }

    /**
     * Ctor.
     * @param lnm Long scalar
     * @param inm Integer scalar
     * @param fnm Float scalar
     * @param dnm Long scalar
     * @checkstyle ParameterNumberCheck (5 lines)
     */
    public NumberOfScalars(final Scalar<Long> lnm, final Scalar<Integer> inm, final Scalar<Float> fnm, final Scalar<Double> dnm) {
        super();
        this.lnum = lnm;
        this.inum = inm;
        this.fnum = fnm;
        this.dnum = dnm;
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
    public String toString() {
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
}

/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Iterator that returns a set of double values.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @since 0.34
 */
public final class IteratorOfDoubles implements Iterator<Double> {

    /**
     * The list of items to iterate.
     */
    private final double[] items;

    /**
     * Current position.
     */
    private final AtomicInteger position;

    /**
     * Ctor.
     * @param items Items to iterate
     */
    @SuppressWarnings("PMD.ArrayIsStoredDirectly")
    public IteratorOfDoubles(final double... items) {
        this.items = items;
        this.position = new AtomicInteger(0);
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Double next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

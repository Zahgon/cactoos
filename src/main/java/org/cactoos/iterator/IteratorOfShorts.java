/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * {@link Iterator} that returns the {@code short}s as {@link Short}s.
 *
 * <p>There is no thread-safety guarantee.</p>
 *
 * @since 0.34
 */
public final class IteratorOfShorts implements Iterator<Short> {

    /**
     * The list of items to iterate.
     */
    private final short[] items;

    /**
     * Current position.
     */
    private final AtomicInteger position;

    /**
     * Ctor.
     * @param items Items to iterate
     */
    @SuppressWarnings("PMD.ArrayIsStoredDirectly")
    public IteratorOfShorts(final short... items) {
        this.items = items;
        this.position = new AtomicInteger(0);
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Short next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

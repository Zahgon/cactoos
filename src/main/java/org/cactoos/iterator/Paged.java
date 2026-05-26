/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import org.cactoos.Func;
import org.cactoos.func.UncheckedFunc;

/**
 * Paged iterator.
 * Elements will continue to be provided so long as {@code next} produces
 * non-empty iterators.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @param <X> Type of item
 * @since 0.49
 */
public final class Paged<X> implements Iterator<X> {

    /**
     * Current element.
     */
    private final AtomicReference<Iterator<? extends X>> current;

    /**
     * Function to get the next element.
     */
    private final Func<? super Iterator<? extends X>, ? extends Iterator<? extends X>> subsequent;

    /**
     * Ctor.
     * @param first First element
     * @param next Function to get the next element
     */
    public Paged(final Iterator<? extends X> first, final Func<? super Iterator<? extends X>, ? extends Iterator<? extends X>> next) {
        this.current = new AtomicReference<>(first);
        this.subsequent = next;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public X next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

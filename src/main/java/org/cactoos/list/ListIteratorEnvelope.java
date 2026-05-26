/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.list;

import java.util.ListIterator;

/**
 * {@link ListIterator} envelope.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @param <T> Items type
 * @since 0.47
 */
public abstract class ListIteratorEnvelope<T> implements ListIterator<T> {

    /**
     * Original list iterator.
     */
    private final ListIterator<T> origin;

    /**
     * Ctor.
     * @param iter Original list iterator
     */
    public ListIteratorEnvelope(final ListIterator<T> iter) {
        this.origin = iter;
    }

    @Override
    public final boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final T next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final boolean hasPrevious() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final T previous() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final int nextIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final int previousIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final void set(final T item) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final void add(final T item) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

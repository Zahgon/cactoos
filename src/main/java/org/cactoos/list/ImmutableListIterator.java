/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.list;

import java.util.ListIterator;

/**
 * Immutable {@link ListIterator} that doesn't allow mutations.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @param <T> Items type
 * @since 1.0
 */
public final class ImmutableListIterator<T> implements ListIterator<T> {

    /**
     * Original list iterator.
     */
    private final ListIterator<? extends T> origin;

    /**
     * Ctor.
     * @param iter Original list iterator
     */
    public ImmutableListIterator(final ListIterator<? extends T> iter) {
        this.origin = iter;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public T next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean hasPrevious() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public T previous() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int nextIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int previousIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void set(final T item) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void add(final T item) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

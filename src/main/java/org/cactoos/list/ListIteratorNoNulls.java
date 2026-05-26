/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.list;

import java.util.ListIterator;

/**
 * A decorator of {@link ListIterator} that tolerates no NULLs.
 *
 * <p>There is no thread-safety guarantee.</p>
 *
 * @param <T> Element type
 * @since 0.39
 */
public final class ListIteratorNoNulls<T> implements ListIterator<T> {

    /**
     * ListIterator.
     */
    private final ListIterator<T> listiterator;

    /**
     * Ctor.
     * @param src List iterator
     */
    public ListIteratorNoNulls(final ListIterator<T> src) {
        this.listiterator = src;
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

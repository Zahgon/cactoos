/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.iterator;

import java.util.Iterator;

/**
 * Decorator that doesn't allow removal from the wrapped {@link Iterator}.
 *
 * <p>There is no thread-safety guarantee.</p>
 *
 * @param <T> Element type
 * @since 0.32
 */
public final class Immutable<T> implements Iterator<T> {

    /**
     * Decorated iterator.
     */
    private final Iterator<? extends T> iterator;

    /**
     * Ctor.
     * @param iter Iterator to make immutable
     */
    public Immutable(final Iterator<? extends T> iter) {
        this.iterator = iter;
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
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

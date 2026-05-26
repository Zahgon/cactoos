/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.iterator;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * {@link Iterator} that delegates to another {@link Iterator}.
 *
 * <p>There is no thread-safety guarantee.</p>
 *
 * @param <X> Type of item
 * @since 0.43
 */
public abstract class IteratorEnvelope<X> implements Iterator<X> {

    /**
     * Wrapped {@link Iterator}.
     */
    private final Iterator<? extends X> wrapped;

    /**
     * Ctor.
     * @param iter The {@link Iterator} to wrap
     */
    public IteratorEnvelope(final Iterator<? extends X> iter) {
        this.wrapped = iter;
    }

    @Override
    public final boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final X next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final void forEachRemaining(final Consumer<? super X> action) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final String toString() {
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
}

/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.collection;

import java.util.Collection;
import org.cactoos.iterable.IterableEnvelope;

/**
 * Base collection.
 *
 * <p>There is no thread-safety guarantee.</p>
 *
 * @param <X> Element type
 * @since 0.23
 */
@SuppressWarnings("PMD.TooManyMethods")
public abstract class CollectionEnvelope<X> extends IterableEnvelope<X> implements Collection<X> {

    /**
     * The wrapped collection.
     */
    private final Collection<X> col;

    /**
     * Ctor.
     * @param col The wrapped collection
     */
    public CollectionEnvelope(final Collection<X> col) {
        super(col);
        this.col = col;
    }

    @Override
    public final int size() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final boolean contains(final Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final Object[] toArray() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final <T> T[] toArray(final T[] array) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final boolean add(final X item) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final boolean remove(final Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final boolean containsAll(final Collection<?> list) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final boolean addAll(final Collection<? extends X> list) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final boolean removeAll(final Collection<?> list) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final boolean retainAll(final Collection<?> list) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

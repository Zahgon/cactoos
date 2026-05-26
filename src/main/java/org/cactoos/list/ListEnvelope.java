/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.list;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.cactoos.collection.CollectionEnvelope;

/**
 * {@link List} envelope.
 *
 * <p>There is no thread-safety guarantee.</p>
 *
 * @param <T> Element type
 * @since 0.23
 * @checkstyle AbstractClassNameCheck (500 lines)
 */
public abstract class ListEnvelope<T> extends CollectionEnvelope<T> implements List<T> {

    /**
     * Encapsulated list.
     */
    private final List<T> list;

    /**
     * Ctor.
     * @param list Encapsulated list
     */
    public ListEnvelope(final List<T> list) {
        super(list);
        this.list = list;
    }

    @Override
    public final boolean addAll(final int index, final Collection<? extends T> items) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final T get(final int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final T set(final int index, final T element) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final void add(final int index, final T element) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final T remove(final int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final int indexOf(final Object item) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final int lastIndexOf(final Object item) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final ListIterator<T> listIterator(final int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final List<T> subList(final int start, final int end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

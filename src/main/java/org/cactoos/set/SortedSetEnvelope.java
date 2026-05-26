/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.set;

import java.util.Comparator;
import java.util.SortedSet;

/**
 * SortedSet envelope.
 * <p>There is no thread-safety guarantee.</p>
 * @param <T> Element type
 * @since 0.45
 * @checkstyle AbstractClassNameCheck (500 lines)
 */
public abstract class SortedSetEnvelope<T> extends SetEnvelope<T> implements SortedSet<T> {

    /**
     * The original Set this object delegates to.
     */
    private final SortedSet<T> origin;

    /**
     * Primary ctor.
     * @param origin The original SortedSet to delegate to
     */
    protected SortedSetEnvelope(final SortedSet<T> origin) {
        super(origin);
        this.origin = origin;
    }

    @Override
    public final Comparator<? super T> comparator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final SortedSet<T> subSet(final T begin, final T end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final SortedSet<T> headSet(final T end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final SortedSet<T> tailSet(final T from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final T first() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final T last() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

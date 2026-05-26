/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.cactoos.iterable.Mapped;
import org.cactoos.scalar.HashCode;
import org.cactoos.text.Concatenated;
import org.cactoos.text.Joined;
import org.cactoos.text.TextOf;

/**
 * Map envelope.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @param <X> Type of key
 * @param <Y> Type of value
 * @since 0.24
 * @checkstyle AbstractClassNameCheck (500 lines)
 */
@SuppressWarnings("PMD.TooManyMethods")
public abstract class MapEnvelope<X, Y> implements Map<X, Y> {

    /**
     * The map.
     */
    private final Map<X, Y> map;

    /**
     * Ctor.
     * @param original The original map
     */
    public MapEnvelope(final Map<X, Y> original) {
        this.map = original;
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
    public final boolean containsKey(final Object key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final boolean containsValue(final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final Y get(final Object key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final Y put(final X key, final Y value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final Y remove(final Object key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final void putAll(final Map<? extends X, ? extends Y> extra) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final Set<X> keySet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final Collection<Y> values() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final Set<Map.Entry<X, Y>> entrySet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final boolean equals(final Object other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

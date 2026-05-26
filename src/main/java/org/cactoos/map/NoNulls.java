/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.cactoos.text.FormattedText;
import org.cactoos.text.UncheckedText;

/**
 * A decorator of {@link Map} that tolerates no NULLs.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @param <K> Type of key
 * @param <V> Type of value
 * @since 0.27
 */
@SuppressWarnings("PMD.TooManyMethods")
public class NoNulls<K, V> implements Map<K, V> {

    /**
     * The map.
     */
    private final Map<K, V> map;

    /**
     * Ctor.
     * @param origin The scalar
     */
    public NoNulls(final Map<K, V> origin) {
        this.map = origin;
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
    public final V get(final Object key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final V put(final K key, final V value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final V remove(final Object key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @SuppressWarnings("unchecked")
    public final void putAll(final Map<? extends K, ? extends V> items) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final Set<K> keySet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final Collection<V> values() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

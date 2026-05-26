/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.scalar;

import org.cactoos.Bytes;
import org.cactoos.Scalar;

/**
 * Equality.
 *
 * Returns:
 *         the value {@code 0} if {@code x == y};
 *         the value {@code -1} if {@code x < y};
 *         the value {@code 1} if {@code x > y}
 *
 * <p>There is no thread-safety guarantee.
 *
 * @param <T> Type of input
 * @since 0.31
 */
public final class Equality<T extends Bytes> implements Scalar<Integer> {

    /**
     * Left.
     */
    private final T left;

    /**
     * Right.
     */
    private final T right;

    /**
     * Ctor.
     * @param lft Left
     * @param rght Right
     */
    public Equality(final T lft, final T rght) {
        this.left = lft;
        this.right = rght;
    }

    @Override
    public Integer value() throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

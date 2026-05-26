/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.proc;

import org.cactoos.BiProc;

/**
 * BiProc check for no nulls.
 * @param <X> Type of input
 * @param <Y> Type of input
 * @since 0.20
 */
public final class BiProcNoNulls<X, Y> implements BiProc<X, Y> {

    /**
     * The proc.
     */
    private final BiProc<? super X, ? super Y> origin;

    /**
     * Ctor.
     * @param proc The function
     */
    public BiProcNoNulls(final BiProc<? super X, ? super Y> proc) {
        this.origin = proc;
    }

    @Override
    public void exec(final X first, final Y second) throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

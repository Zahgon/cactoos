/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.bytes;

import org.cactoos.Bytes;

/**
 * Bytes check for no nulls.
 * @since 0.11
 */
public final class NoNulls implements Bytes {

    /**
     * The input.
     */
    private final Bytes origin;

    /**
     * Ctor.
     * @param bytes The input
     */
    public NoNulls(final Bytes bytes) {
        this.origin = bytes;
    }

    @Override
    public byte[] asBytes() throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

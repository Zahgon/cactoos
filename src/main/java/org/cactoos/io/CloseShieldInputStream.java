/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Decorator of {@link InputStream} to prevent it
 * to be closed.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @since 1.0.0
 */
public final class CloseShieldInputStream extends InputStream {

    /**
     * Inner {@link InputStream}.
     */
    private final AtomicReference<InputStream> inner;

    /**
     * Ctor.
     * @param origin Origin
     */
    public CloseShieldInputStream(final InputStream origin) {
        super();
        this.inner = new AtomicReference<>(origin);
    }

    @Override
    public int read() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int read(final byte[] buffer) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int read(final byte[] buffer, final int offset, final int length) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public long skip(final long num) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int available() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void mark(final int limit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void reset() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean markSupported() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

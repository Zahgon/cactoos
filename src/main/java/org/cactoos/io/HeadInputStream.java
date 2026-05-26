/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Input stream that only shows the first N bytes of the original stream.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @since 0.31
 */
public final class HeadInputStream extends InputStream {

    /**
     * Original input stream.
     */
    private final InputStream origin;

    /**
     * A number of bytes that can be read from the beginning.
     */
    private final long length;

    /**
     * Current number or read bytes.
     */
    private long processed;

    /**
     * Ctor.
     * @param orig The original input stream
     * @param len A number of bytes that can be read from the beginning
     */
    public HeadInputStream(final InputStream orig, final int len) {
        super();
        this.origin = orig;
        this.length = len;
    }

    @Override
    public int read() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public long skip(final long skip) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void reset() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int available() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean markSupported() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void mark(final int readlimit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

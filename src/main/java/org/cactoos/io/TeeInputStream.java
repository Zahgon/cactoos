/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Stream that copies input to output.
 * <b>WARNING:</b>
 * This class closes {@link TeeInputStream#output}
 * after {@link TeeInputStream#close()}.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @since 0.1
 */
public final class TeeInputStream extends InputStream {

    /**
     * Input.
     */
    private final InputStream input;

    /**
     * Output.
     */
    private final OutputStream output;

    /**
     * Ctor.
     * @param src Source of data
     * @param tgt Destination of data
     */
    public TeeInputStream(final InputStream src, final OutputStream tgt) {
        super();
        this.input = src;
        this.output = tgt;
    }

    @Override
    public int read() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int read(final byte[] buf) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int read(final byte[] buf, final int offset, final int len) throws IOException {
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
    public void close() throws IOException {
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

/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.io;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Stream that copies output to output.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @since 0.16
 */
@SuppressWarnings("PMD.UseTryWithResources")
public final class TeeOutputStream extends OutputStream {

    /**
     * Output.
     */
    private final OutputStream target;

    /**
     * Copy.
     */
    private final OutputStream copy;

    /**
     * Ctor.
     * @param tgt Destination of data
     * @param mirror Copy
     */
    public TeeOutputStream(final OutputStream tgt, final OutputStream mirror) {
        super();
        this.target = tgt;
        this.copy = mirror;
    }

    @Override
    public void write(final int data) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void write(final byte[] buf) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void write(final byte[] buf, final int off, final int len) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void flush() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

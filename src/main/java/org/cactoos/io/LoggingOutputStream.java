/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.io;

import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.cactoos.Scalar;
import org.cactoos.scalar.Sticky;
import org.cactoos.scalar.Unchecked;
import org.cactoos.text.FormattedText;
import org.cactoos.text.UncheckedText;

/**
 * Logged output stream.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @since 0.29
 */
@SuppressWarnings("PMD.UnnecessaryLocalRule")
public final class LoggingOutputStream extends OutputStream {

    /**
     * The output stream.
     */
    private final OutputStream origin;

    /**
     * Where the data comes goes.
     */
    private final String destination;

    /**
     * The logger, deferred.
     */
    private final Unchecked<Logger> logger;

    /**
     * The bytes read.
     */
    private final AtomicLong bytes;

    /**
     * The time took to read.
     */
    private final AtomicLong time;

    /**
     * Ctor.
     * @param output Destination of data
     * @param dst The name of source data
     */
    public LoggingOutputStream(final OutputStream output, final String dst) {
        this(output, dst, () -> Logger.getLogger(dst));
    }

    /**
     * Ctor.
     * @param output Destination of data
     * @param dst The name of source data
     * @param lgr Message logger
     */
    public LoggingOutputStream(final OutputStream output, final String dst, final Logger lgr) {
        this(output, dst, () -> lgr);
    }

    /**
     * Ctor.
     * @param output Destination of data
     * @param dst The name of source data
     * @param lgr Message logger, deferred
     */
    private LoggingOutputStream(final OutputStream output, final String dst, final Scalar<Logger> lgr) {
        super();
        this.origin = output;
        this.destination = dst;
        this.logger = new Unchecked<>(new Sticky<>(lgr));
        this.bytes = new AtomicLong();
        this.time = new AtomicLong();
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
    public void write(final byte[] buf, final int offset, final int len) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void flush() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

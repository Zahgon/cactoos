/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.io;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.cactoos.scalar.Sticky;
import org.cactoos.scalar.Unchecked;
import org.cactoos.text.FormattedText;
import org.cactoos.text.UncheckedText;

/**
 * Logged input stream.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @since 0.29
 */
@SuppressWarnings("PMD.UnnecessaryLocalRule")
public final class LoggingInputStream extends InputStream {

    /**
     * The input stream.
     */
    private final InputStream origin;

    /**
     * Where the data comes from.
     */
    private final String source;

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
     * Logger level.
     */
    private final Unchecked<Level> level;

    /**
     * Ctor.
     * @param input Source of data
     * @param src The name of source data
     */
    public LoggingInputStream(final InputStream input, final String src) {
        this(input, src, () -> Logger.getLogger(src));
    }

    /**
     * Ctor.
     * @param input Source of data
     * @param src The name of source data
     * @param lgr The message logger
     */
    public LoggingInputStream(final InputStream input, final String src, final Logger lgr) {
        this(input, src, () -> lgr);
    }

    /**
     * Ctor.
     * @param input Source of data
     * @param src The name of source data
     * @param lgr The message logger, deferred
     * @checkstyle ParameterNumberCheck (15 lines)
     */
    private LoggingInputStream(final InputStream input, final String src, final org.cactoos.Scalar<Logger> lgr) {
        super();
        this.origin = input;
        this.source = src;
        this.logger = new Unchecked<>(new Sticky<>(lgr));
        this.level = new Unchecked<>(new Sticky<>(() -> {
            Level lvl = this.logger.value().getLevel();
            if (lvl == null) {
                Logger parent = this.logger.value();
                while (lvl == null) {
                    parent = parent.getParent();
                    lvl = parent.getLevel();
                }
            }
            return lvl;
        }));
        this.bytes = new AtomicLong();
        this.time = new AtomicLong();
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

/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * {@link Iterator} that returns an exception from the exception stack trace.
 *
 * <p>There is no thread-safety guarantee.</p>
 *
 * @since 0.56
 */
public final class IteratorOfStackTrace implements Iterator<Throwable> {

    /**
     * The exception to iterate.
     */
    private Throwable exception;

    /**
     * Ctor.
     * @param exc The exception to iterate
     */
    public IteratorOfStackTrace(final Throwable exc) {
        this.exception = exc;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Throwable next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

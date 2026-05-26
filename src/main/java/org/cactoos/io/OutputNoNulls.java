/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.io;

import java.io.IOException;
import java.io.OutputStream;
import org.cactoos.Output;

/**
 * Output check for no nulls.
 * @since 0.10
 */
public final class OutputNoNulls implements Output {

    /**
     * The output.
     */
    private final Output origin;

    /**
     * Ctor.
     * @param output The output
     */
    public OutputNoNulls(final Output output) {
        this.origin = output;
    }

    @Override
    public OutputStream stream() throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

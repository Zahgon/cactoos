/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.io;

import java.io.IOException;
import java.io.InputStream;
import org.cactoos.Input;

/**
 * Input check for no nulls.
 * @since 0.10
 */
public final class InputNoNulls implements Input {

    /**
     * The input.
     */
    private final Input origin;

    /**
     * Ctor.
     * @param input The input
     */
    public InputNoNulls(final Input input) {
        this.origin = input;
    }

    @Override
    public InputStream stream() throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

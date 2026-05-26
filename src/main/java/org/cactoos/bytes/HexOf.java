/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.bytes;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Iterator;
import org.cactoos.Bytes;
import org.cactoos.Text;
import org.cactoos.iterator.Mapped;
import org.cactoos.text.FormattedText;

/**
 * Decodes origin {@link Text} using the hexadecimal encoding scheme.
 * @since 0.30
 */
public final class HexOf implements Bytes {

    /**
     * Origin hexadecimal text.
     */
    private final Text origin;

    /**
     * Ctor.
     * @param origin Hexadecimal text
     */
    public HexOf(final Text origin) {
        this.origin = origin;
    }

    @Override
    public byte[] asBytes() throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

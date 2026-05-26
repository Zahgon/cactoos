/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.func;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.cactoos.TriFunc;

/**
 * A String splitter preserving all tokens.
 * Unlike regular Split, stores empty "" tokens
 * created by adjacent regex separators.
 *
 * <p>
 *     Examples:
 *     1) text - " hello there ", regex - " "
 *     result: ["", "hello", "there", ""]
 *     2) text - "aaa", regex - "a"
 *     result: ["", "", "", ""]
 * </p>
 *
 * @since 0.0
 */
public final class TriFuncSplitPreserve implements TriFunc<String, String, Integer, Collection<String>> {

    @Override
    public Collection<String> apply(final String str, final String regex, final Integer lmt) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

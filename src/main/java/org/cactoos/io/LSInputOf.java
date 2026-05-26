/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos.io;

import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import org.cactoos.Input;
import org.cactoos.text.TextOf;
import org.cactoos.text.UncheckedText;
import org.w3c.dom.ls.LSInput;

/**
 * Input as LSInput.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @since 0.6
 * @checkstyle AbbreviationAsWordInNameCheck (10 lines)
 */
public final class LSInputOf implements LSInput {

    /**
     * The input.
     */
    private final Input input;

    /**
     * PublicID.
     */
    private final String pid;

    /**
     * SystemID.
     */
    private final String sid;

    /**
     * Base.
     */
    private final String base;

    /**
     * Ctor.
     * @param data Input
     */
    public LSInputOf(final Input data) {
        this(data, "#public", "#system", "#base");
    }

    /**
     * Ctor.
     * @param data Input
     * @param pubid PublicID
     * @param sysid SystemID
     * @param bse Base
     * @checkstyle ParameterNumberCheck (3 lines)
     */
    public LSInputOf(final Input data, final String pubid, final String sysid, final String bse) {
        this.input = data;
        this.pid = pubid;
        this.sid = sysid;
        this.base = bse;
    }

    @Override
    public Reader getCharacterStream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setCharacterStream(final Reader stream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public InputStream getByteStream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setByteStream(final InputStream stream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getStringData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setStringData(final String data) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getSystemId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setSystemId(final String sysid) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getPublicId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setPublicId(final String pubid) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getBaseURI() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setBaseURI(final String uri) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getEncoding() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setEncoding(final String encoding) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean getCertifiedText() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setCertifiedText(final boolean text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

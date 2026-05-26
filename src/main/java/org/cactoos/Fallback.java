/*
 * SPDX-FileCopyrightText: Copyright (c) 2017-2026 Yegor Bugayenko
 * SPDX-License-Identifier: MIT
 */
package org.cactoos;

import org.cactoos.iterable.IterableOf;
import org.cactoos.iterable.Mapped;
import org.cactoos.number.MinOf;
import org.cactoos.scalar.InheritanceLevel;

/**
 * Fallback from a {@link Throwable}.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @param <X> Type of input
 * @since 1.0
 */
public interface Fallback<X> extends Func<Throwable, X> {

    /**
     * Calculate level of support of the given exception type.
     * @param exception Exception
     * @return Level of support: greater or equals to 0 if the target
     *  is supported and {@link Integer#MIN_VALUE} otherwise
     */
    int support(Throwable exception);

    /**
     * Fallback from exception.
     *
     * <p>There is no thread-safety guarantee.
     *
     * @param <T> Type of result
     * @since 1.0
     */
    final class From<T> implements Fallback<T> {

        /**
         * The list of exceptions supported by this instance.
         */
        private final Iterable<Class<? extends Throwable>> exceptions;

        /**
         * Function that converts exceptions to the required type.
         */
        private final Func<Throwable, T> func;

        /**
         * Ctor.
         * @param exp Supported exception type
         * @param func Function that converts the given exception into required one
         */
        @SuppressWarnings("unchecked")
        public From(final Class<? extends Throwable> exp, final Func<Throwable, T> func) {
            this(new IterableOf<>(exp), func);
        }

        /**
         * Ctor.
         * @param exps Supported exceptions types
         * @param func Function that converts the given exception into required one
         */
        public From(final Iterable<Class<? extends Throwable>> exps, final Func<Throwable, T> func) {
            this.exceptions = exps;
            this.func = func;
        }

        @Override
        public T apply(final Throwable exp) throws Exception {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public int support(final Throwable exception) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * No fallback. Throw unchecked exception.
     * @param <X> Type of result
     * @since 1.0
     */
    final class None<X> implements Fallback<X> {

        @Override
        public int support(final Throwable exception) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public X apply(final Throwable input) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}

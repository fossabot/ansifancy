/*
 * The MIT License
 *
 * Copyright 2019 SensibleMetrics Labs, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.sensiblemetrics.ansifancy.model.iface;

import lombok.NonNull;

import java.io.Serializable;

/**
 * Point interface declaration {@link CharSequence}
 *
 * @author Alexander Rogalskiy
 * @version 1.0
 */
public interface PointIF extends Serializable {

    /**
     * Default point type enumeration
     */
    enum PointType {
        FOREGROUND_COLOR,
        BACKGROUND_COLOR,
        CURSOR_CONTROL,
        DECORATION_CONTROL,
        SERVICE_CONTROL,
        IDEOGRAM
    }

    /**
     * Returns {@link PointType}
     *
     * @return {@link PointType}
     */
    @NonNull
    PointType getType();

    /**
     * Returns point symbol {@code T}
     *
     * @param <T> type of point symbol
     * @return point symbol {@code T}
     */
    <T extends CharSequence> T getSymbol();

    /**
     * Returns point code {@code T}
     *
     * @param <T> type of point code
     * @return point code {@code T}
     */
    <T extends CharSequence> T getCode();
}

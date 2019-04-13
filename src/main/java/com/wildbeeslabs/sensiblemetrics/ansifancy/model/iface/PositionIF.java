/*
 * The MIT License
 *
 * Copyright 2019 WildBees Labs, Inc.
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
package com.wildbeeslabs.sensiblemetrics.ansifancy.model.iface;

import java.io.Serializable;

/**
 * Position interface declaration
 *
 * @author Alexander Rogalskiy
 * @version 1.0
 */
public interface PositionIF<T> extends Serializable, Cloneable {

    /**
     * Returns {@link PositionIF} row
     *
     * @return {@link PositionIF} row
     */
    T getRow();

    /**
     * Returns {@link PositionIF} column
     *
     * @return {@link PositionIF} column
     */
    T getColumn();

    /**
     * Returns {@link PositionIF} depth
     *
     * @return {@link PositionIF} depth
     */
    T getDepth();

    /**
     * Returns {@link PositionIF} length
     *
     * @return {@link PositionIF} length
     */
    double length();
}
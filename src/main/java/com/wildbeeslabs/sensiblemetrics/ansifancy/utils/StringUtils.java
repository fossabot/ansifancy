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
package com.wildbeeslabs.sensiblemetrics.ansifancy.utils;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;

/**
 * String utilities
 */
@Slf4j
@UtilityClass
public class StringUtils {

    /**
     * Default format prefix
     */
    private static final String DEFAULT_SYMBOL_PREFIX = "*";
    /**
     * Default numeric pattern format
     */
    public static final String DEFAULT_FORMAT_PATTERN = "#.##";
    /**
     * Default decimal format instance {@link DecimalFormat}
     */
    public static final ThreadLocal<DecimalFormat> DEFAULT_DECIMAL_FORMATTER = ThreadLocal.withInitial(() -> {
        final DecimalFormatSymbols decimalSymbols = DecimalFormatSymbols.getInstance();
        decimalSymbols.setDecimalSeparator('.');
        return new DecimalFormat(DEFAULT_FORMAT_PATTERN, decimalSymbols);
    });

    public static String getString(final String value) {
        return getString(DEFAULT_SYMBOL_PREFIX, value);
    }

    public static String getString(final String... values) {
        return getStringByDelimiter(org.apache.commons.lang3.StringUtils.EMPTY, values);
    }

    public static String getStringByDelimiter(final String delimiter, final String... values) {
        return org.apache.commons.lang3.StringUtils.join(values, delimiter);
    }

    /**
     * Returns string formatted decimal number by default formatter instance {@link DecimalFormat}
     *
     * @param num - initial input decimal number
     * @return string formatted decimal number
     */
    public static String format(double num) {
        return DEFAULT_DECIMAL_FORMATTER.get().format(num);
    }

    /**
     * Returns localized string message {@link String} by initial raw message {@link String} and input parameters
     *
     * @param message - initial input raw string message {@link String}
     * @param args    - initial input array of arguments
     * @return localized string message {@link String}
     */
    public static String getLocaleMessage(final String message, final Object... args) {
        return formatMessage(Locale.getDefault(), message, args);
    }

    /**
     * Returns formatted string message {@link String} by initial raw message {@link String}, locale {@link Locale} and input parameters
     *
     * @param locale  - initial input locale source {@link Locale}
     * @param message - initial input raw string message {@link String}
     * @param args    - initial input array of arguments
     * @return formatted string message {@link String}
     */
    public static String formatMessage(final Locale locale, final String message, final Object... args) {
        Objects.requireNonNull(locale, "Locale should not be null");
        Objects.requireNonNull(message, "Message should not be null");
        return String.format(locale, message, args);
    }
}
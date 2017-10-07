package com.lloydsbanking.salsa.loans.common;

public class StringUtils {
    public static String ensureEndsWith(String text, char ch) {
        if (text == null || text.length() == 0 || text.charAt(text.length() - 1) == ch) {
            return text;
        }
        return text + ch;
    }
}

package com.yourcodereview.sergey.task1.service.shortlinkgenerate;

import org.springframework.stereotype.Service;

@Service
public class ShortLinkGenerator {

    private static final char[] POSSIBLE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
    private static final int POSSIBLE_CHARS_COUNT = POSSIBLE_CHARS.length;

    public String generateShortUrl(String link) {
        int hash = link.hashCode();
        return getLetters(hash, "");
    }

    private String getLetters(int hash, String prefix) {
        hash = Math.abs(hash);
        int quotient = hash / POSSIBLE_CHARS_COUNT;
        int remainder = hash % POSSIBLE_CHARS_COUNT;
        if (quotient < 1) return prefix + POSSIBLE_CHARS[remainder];
        return getLetters(quotient, prefix + POSSIBLE_CHARS[remainder]);
    }
}

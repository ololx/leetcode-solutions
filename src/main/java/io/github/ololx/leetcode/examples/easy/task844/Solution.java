package io.github.ololx.leetcode.examples.easy.task844;

/**
 * project leetcode-solutions
 * created 01.05.2022 20:36
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean backspaceCompare(String s, String t) {
        if (s == null && t != null) {
            return false;
        } else if (s != null && t == null) {
            return false;
        }

        StringBuilder sBuilder = new StringBuilder();
        StringBuilder tBuilder = new StringBuilder();

        int maxLength = Math.max(s.length(), t.length());

        for (int charIndex = 0; charIndex < maxLength; charIndex++) {
            if (s.length() > charIndex) {
                Character sChar = s.charAt(charIndex);

                if (sChar == '#') {
                    int sBuilderLength = sBuilder.length();
                    if (sBuilderLength == 0) {
                        break;
                    }

                    sBuilder.deleteCharAt(sBuilderLength - 1);
                } else {
                    sBuilder.append(s.charAt(charIndex));
                }
            }

            if (t.length() > charIndex) {
                Character tChar = t.charAt(charIndex);

                if (tChar == '#') {
                    int tBuilderLength = tBuilder.length();
                    if (tBuilderLength == 0) {
                        break;
                    }

                    tBuilder.deleteCharAt(tBuilderLength - 1);
                } else {
                    tBuilder.append(t.charAt(charIndex));
                }
            }
        }

        return sBuilder.compareTo(tBuilder) == 0;
    }
}

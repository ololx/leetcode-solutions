package io.github.ololx.leetcode.examples.easy.task1768;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 29.07.2022 14:11
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"abc", "pqr", "apbqcr"},
                {"ab", "pqrs", "apbqrs"},
                {"abcd", "pq", "apbqcd"},
        };
    }

    @Test(dataProvider = "providesStrings")
    public void mergeAlternately_whenStr1AndStr2IsNotEmpty_thenMergedString(String str1 ,
                                                                            String str2,
                                                                            String expected) {
        assertEquals(new Solution().mergeAlternately(str1, str2), expected);
    }
}

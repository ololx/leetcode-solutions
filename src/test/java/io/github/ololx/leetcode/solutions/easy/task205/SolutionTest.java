package io.github.ololx.leetcode.solutions.easy.task205;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 12.02.2022 17:56
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "strings")
    public static Object[][] strings() {
        return new Object[][] {
                {"badc", "baba", false},
                {"egg", "add", true},
                {"paper", "title", true},
                {"foo", "bar", false}
        };
    }

    @Test(dataProvider = "strings")
    public void isIsomorphic_whenStringsAreIsomorphic_thenReturnTrue(String s , String t, boolean isIsomorphic) {
        assertEquals(new Solution().isIsomorphic(s, t), isIsomorphic);
    }
}

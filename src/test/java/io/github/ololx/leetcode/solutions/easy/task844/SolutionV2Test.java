package io.github.ololx.leetcode.solutions.easy.task844;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 03.05.2022 12:55
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2Test {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"y#fo##f", "y#f#o##f", true},
                {"xywrrmp", "xywrrm#p", false},
                {"a##c", "#a#c", true},
                {"ab#c", "ad#c", true},
                {"ab##", "c#d#", true},
                {"a#c", "b", false}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesStrings")
    public void backspaceCompare_whenBoothAreNotNull_thenReturnCompareResult(String s, String t, boolean expected) {
        boolean actual = new SolutionV2().backspaceCompare(s, t);

        assertEquals(actual, expected);
    }
}

package io.github.ololx.leetcode.examples.easy.task844;

import io.github.ololx.leetcode.examples.easy.task844.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 02.05.2022 08:20
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"a##c", "#a#c", true},
                //{"ab#c", "ad#c", true},
                //{"ab##", "c#d#", true},
                //{"a#c", "b", false},
        };
    }

    @Test(dataProvider = "providesStrings")
    public void backspaceCompare_whenBoothAreNotNull_thenReturnCompareResult(String s, String t, boolean expected) {
        boolean actual = new Solution().backspaceCompare(s, t);

        assertEquals(actual, expected);
    }
}

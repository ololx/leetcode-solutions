package io.github.ololx.leetcode.examples.easy.task2042;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 13.02.2022 17:03
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "sentencesAndResult")
    public static Object[][] sentencesAndResult() {
        return new Object[][] {
                {"1 box has 3 blue 4 red 6 green and 12 yellow marbles", true},
                {"hello world 5 x 5", false},
                {"sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s", false}
        };
    }

    @Test(dataProvider = "sentencesAndResult")
    public void areNumbersAscending_whenNumbersAscending_thenReturnTrue(String sentence , boolean result) {
        assertEquals(new Solution().areNumbersAscending(sentence), result);
    }
}

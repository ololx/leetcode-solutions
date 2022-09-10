package io.github.ololx.leetcode.solutions.easy.task744;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 29.05.2022 16:49
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesLettersAndTarget")
    public static Object[][] providesLettersAndTarget() {
        return new Object[][] {
                {new char[] {'c','f','j'}, 'a', 'c'},
                {new char[] {'c','f','j'}, 'c', 'f'},
                {new char[] {'c','f','j'}, 'a', 'c'},
                {new char[] {'c','f','j'}, 'd', 'f'},
        };
    }

    @Test(dataProvider = "providesLettersAndTarget")
    public void mySqrt_whenXMoreThanOne_thenReturnSQRTRounded(char[] letters,
                                                              char target,
                                                              char expected) {
        assertEquals(new Solution().nextGreatestLetter(letters, target), expected);
    }
}

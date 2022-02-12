package io.github.ololx.leetcode.examples.easy.task9;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 08.02.2022 16:30
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "numbers")
    public static Object[][] numbers() {
        return new Object[][] {
                {121, true},
                {123, false},
                {-121, false},
                {1987667891, true},
                {1000000001, true},
                {1221, true}
        };
    }

    @Test(dataProvider = "numbers")
    public void isPalindrome_whenNumberIsPalindrome_thenReturnTrue(int number, boolean isPalindrome) {
        assertEquals(
                new Solution().isPalindrome(number),
                isPalindrome
        );
    }
}

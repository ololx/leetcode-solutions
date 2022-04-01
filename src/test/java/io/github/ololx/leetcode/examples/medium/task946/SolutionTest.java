package io.github.ololx.leetcode.examples.medium.task946;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

    @DataProvider(name = "providesPushedAndPopes")
    public static Object[][] providesPushedAndPopes() {
        return new Object[][] {
                {new int[]{2, 1, 0}, new int[]{1, 2, 0}, true},
                {new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}, true},
                {new int[]{1, 2, 3, 4, 5}, new int[]{4,3,5,1,2}, false}
        };
    }

    @Test(dataProvider = "providesPushedAndPopes")
    public void validateStackSequences_whenPushedCouldBePopped_thenReturnTrue(int[] pushed, int[] popped, boolean expected) {
        assertEquals(new Solution().validateStackSequences(pushed, popped), expected);
    }
}

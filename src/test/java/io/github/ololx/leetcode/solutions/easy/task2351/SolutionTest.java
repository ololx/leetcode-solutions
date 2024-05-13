package io.github.ololx.leetcode.solutions.easy.task2351;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 14.12.2022 12:14
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"abccbaacz", 'c'},
                {"abcdd", 'd'}
        };
    }

    //@LogParam
    @Test(dataProvider = "providesStrings")
    public void repeatedCharacter_whenStringHasRepeatedCharacters_thenReturnFirst(String s,
                                                                                  char expected) {
        assertEquals(new Solution().repeatedCharacter(s), expected);
    }
}

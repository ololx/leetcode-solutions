package io.github.ololx.leetcode.examples.easy.task344;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 25.05.2022 05:18
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesChars")
    public static Object[][] providesChars() {
        return new Object[][] {
                {
                    new char[] {'h', 'e', 'l', 'l', 'o'},
                        new char[] {'o', 'l', 'l', 'e', 'h'}
                },
                {
                    new char[] {'H', 'a', 'n', 'n', 'a', 'h'},
                        new char[] {'h', 'a', 'n', 'n', 'a', 'H'}
                },
        };
    }

    @Test(dataProvider = "providesChars")
    public void reverseString_whenCharsMoreThanOneChar_thenReverseChars(char[] s, char[] expected) {
        new Solution().reverseString(s);

        assertEquals(s, expected);
    }
}

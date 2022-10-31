package io.github.ololx.leetcode.solutions.easy.task371;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * 387. First Unique Character in a String
 *
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 *
 * Example 1:
 * <p>Input: s = "leetcode"
 * Output: 0</p>
 *
 * Example 2:
 * <p>Input: s = "loveleetcode"
 * Output: 2</p>
 *
 * Example 3:
 * <p>Input: s = "aabb"
 * Output: -1</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 10^5
 *      </li>
 *      <li>
 *          s consists of only lowercase English letters.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 10.03.2022 13:43
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNumbers")
    public static Object[][] providesNumbers() {
        return new Object[][] {
                {1, 2, 3},
                {2, 3, 5}
        };
    }

    @Test(dataProvider = "providesNumbers")
    public void getSum_whenNumberIsInInteger_thenReturnSumOf(int a, int b, int sum) {
        assertEquals(new Solution().getSum(a, b), sum);
    }
}

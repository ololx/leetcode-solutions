package io.github.ololx.leetcode.solutions.easy.task83;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.easy.task83.Solution.ListNode;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.logging.Logger;

/**
 * project leetcode-solutions
 * created 09.03.2022 21:41
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(SolutionTest.class.getName());

    @DataProvider(name = "providesListNodes")
    public static Object[][] providesListNodes() {
        return new Object[][] {
                {
                    newInstance(new int[]{1, 1, 2}, 0),
                        newInstance(new int[]{1, 2}, 0)
                },
                {
                    newInstance(new int[]{1, 1, 2, 3, 3}, 0),
                    newInstance(new int[]{1, 2, 3}, 0)
                },
        };
    }

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesListNodes")
    public void deleteDuplicates_whenHeadNodeHasNext_thenReturnNodeWithUniqueValues(ListNode head,
                                                                                    ListNode expected) {
        Assert.assertEquals(new Solution().deleteDuplicates(head), expected);
    }

    private static ListNode newInstance(int[] values, int pos) {
        if (values == null || values.length == 0 || pos >= values.length) {
            return null;
        }

        return new ListNode(values[pos], newInstance(values, pos + 1));
    }
}

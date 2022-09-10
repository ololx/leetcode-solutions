package io.github.ololx.leetcode.solutions.easy.task21;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 13.03.2022 20:54
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(SolutionTest.class.getName());

    @DataProvider(name = "providesListNodes")
    public static Object[][] providesListNodes() {
        return new Object[][] {
                {
                        Solution.ListNode.newInstance(new int[]{1,2,4}),
                        Solution.ListNode.newInstance(new int[]{1,3,4}),
                        Solution.ListNode.newInstance(new int[]{1,1,2,3,4,4})
                },
                {
                        Solution.ListNode.newInstance(new int[]{}),
                        Solution.ListNode.newInstance(new int[]{0}),
                        Solution.ListNode.newInstance(new int[]{0})
                },
        };
    }

    @Test(dataProvider = "providesListNodes")
    public void mergeTwoLists_whenHeadNodeHasNext_thenReturnMergedList(Solution.ListNode first,
                                                                       Solution.ListNode second,
                                                                      Solution.ListNode expected) {
        log.info(String.valueOf(first));
        log.info(String.valueOf(second));
        log.info(String.valueOf(expected));

        Solution.ListNode actual = new Solution().mergeTwoLists(first, second);
        log.info(String.valueOf(actual));

        assertEquals(expected.toString(), actual.toString());
    }
}

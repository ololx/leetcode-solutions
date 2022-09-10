package io.github.ololx.leetcode.solutions.medium.task61;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.logging.Logger;

/**
 * project leetcode-solutions
 * created 11.03.2022 22:30
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(SolutionTest.class.getName());

    @DataProvider(name = "providesListNodes")
    public static Object[][] providesListNodes() {
        return new Object[][] {
                {
                        Solution.ListNode.newInstance(new int[]{1,2,3,4,5}),
                        2,
                        Solution.ListNode.newInstance(new int[]{4,5,1,2,3})
                },
                {
                        Solution.ListNode.newInstance(new int[]{0,1,2}),
                        4,
                        Solution.ListNode.newInstance(new int[]{2,0,1})
                }
        };
    }

    @Test(dataProvider = "providesListNodes")
    public void rotateRight_whenHeadNodeHasNext_thenReturnRotatedList(Solution.ListNode head,
                                                                      int k,
                                                                      Solution.ListNode expected) {
        log.info(String.valueOf(head));
        log.info(String.valueOf(new Solution().rotateRight(head, k)));
    }
}

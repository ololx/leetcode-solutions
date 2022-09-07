package io.github.ololx.leetcode.examples.easy.task141;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 18.07.2022 15:18
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private static Solution.ListNode createNewList(int size, boolean withCycle) {
        int nodeNum = 0;
        Solution.ListNode list = new Solution.ListNode(nodeNum);

        while(++nodeNum < 4) {
            Solution.ListNode node = new Solution.ListNode(nodeNum);
            list.next = node;
            list = list.next;
        }

        if (withCycle) {
            list.next = list;
        }

        return list;
    }

    @DataProvider(name = "providesLists")
    public static Object[][] providesLists() {
        return new Object[][] {
                {createNewList(4, true), true},
                {createNewList(4, false), false},
                {createNewList(2, true), true},
                {createNewList(2, false), false},
                {createNewList(1, false), false},
        };
    }

    @Test(dataProvider = "providesLists")
    public void hasCycle_whenCycleIsPresented_thenReturnTrue(Solution.ListNode list,
                                                            boolean expected) {
        assertEquals(new Solution().hasCycle(list), expected);
    }
}

package io.github.ololx.leetcode.solutions.medium.task173;

import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.*;

/**
 * project leetcode-solutions
 * created 31.12.2022 13:04
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(SolutionTest.class.getName());

    @Test
    public void removeElement_whenElementsWereRemoved_thenReturnCountOfStayingElements() {
        Solution.TreeNode root = new Solution.TreeNode(
                7,
                new Solution.TreeNode(3),
                new Solution.TreeNode(
                        15,
                        new Solution.TreeNode(9),
                        new Solution.TreeNode(20)
                )
        );

        Solution.BSTIterator bSTIterator = new Solution.BSTIterator(root);
        assertEquals(bSTIterator.next(), 3);    // return 3
        assertEquals(bSTIterator.next(), 7);    // return 7
        assertTrue(bSTIterator.hasNext()); // return True
        assertEquals(bSTIterator.next(), 9);    // return 9
        assertTrue(bSTIterator.hasNext()); // return True
        assertEquals(bSTIterator.next(), 15);    // return 15
        assertTrue(bSTIterator.hasNext()); // return True
        assertEquals(bSTIterator.next(), 20);    // return 20
        assertFalse(bSTIterator.hasNext()); // return False
    }
}

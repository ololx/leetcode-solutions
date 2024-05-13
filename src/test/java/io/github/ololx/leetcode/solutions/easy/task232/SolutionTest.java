package io.github.ololx.leetcode.solutions.easy.task232;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * project leetcode-solutions
 * created 11.06.2023 10:40
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @Test(timeOut = 3000L)
    public void testQueueOperations() {
        Solution.MyQueue myQueue = new Solution.MyQueue();

        // Test push operation
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);

        // Test peek operation
        int peekResult = myQueue.peek();
        assertEquals(peekResult, 1);

        // Test pop operation
        int popResult = myQueue.pop();
        assertEquals(popResult, 1);

        // Test empty operation
        boolean emptyResult = myQueue.empty();
        assertFalse(emptyResult);

        // Test pop until the queue becomes empty
        int popResult2 = myQueue.pop();
        int popResult3 = myQueue.pop();
        assertEquals(popResult2, 2);
        assertEquals(popResult3, 3);

        boolean emptyResult2 = myQueue.empty();
        assertTrue(emptyResult2);
    }
}

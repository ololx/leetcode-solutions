package io.github.ololx.leetcode.examples.easy.task155;

import io.github.ololx.leetcode.examples.easy.task155.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 18.05.2022 11:33
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @Test
    public void getMin_whenMinValueExists_thenReturnMinValue() {
        Solution.MinStack minStack = new Solution.MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(minStack.getMin(), -3);
        minStack.pop();
        minStack.top();
        assertEquals(minStack.getMin(), -2);
    }
}

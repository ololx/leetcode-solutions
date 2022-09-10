package io.github.ololx.leetcode.solutions.easy.task225;

import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 05.05.2022 13:27
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(Solution.class.getCanonicalName());

    @Test
    public void push_whenElementWasPushed_thenPopReturnElement() {
        Solution.MyStack stack = new Solution.MyStack();

        int expected = 0;
        while (++expected <= 5) {
            stack.push(expected);
        }

        while (--expected > 0) {
            int actual = stack.pop();
            assertEquals(actual, expected);

            log.info("Expected = " + expected + " & actual = " + actual);
        }
    }
}

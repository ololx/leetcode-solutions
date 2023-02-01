package io.github.ololx.leetcode.solutions.medium.task677;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 01.02.2023 19:56
 * <p>
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @Test
    void lruCacheTest() {
        Solution.MapSum mapSum = new Solution.MapSum();
        mapSum.insert("apple", 3);
        // return 3 (apple = 3)
        assertEquals(mapSum.sum("ap"), 3);
        mapSum.insert("app", 2);
        // return 5 (apple + app = 3 + 2 = 5)
        assertEquals(mapSum.sum("ap"), 5);
    }
}

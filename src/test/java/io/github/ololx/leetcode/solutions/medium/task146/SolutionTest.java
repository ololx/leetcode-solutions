package io.github.ololx.leetcode.solutions.medium.task146;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 30.01.2023 07:52
 * <p>
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @Test
    void lruCacheTest() {
        Solution.LRUCache lRUCache = new Solution.LRUCache(2);
        // cache is {1=1}
        lRUCache.put(1, 1);
        // cache is {1=1, 2=2}
        lRUCache.put(2, 2);

        // return 1
        assertEquals(lRUCache.get(1), 1);

        // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.put(3, 3);

        // returns -1 (not found)
        assertEquals(lRUCache.get(2), -1);

        // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.put(4, 4);

        // return -1 (not found)
        assertEquals(lRUCache.get(1), -1);
        // return 3
        assertEquals(lRUCache.get(3), 3);
        // return 4
        assertEquals(lRUCache.get(4), 4);
    }
}

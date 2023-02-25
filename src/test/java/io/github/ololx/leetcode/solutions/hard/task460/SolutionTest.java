package io.github.ololx.leetcode.solutions.hard.task460;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 25.02.2023 12:30
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @LogParam
    @Test
    public void lfuCache_whenElementIsLFU_thenEvictThiesElement() {
        Solution.LFUCache lfu = new Solution.LFUCache(2);
        lfu.put(1, 1);   // cache=[1,_], cnt(1)=1
        lfu.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
        assertEquals(lfu.get(1), 1);      // return 1
        // cache=[1,2], cnt(2)=1, cnt(1)=2
        lfu.put(3, 3);   // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
        // cache=[3,1], cnt(3)=1, cnt(1)=2
        assertEquals(lfu.get(2), -1);      // return -1 (not found)
        assertEquals(lfu.get(3), 3);      // return 3
        // cache=[3,1], cnt(3)=2, cnt(1)=2
        lfu.put(4, 4);   // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
        // cache=[4,3], cnt(4)=1, cnt(3)=2
        assertEquals(lfu.get(1), -1);      // return -1 (not found)
        assertEquals(lfu.get(3), 3);      // return 3
        // cache=[3,4], cnt(4)=1, cnt(3)=3
        assertEquals(lfu.get(4), 4);      // return 4
        // cache=[4,3], cnt(4)=2, cnt(3)=3
    }
}

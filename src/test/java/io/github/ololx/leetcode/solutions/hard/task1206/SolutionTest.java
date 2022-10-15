package io.github.ololx.leetcode.solutions.hard.task1206;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 27.03.2022 18:38
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @Test
    public void test() {
        Solution.Skiplist skiplist = Solution.newInstance();

        assertEquals(skiplist.search(3), false);

        skiplist.add(5);
        skiplist.add(2);

        assertEquals(skiplist.search(3), false);
        assertEquals(skiplist.search(5), true);

        skiplist.add(13);
        skiplist.add(3);

        assertEquals(skiplist.search(3), true);
        assertEquals(skiplist.search(2), true);
        assertEquals(skiplist.search(13), true);
        assertEquals(skiplist.search(5), true);

        assertEquals(skiplist.erase(3), true);
        assertEquals(skiplist.search(3), false);
        assertEquals(skiplist.search(2), true);
        assertEquals(skiplist.search(13), true);
        assertEquals(skiplist.search(5), true);
    }
}


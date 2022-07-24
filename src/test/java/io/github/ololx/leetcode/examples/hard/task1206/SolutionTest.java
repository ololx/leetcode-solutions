package io.github.ololx.leetcode.examples.hard.task1206;

import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 27.03.2022 18:38
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(SolutionTest.class.getName());

    @Test(enabled = true)
    public void test() {
        Solution.Skiplist skiplist = new Solution.Skiplist();

        skiplist.add(3);
        skiplist.add(2);
        skiplist.add(13);
        skiplist.add(5);

        assertEquals(skiplist.search(3), true);
        assertEquals(skiplist.search(2), true);
        assertEquals(skiplist.search(13), true);
        assertEquals(skiplist.search(5), true);
    }
}

